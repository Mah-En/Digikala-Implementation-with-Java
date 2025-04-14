# Digikala Online Shop Simulator

## 📌 Introduction
This project simulates an e-commerce platform similar to Digikala or Amazon using **JavaFX** for GUI and **MySQL** for database operations. It supports account management, login functionality, browsing products, and shopping cart features.

## 🛠 Technologies Used
- Java (with JavaFX)
- FXML & Scene Builder
- MySQL Database
- MVC Design Pattern

## 🧩 Project Structure
- `Main.java` – App entry point, initializes database and GUI.
- `ConnectDB.java` – Manages database connection and query execution.
- `DigikalaService.java` – Core backend logic: user login, product handling, etc.
- `User.java`, `Admin`, `Seller` – Data models for application users.
- `Login.java`, `Createaccount.java` – GUI controller classes for login and account creation.
- `UserPage.java` – Loads products by category into the interface.

## ✅ Features
- User/Admin/Seller login system
- Account creation and validation
- Product listing by category: Mobile, Laptop, TV, Book, Watch
- Shopping cart and order tracking
- Comment system using MySQL table for product reviews

## 💡 Bonus Implementations
1. JavaFX-based GUI design
2. Product search functionality
3. Comments stored and retrieved from database
4. UUID usage for unique user IDs
5. Sales/order history tracking for sellers

## ⚠ Challenges Faced
- Integrating backend methods with JavaFX components
- Dynamically updating UI with product data
- Handling comment logic and displaying them properly
- Ensuring database operations are correctly executed

## 📂 Sample Code (Database Connection)
```java
public class ConnectDB {
    static private Statement statement;
    public ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
