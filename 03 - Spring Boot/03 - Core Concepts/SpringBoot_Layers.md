# Spring Boot Layered Architecture – Complete Guide

> **Purpose**: This document explains *all layers*, *their responsibilities*, and the *end‑to‑end request flow* in a real‑world Spring Boot application. After understanding this, you should never feel confused about project structure, layers, or responsibilities again.

---

## 1. Why Layered Architecture Exists

Spring Boot follows **Layered Architecture** to achieve:
- Separation of concerns
- Clean, readable, and maintainable code
- Easy testing and debugging
- Scalability for enterprise applications

Each layer has **one clear responsibility**. Mixing responsibilities leads to fragile and unmaintainable systems.

---

## 2. High‑Level Request–Response Flow

```
Client (Frontend / Postman)
        ↓
Controller
        ↓
DTO (Request)
        ↓
Service
        ↓
Repository
        ↓
Database
        ↑
Entity
        ↑
Mapper
        ↑
DTO (Response)
        ↑
Controller
        ↑
Client
```

This flow is **universal** in real‑time Spring Boot applications.

---

## 3. Entity Layer (Database Representation)

### Responsibility
- Represents database tables
- Defines persistence structure
- Used only by Repository layer

### Key Rules
- Must not be exposed to Controller
- Must not be returned in API responses
- Changes affect database schema

### Example
```java
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
}
```

> **Entity = Database truth**

---

## 4. DTO Layer (Data Transfer Object)

### Why DTO is Mandatory
- Prevents exposing sensitive fields
- Decouples API from database schema
- Allows independent evolution of Entity and API

### Types of DTOs
- Request DTO (input)
- Response DTO (output)
- Internal DTO (service‑to‑service)

### Example
```java
public class UserRequestDto {
    private String name;
    private String email;
}

public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
}
```

> **DTO = Safe data boundary**

---

## 5. Controller Layer (HTTP Entry Point)

### Responsibility
- Handles HTTP requests and responses
- Maps URLs and HTTP methods
- Delegates work to Service layer

### What Controller Should NOT Do
- Business logic
- Database access
- Mapping logic

### Example
```java
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(
            @RequestBody UserRequestDto dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }
}
```

> **Controller should be thin and simple**

---

## 6. Service Layer (Business Logic)

### Responsibility
- Contains business rules
- Coordinates multiple repositories
- Handles transactions

### Best Practice
- Use interface + implementation

### Example
```java
public interface UserService {
    UserResponseDto createUser(UserRequestDto dto);
}
```

```java
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        // validation
        // business rules
        // repository calls
        return responseDto;
    }
}
```

> **Service = Brain of the application**

---

## 7. Repository Layer (Data Access)

### Responsibility
- Communicates with database
- Executes CRUD and queries
- Uses Entity objects

### Rules
- No business logic
- No DTO usage

### Example
```java
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
```

> **Repository = Database gateway**

---

## 8. Mapper Layer (Entity ↔ DTO Conversion)

### Why Mapper Exists
- Entity and DTO serve different purposes
- Prevents mixing conversion logic in service/controller

### Example
```java
public class UserMapper {
    public static User toEntity(UserRequestDto dto) {
        return new User(dto.getName(), dto.getEmail());
    }

    public static UserResponseDto toDto(User user) {
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail());
    }
}
```

> **Mapper keeps layers clean**

---

## 9. Exception Layer (Global Error Handling)

### Responsibility
- Centralized error handling
- Clean API error responses
- Avoids repetitive try‑catch

### Example
```java
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound() {
        return ResponseEntity.badRequest().body("Resource not found");
    }
}
```

> **Throw exception in Service, handle globally**

---

## 10. Configuration Layer

### Responsibility
- Application‑wide beans
- CORS, Swagger, ModelMapper

### Example
```java
@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
```

---

## 11. Security Layer (Production Applications)

### Responsibility
- Authentication & Authorization
- JWT filters
- Role‑based access control

### Important Note
Security intercepts **before controller execution**.

---

## 12. Recommended Package Structure

```
com.company.project
│
├── controller
├── dto
│   ├── request
│   └── response
├── service
│   └── impl
├── repository
├── entity
├── mapper
├── exception
├── config
├── security
├── util
```

---

## 13. Layer Responsibility Summary

| Layer | Responsibility |
|-----|---------------|
| Controller | HTTP handling |
| DTO | Data transfer |
| Service | Business logic |
| Repository | DB access |
| Entity | DB mapping |
| Mapper | Conversion |
| Exception | Error handling |
| Config | Global setup |
| Security | Access control |

---

## 14. Golden Rules (Never Break These)

1. Controller → Service → Repository (always)
2. Never expose Entity to Controller
3. Business logic only in Service
4. Use DTOs for all APIs
5. Centralize exception handling

---

## 15. Final Interview‑Ready Statement

> "Spring Boot applications follow layered architecture where Controllers handle HTTP, DTOs manage data transfer, Services contain business logic, Repositories manage persistence, Entities represent database tables, and cross‑cutting concerns like Exception handling, Configuration, and Security are handled separately."

---

