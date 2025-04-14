package com.example.digikala;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserPage {
    @FXML
    private VBox Mobiles=new VBox();
    @FXML
    private VBox Laptops=new VBox();
    @FXML
    private VBox TVs=new VBox();
    @FXML
    private VBox Books=new VBox();
    @FXML
    private VBox Watches=new VBox();
    private String username;
    private String password;
    private User Curuser;

    public UserPage() {
        try{
            ResultSet resultSet=(Main.DB.query("select * from products where Category = 'Mobile'"));
            while (resultSet.next()) {
                String name=resultSet.getString("Name");
                double price=Double.parseDouble(resultSet.getString("Price"));
                int quantity=Integer.parseInt(resultSet.getString("Quantity"));
                String category="Mobile";
                showMobiles(name,price,quantity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            ResultSet resultSet=(Main.DB.query("select * from products where Category = 'Laptop'"));
            while (resultSet.next()) {
                String name=resultSet.getString("Name");
                double price=Double.parseDouble(resultSet.getString("Price"));
                int quantity=Integer.parseInt(resultSet.getString("Quantity"));
                String category="Laptop";
                showLaptops(name,price,quantity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            ResultSet resultSet=(Main.DB.query("select * from products where Category = 'TV'"));
            while (resultSet.next()) {
                String name=resultSet.getString("Name");
                double price=Double.parseDouble(resultSet.getString("Price"));
                int quantity=Integer.parseInt(resultSet.getString("Quantity"));
                String category="TV";
                showTVs(name,price,quantity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            ResultSet resultSet=(Main.DB.query("select * from products where Category = 'Book'"));
            while (resultSet.next()) {
                String name=resultSet.getString("Name");
                double price=Double.parseDouble(resultSet.getString("Price"));
                int quantity=Integer.parseInt(resultSet.getString("Quantity"));
                String category="Book";
                showBooks(name,price,quantity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            ResultSet resultSet=(Main.DB.query("select * from products where Category = 'Watch'"));
            while (resultSet.next()) {
                String name=resultSet.getString("Name");
                double price=Double.parseDouble(resultSet.getString("Price"));
                int quantity=Integer.parseInt(resultSet.getString("Quantity"));
                String category="Watch";
                showWatches(name,price,quantity);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showMobiles(String name, double price, int quantity) throws IOException {
        try {
            Label nameLabel = new Label("Name: " + name);
            Label priceLabel = new Label("Price: " + Double.toString(price));
            Label quantityLabel = new Label("Quantity: " + Integer.toString(quantity));
            Mobiles.getChildren().addAll(nameLabel, priceLabel, quantityLabel);
            Mobiles.isResizable();
            Product product=new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory("Mobile");
            DigikalaService.addProduct(product);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showLaptops(String name,double price,int quantity) throws IOException {
        try {
            Label nameLabel = new Label("Name: " + name);
            Label priceLabel = new Label("Price: " + Double.toString(price));
            Label quantityLabel = new Label("Quantity: " + Integer.toString(quantity));
            Laptops.getChildren().addAll(nameLabel, priceLabel, quantityLabel);
            Laptops.isResizable();
            Product product=new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory("Laptop");
            DigikalaService.addProduct(product);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showTVs(String name,double price,int quantity) throws IOException {
        try {
            Label nameLabel = new Label("Name: " + name);
            Label priceLabel = new Label("Price: " + Double.toString(price));
            Label quantityLabel = new Label("Quantity: " + Integer.toString(quantity));
            TVs.getChildren().addAll(nameLabel, priceLabel, quantityLabel);
            TVs.isResizable();
            Product product=new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory("TV");
            DigikalaService.addProduct(product);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showBooks(String name,double price,int quantity) throws IOException {
        try {
            Label nameLabel = new Label("Name: " + name);
            Label priceLabel = new Label("Price: " + Double.toString(price));
            Label quantityLabel = new Label("Quantity: " + Integer.toString(quantity));
            Books.getChildren().addAll(nameLabel, priceLabel, quantityLabel);
            Books.isResizable();
            Product product=new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory("Book");
            DigikalaService.addProduct(product);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void showWatches(String name,double price,int quantity) throws IOException {
        try {
            Label nameLabel = new Label("Name: " + name);
            Label priceLabel = new Label("Price: " + Double.toString(price));
            Label quantityLabel = new Label("Quantity: " + Integer.toString(quantity));
            Watches.getChildren().addAll(nameLabel, priceLabel, quantityLabel);
            Watches.isResizable();
            Product product=new Product();
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory("Watch");
            DigikalaService.addProduct(product);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
