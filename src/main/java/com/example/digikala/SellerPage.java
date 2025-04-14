package com.example.digikala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SellerPage {
    @FXML
    private TextField name;
    @FXML
    private TextField price;
    @FXML
    private TextField quantity;
    @FXML
    private TextField category;
    @FXML
    private Label label;
    public void AddProduct(ActionEvent event) throws IOException {
        String Name=name.getText();
        double Price=Double.parseDouble(price.getText());
        int Quantity=Integer.parseInt(quantity.getText());
        String Category=category.getText();
        Product product=new Product();
        product.setName(Name);
        product.setPrice(Price);
        product.setQuantity(Quantity);
        product.setCategory(Category);
        DigikalaService.addProduct(product);
        label.setText("Done!");
    }
}