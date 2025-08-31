# TODO App

A full-stack **To-Do application** built with **React**, **Spring Boot**, and **PostgreSQL**. Seamlessly combine a modern frontend with a robust backend for a smooth and reliable task-management experience.

---

##  Table of Contents

- [Overview](#overview)  
- [Features](#features)  
- [Tech Stack](#tech-stack)  
- [Getting Started](#getting-started)  
  - [Prerequisites](#prerequisites)  
  - [Installation & Setup](#installation--setup)  
- [Usage](#usage)  
- [Environment Variables](#environment-variables)  
- [Contributing](#contributing)  
- [License](#license)  
- [Contact](#contact)

---

## Overview

This application provides a simple yet elegant interface to manage tasks. The frontend is built using React, while the backend leverages Spring Boot, with data stored in PostgreSQL. It’s ideal for personal use or as a foundation for further enhancements.

---

## Features

- **Create**, **Read**, **Update**, **Delete** tasks  
- Persistent task storage via **PostgreSQL**  
- RESTful backend powered by **Spring Boot**  
- Responsive and dynamic interface thanks to **React**

---

## Tech Stack

| Layer       | Technology                                 |
|-------------|--------------------------------------------|
| Frontend    | React                                      |
| Backend     | Spring Boot                                |
| Database    | PostgreSQL                                 |
| Build Tool  | Gradle (wrapper included in project)       |
| Languages   | Java (backend), JavaScript (frontend), HTML |

---

## Getting Started

### Prerequisites

Ensure you have the following installed on your system:

- Git  
- Node.js and npm/yarn  
- Java Development Kit (JDK) 17+  
- PostgreSQL (and access to create a database and user)

### Installation & Setup

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Vasutamizh/todoApp.git
   cd todoApp

2. **Backend setup (Spring Boot)**

Open the project in your IDE (IDE will sync the gradle changes automatically or else you need to do by yourself).

Configure PostgreSQL database—create a database (e.g., todo_db) and a user with access.

3. **Edit -> project/src/main/resources/application.properties**

SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/todo_db
SPRING_DATASOURCE_USERNAME=your_db_user
SPRING_DATASOURCE_PASSWORD=your_password

(Striclty first time only)
spring.jpa.hibernate.ddl-auto=create

On the very next time change this line into  
spring.jpa.hibernate.ddl-auto=update

3. **Run the Application**

**End**
