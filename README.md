# 📘 Isoko ry'Ubumenyi

Isoko ry'Ubumenyi is a learning management platform built with **Spring Boot**.  
It provides a foundation for managing courses, instructors, and student assignments in a structured way.  

---

## 🚀 Features

- **Course Management**  
  - Create and manage courses  
  - Assign instructors to courses  

- **Assignment Management**  
  - Add assignments to courses  
  - Track assignment details (title, description, due date)  

- **User Management**  
  - Support for instructors and students  

- **Database Integration**  
  - PostgreSQL support (default)  
  - Configurable via `.env` file  

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot 3.x, Spring Data JPA, Hibernate  
- **Database:** PostgreSQL (default)  
- **Build Tool:** Maven  
- **Other:** Lombok, HikariCP, Spring DevTools  

---

## ⚙️ Setup & Installation

### 1. Clone the repository
```bash
git clone https://github.com/your-username/isoko-ry-ubumenyi.git
cd isoko-ry-ubumenyi

📂 Project Structure
isoko-ry-ubumenyi
 ┣ src/main/java/rw/isoko/isoko_ry_ubumenyi
 ┃ ┣ controller/     # REST controllers
 ┃ ┣ model/          # JPA entities (Course, Assignment, User)
 ┃ ┣ repository/     # Spring Data JPA repositories
 ┃ ┗ service/        # Business logic services
 ┗ src/main/resources
    ┣ application.properties
    ┗ static/

🤝 Contributing

Contributions are welcome!

Fork the repo

Create a new branch (git checkout -b feature-name)

Commit changes (git commit -m "Add feature")

Push to branch (git push origin feature-name)

Open a Pull Request
