# University Management System (Java)

## Overview

This project is a **University Management System** built using **Java and Object-Oriented Programming (OOP)** concepts.
It is designed to simulate a basic university structure including **students, employees, academic departments, and course management**.

The system also includes features such as **user signup, login, and automatic hall ticket number generation**.

This project was developed as a **learning exercise for practicing Java OOP concepts**.

---

## Features

* Student management
* Employee management
* Academic structure (Departments, Courses, Semesters)
* User signup system
* Unique hall ticket number generation
* Login system
* Use of Java interfaces
* Input validation
* Organized package structure

---

## Project Structure

```
University-Management-System-Java
│
├── Employee
│   ├── AdministrativeStaff
│   ├── SupportStaff
│   ├── TeachingStaff
│   └── TechnicalStaff
│
├── student
│   ├── Student
│   ├── UndergraduateStudent
│   └── PostgraduateStudent
│
├── academic
│   ├── Course
│   ├── Department
│   ├── Enrollment
│   └── Semester
│
├── interfaces
│   ├── Enrollable
│   ├── Identifiable
│   ├── Payable
│   └── Teachable
│
├── Person.java
├── SignUp.java
├── LogIn.java
├── Menu.java
└── Main.java
```

---

## Concepts Used

This project demonstrates several **core Java concepts**:

* Object-Oriented Programming (OOP)
* Inheritance
* Encapsulation
* Interfaces
* Java Collections (`LinkedList`)
* Random number generation
* Input validation
* Package organization

---

## Example Feature

### Hall Ticket Number Generation

During signup, the system automatically generates a **unique hall ticket number** using Java's `Random` class and stores it in a `LinkedList` to prevent duplicates.

---

## Requirements

* Java JDK 17 or later
* Any Java IDE (VS Code, IntelliJ, Eclipse)

---

## How to Run

1. Clone the repository:

```
git clone https://github.com/sankeesamanoj/University-Management-System-Java.git
```

2. Open the project in your IDE.

3. Compile and run:

```
Main.java
```

---

## Author

**Manoj Sankeesa**
B.Tech Electronics and Communication Engineering
Nalla Malla Reddy Engineering College

---

## Purpose of the Project

This project was created to **practice Java programming and understand object-oriented design by modeling a real-world university system**.
