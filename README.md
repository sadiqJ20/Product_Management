# 🛍️ Product Management System  
A complete Spring Boot CRUD application with image upload, validation, and MySQL integration.

---

## 🚀 Features

- Create, read, update, and delete products  
- Upload and store product images  
- Server-side validation using DTO + @Valid  
- Image storage using Java NIO (Path, Files, InputStream)  
- ORM using Hibernate + JPA  
- Thymeleaf HTML templates  
- Auto-generated SQL using `JpaRepository`

---

## 🏗️ Architecture

- **Controller Layer** – Handles requests, validation, and form submission  
- **DTO Layer** – Validates form data (name, price, category, image, etc.)  
- **Entity Layer** – Maps data to database table using Hibernate  
- **Repository Layer** – Extends `JpaRepository` for CRUD  
- **View Layer** – Thymeleaf templates for UI  

---

## 📂 Folder Structure

```
src/main/java/com/cartApplication/bestStore
│
├── controllers/
│     └── ProductsController.java
│
├── models/
│     ├── Product.java
│     ├── ProductDto.java
│
├── services/
│     └── ProductsRepository.java
│
└── resources/templates/products/
       ├── index.html
       ├── create.html
       └── edit.html
```

---

## 📸 Image Upload Flow
1. User uploads image  
2. Spring Boot reads file as `MultipartFile`  
3. Convert to `InputStream`  
4. Save to `/public/images/` with a unique filename  
5. Save filename inside MySQL DB  

---

## 💾 Database Table Example

| Field            | Type      |
|-----------------|-----------|
| id              | INT (PK)  |
| name            | VARCHAR   |
| brand           | VARCHAR   |
| category        | VARCHAR   |
| price           | VARCHAR   |
| description     | TEXT      |
| created_at      | DATETIME  |
| image_file_name | VARCHAR   |

---

## ▶️ Run the Project

```bash
mvn spring-boot:run
```

---

## ❤️ Contributing  
Pull requests are welcome!

---

## 📜 License  
MIT License

