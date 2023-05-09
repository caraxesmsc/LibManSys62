package com.project.libmansys9may;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void logout(ActionEvent event) throws IOException {
         root =  FXMLLoader.load(getClass().getResource("hello-view.fxml"));
         stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
         stage.setScene(scene);
         stage.show();
    }
    public void login(ActionEvent event) throws IOException{
        root =  FXMLLoader.load(getClass().getResource("AdminOptions.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void addUser2(ActionEvent event) throws IOException{
        root =  FXMLLoader.load(getClass().getResource("C:\\Users\\mdzhs\\IdeaProjects\\LibManSys9MAY\\src\\main\\resources\\com\\project\\libmansys9may\\addUser.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}