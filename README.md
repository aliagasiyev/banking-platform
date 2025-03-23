# 🏦 Spring Boot Microservice Banking Platform

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge)
![Docker Compose](https://img.shields.io/badge/Docker%20Compose-Latest-blueviolet?style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue?style=for-the-badge)
![Liquibase](https://img.shields.io/badge/Liquibase-4.29.2-lightgrey?style=for-the-badge)
![Gradle](https://img.shields.io/badge/Gradle-8.x-blue?style=for-the-badge)

A modular and containerized banking microservice platform built with **Spring Boot**, **PostgreSQL**, **Liquibase**, and **Docker Compose**.

---

## 📦 Tech Stack

- **Spring Boot 3.4.4**
- **Java 17**
- **PostgreSQL 15**
- **Liquibase 4.29.2**
- **Gradle 8+**
- **Docker & Docker Compose**

---

## 🧩 Microservices

| Service     | Description                         |
|-------------|-------------------------------------|
| `users-ms`  | Handles user registration & storage |
| `loans-ms`  | Manages loans and loan data         |
| `cards-ms`  | (Planned) Handles card operations   |
| `common`    | Shared models (DTOs, Entities, etc) |

---

## 🚀 Features

✅ Microservice-based architecture  
✅ Separate PostgreSQL database for each service  
✅ Liquibase for database schema versioning  
✅ `init.sql` for auto-creation of databases  
✅ Dockerized environment  
✅ One-command startup with Docker Compose

---

## 📁 Project Structure

```
banking-platform/
├── users-ms/
├── loans-ms/
├── cards-ms/
├── common/
├── docker/
│   └── db/
│       └── init.sql
└── docker-compose.yml
```

---

## 🛠️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/banking-platform.git
cd banking-platform
```

### 2. Run with Docker Compose

```bash
docker-compose up --build
```

This will:
- Start PostgreSQL container
- Automatically create `users-ms`, `loans-ms`, and `cards-ms` databases using `init.sql`
- Build and start all services
- Apply Liquibase migrations to each database

---

## 🧪 Verify Database Setup

### Access PostgreSQL CLI

```bash
docker exec -it postgres psql -U postgres
```

### Check databases and tables

```sql
\l           -- list all databases
\c users-ms  -- connect to users-ms
\dt          -- list tables in schema
```
