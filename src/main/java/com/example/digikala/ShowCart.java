package com.example.digikala;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Pair;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ShowCart {
    @FXML
    private AnchorPane Cartpane=new AnchorPane();
    private static String Username;
    public String getUsername() {
        return Username;
    }
    public static void setUsername(String username) {
        Username = username;
    }
    public ShowCart() throws InvocationTargetException {
        ArrayList<Pair<Product,Integer>> cart=new ArrayList<>();
        cart=DigikalaService.searchuser(Username).getCart();
        Label lbl=new Label();
        for(Pair<Product,Integer>temp : cart){
            lbl.setText(temp.getKey().getName());
            Cartpane.getChildren().add(lbl);
        }
    }
}
