<img width="1280" height="61" alt="Screenshot 2026-07-14 at 1 34 01 AM" src="https://github.com/user-attachments/assets/b39b332c-a513-425c-8d9e-0acc38f31181" /># Employee Management System (JDBC)

A simple Java console application that performs CRUD (Create, Read, Update, Delete) operations on an Employee database using JDBC and PostgreSQL.

## Features

- Add Employee
- View All Employees
- Update Employee Details
- Delete Employee
- JDBC Connectivity
- PostgreSQL Database
- Maven Project Structure

## Technologies Used

- Java
- JDBC
- PostgreSQL
- Maven
- Eclipse IDE

## Project Structure

```
DataBridge
│── src
│   └── main
│       ├── java
│       │   └── com.databridge
│       │       ├── DBConnection.java
│       │       ├── Employee.java
│       │       ├── EmployeeDAO.java
│       │       └── MainApp.java
│       └── resources
│
├── pom.xml
└── README.md
```

## Database Setup

Create the database:

```sql
CREATE DATABASE employeejdbc;
```


<img src= "Screenshot 2026-07-14 at 1.34.01 AM.png" width="700" alt="Project Output">

Connect to the database:

```sql
\c employeejdbc
```

Create the employee table:

```sql
CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE PRECISION
);
```

## Configure Database Connection

Update your database credentials in `DBConnection.java`.

```java
String url = "jdbc:postgresql://localhost:5432/employeejdbc";
String user = "postgres";
String password = "your_password";
```

## Running the Project

1. Clone the repository

```bash
git clone https://github.com/your-username/DataBridge.git
```

2. Open the project in Eclipse.

3. Update the PostgreSQL username and password.

4. Run `MainApp.java`.

## Sample Output

```
Employee Added Successfully

ID : 1
Name : Anjali
Salary : 85000

Employee Updated Successfully

Employee Deleted Successfully
```

## Future Improvements

- Search Employee by ID
- Search Employee by Name
- Menu-driven console application
- Input validation
- Exception handling
- Logging

## Author

Anjali Yadav
