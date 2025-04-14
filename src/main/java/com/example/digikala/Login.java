package com.example.digikala;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button checkUser;
    @FXML
    private Button checkAdmin;
    @FXML
    private Button checkSeller;
    @FXML
    private TextField userField;
    @FXML
    private PasswordField PassField;
    @FXML
    private Label LoginResult;
    @FXML
    private Label Create;
    public void LoginUser(ActionEvent event) throws IOException {
        String username, password;
        username = userField.getText().toString();
        password = PassField.getText().toString();
        String result = DigikalaService.loginUser(username, password);
        if (result.equals("ok")) {
            LoginResult.setText("Welcome " + username);
            LoginResult.setTextFill(Color.color(0, 0.5, 0));
            root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (result.equals("wrong password")) {
            LoginResult.setText("Wrong password");
            LoginResult.setTextFill(Color.color(0.5, 0, 0));
        }
        if (result.equals("no such user")) {
            LoginResult.setText("No such User");
            LoginResult.setTextFill(Color.color(0.6, 0, 0));
        }
    }
    public void LoginAdmin(ActionEvent event) throws IOException {
        String username, password;
        username = userField.getText().toString();
        password = PassField.getText().toString();
        String result = DigikalaService.loginAdmin(username, password);
        if (result.equals("ok")) {
            LoginResult.setText("Welcome " + username);
            LoginResult.setTextFill(Color.color(0, 0.5, 0));
            root = FXMLLoader.load(getClass().getResource("AdminPage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (result.equals("wrong password")) {
            LoginResult.setText("Wrong password");
            LoginResult.setTextFill(Color.color(0.5, 0, 0));
        }
        if (result.equals("no such admin")) {
            LoginResult.setText("No such admin");
            LoginResult.setTextFill(Color.color(0.6, 0, 0));
        }
    }
    public void LoginSeller(ActionEvent event) throws IOException {
        String username, password;
        username = userField.getText().toString();
        password = PassField.getText().toString();
        String result = DigikalaService.loginSeller(username, password);
        if (result.equals("ok")) {
            LoginResult.setText("Welcome " + username);
            LoginResult.setTextFill(Color.color(0, 0.5, 0));
            root = FXMLLoader.load(getClass().getResource("SellerPage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (result.equals("wrong password")) {
            LoginResult.setText("Wrong password");
            LoginResult.setTextFill(Color.color(0.5, 0, 0));
        }
        if (result.equals("no such seller")) {
            LoginResult.setText("No such seller");
            LoginResult.setTextFill(Color.color(0.6, 0, 0));
        }
    }
    @FXML
    public void Create() throws IOException{
        root = FXMLLoader.load(getClass().getResource("Createaccount.fxml"));
        stage = (Stage) Create.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
