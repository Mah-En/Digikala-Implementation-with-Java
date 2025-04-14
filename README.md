# Digikala Online Shop Simulator

---

## Introduction

This solo project replicates the core functionalities of an online shopping application similar to Digikala or Amazon. Users can browse products, register and log into their accounts, add items to a cart, and place orders. Admins and sellers have their own login flows. The application is built in Java using JavaFX for the graphical user interface and MySQL for backend data persistence.

---

## Technologies Used

- Java (JavaFX)
- FXML (for layout via Scene Builder)
- MySQL (JDBC for connectivity)
- MVC pattern (Model-View-Controller)
- UUID for unique user IDs

---

## Features

- **Multi-role Authentication**: Login system for users, sellers, and admins
- **Account Creation**: Users can sign up and are stored with unique UUIDs
- **Product Browsing**: Items categorized into Mobiles, Laptops, TVs, Books, and Watches
- **Cart & Orders**: Add products to cart and track order history
- **Comment System**: Users can add and view comments tied to product IDs
- **Search Functionality**: Search for products by name
- **Persistent Storage**: Products and users are stored in a MySQL database

---

## Database Integration

The app connects to a MySQL database using JDBC. Tables are used to store users, products, and comments. The application performs SQL queries to retrieve categorized product data and displays it in the GUI using JavaFX components like `VBox` and `Label`.

---

## Code Example

The following snippet initializes a database connection and executes a sample query:

```java
public class ConnectDB {
    static private Statement statement;
    public ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc", "root", "12345678");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products WHERE Category = 'Mobile'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ResultSet query(String sql){
        try {
            return statement.executeQuery(sql);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
```

---

## Challenges Faced

- Integrating frontend FXML with backend controller logic
- Dynamically rendering data from SQL queries into JavaFX UI
- Initial difficulties in showing product lists in JavaFX containers
- Designing a system for storing and retrieving product-specific comments
- Ensuring correct role-based login flows for different user types

---

## Bonus Tasks Implemented

1. GUI design using JavaFX and Scene Builder  
2. Commenting system with a relational database table  
3. Product search functionality  
4. Data persistence using JDBC and MySQL  
5. History of sales and transactions  
6. UUID-based user identification

---

## UML Diagram

![UML Diagram](https://user-images.githubusercontent.com/77670851/233021163-aefede7d-4b6b-46c2-adec-69278649ed7e.png)

---

## Resources

- [JavaFX Course on YouTube](https://youtu.be/9XJicRt_FaI)  
- [MySQL Database Course](https://www.youtube.com/watch?v=lz3HilC2bDs&list=PLTfxx5t6obt-fvAmlpoy6bgwFNkBRFSSP&index=1)

---

## Conclusion

The Digikala Shop Simulator project demonstrates how a desktop application can simulate e-commerce functionality using JavaFX and MySQL. It includes a working GUI, database integration, and all major user flow logic — making it a great foundational project for full-stack desktop development.

---
