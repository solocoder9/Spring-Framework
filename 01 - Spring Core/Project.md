# 🎓 Student Management Console – Spring Core Project

**GitHub Repo**: [StudentMgmtConsol-SpringCore-CRUD](https://github.com/solocoder9/StudentMgmtConsol-SpringCore-CRUD)

---

## 📋 Project Summary

**Student Management Console** is a Java-based console application built using **Spring Core**, **Spring ORM (Hibernate)**, and **MySQL**.  
It allows users to perform full **CRUD** (Create, Read, Update, Delete) operations on student records through a simple and interactive command-line interface.

---

## 🌟 Features

- ✅ **Add Student** – Create new records with name, age, and grade  
- 📄 **View All Students** – Display all student records  
- 🔍 **View Student by ID** – Retrieve detailed information of a specific student  
- ✏️ **Update Student** – Modify existing student details  
- 🗑️ **Delete Student** – Remove a student record by ID  
- 🛢️ **Database Integration** – Uses Hibernate to connect to MySQL (`student_mgmt_db`)  
- 🖥️ **Console Interface** – User-friendly, menu-driven console navigation  

---

## 💻 Technologies Used

- Java  
- Spring Core  
- Spring ORM (Hibernate)  
- MySQL  
- Eclipse IDE  
- Maven  

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/solocoder9/StudentMgmtConsol-SpringCore-CRUD.git
```

### 2. Import Project into Eclipse
- Open **Eclipse**
- Go to **File > Import > Existing Maven Projects**
- Browse and select the cloned project folder
- Click **Finish**

### 3. Configure MySQL
- Start the MySQL server
- Create the database:
```sql
CREATE DATABASE student_mgmt_db;
```

### 4. Update Hibernate Configuration
- Open `hibernate.cfg.xml`
- Set your:
  - Database URL
  - Username
  - Password

### 5. Run the Application
- Right-click the main class (`MainApp.java` or equivalent)
- Choose **Run As > Java Application**

---

## 🚀 Usage

After running the application, a **console menu** will appear with options to manage students.  

**Available operations:**
1. Add a new student  
2. View all students  
3. View a specific student by ID  
4. Update a student record  
5. Delete a student  

👉 Follow the input prompts accordingly.

---

## 📄 License

This project is licensed under the **MIT License**.  
See the [LICENSE](LICENSE) file for details.
