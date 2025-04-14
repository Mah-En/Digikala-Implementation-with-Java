package com.example.digikala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Createaccount {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField UsernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label CreateResult;
    @FXML
    private Button Login;
    public void CreateOn(ActionEvent event) throws IOException {
        String username, password;
        username = UsernameField.getText().toString();
        password = passwordField.getText().toString();
        boolean exist = false;
        for (User u : DigikalaService.getUsers()) {
            if (u.getUsername().equals(username)) {
                exist = true;
            }
        }
        if (exist) {
            CreateResult.setText("This username already exists.");
            CreateResult.setTextFill(Color.color(0.7, 0, 0));
        } else {
            DigikalaService.createAccount(username, password);
            CreateResult.setText("Account created successfully!");
            CreateResult.setTextFill(Color.color(0, 0.7, 0));
        }
    }
    @FXML
    public void LoginOn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) Login.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
