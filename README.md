# JDBC Console CRUD Application

A simple layered **JDBC Console-Based CRUD Application** built using Java and MySQL.  
This project demonstrates clean architecture, DAO pattern usage, and proper JDBC handling using try-with-resources.

---

## 📌 Project Status

Current Completion: **Create + Read Implemented**

| Operation | Status |
|-----------|--------|
| Create    | ✅ Implemented |
| Read      | ✅ Implemented |
| Update    | ⏳ Pending |
| Delete    | ⏳ Pending |

---

## 🏗️ Project Architecture

The project follows a clean layered architecture:

```
model      → Student (POJO)
dao        → StudentDAO (Database Operations)
util       → DBConnection (Connection Utility)
app        → StudentApp (Menu & User Interaction)
main       → Main (Entry Point)
```

### Architecture Flow

```
Main → StudentApp → StudentDAO → DBConnection → MySQL Database
```

---

## 🛠️ Technologies Used

- Java (Core + JDBC)
- MySQL
- MySQL Connector/J (Type 4 Driver)
- Console-based UI

---

## 🗄️ Database Setup

Database Table: `jdbc_learning`

```sql
CREATE TABLE jdbc_learning (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    marks DOUBLE
);
```

---

## ✅ Features Implemented

### 1️⃣ Insert Student (Create)
- Takes name and marks input
- Uses PreparedStatement
- Auto-increment ID handled by database

### 2️⃣ View All Students (Read)
- Fetches all records from database
- Uses ResultSet
- Displays data in console

---

## 🔐 JDBC Concepts Covered

- JDBC Architecture
- DriverManager
- Connection
- PreparedStatement
- ResultSet
- Try-With-Resources
- Exception Handling (Stack Trace Enabled)
- DAO Pattern (Basic Implementation)
- Layered Architecture

---

## 🔄 Pending Enhancements

- Update Student
- Delete Student
- Search by ID
- Transaction Management
- Batch Processing
- Connection Pooling
- Advanced Exception Strategy
- Production-level structuring

---

## ▶ How to Run

1. Install MySQL and create the table.
2. Add MySQL Connector/J dependency.
3. Configure DB credentials inside `DBConnection`.
4. Run `Main.java`.
5. Use console menu to perform operations.

---

## 🎯 Learning Objective

This project is designed to:

- Understand how JDBC works internally
- Implement clean separation of concerns
- Practice CRUD operations using DAO pattern
- Build industry-style structured backend logic

---

🚀 Next Milestone: Implement Update & Delete operations to complete full CRUD.
