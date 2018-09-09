package view;

import database.UserDataBase;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScene extends Scene {
    private Button addUserB, loginB;
    private javafx.scene.control.Label userLabel, passLabel;
    private TextField userInput, passInput;
    UserDataBase database;
    GridPane grid;

    public LoginScene() {
        super(new GridPane(),500,500);
        database = new UserDataBase();
        grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);


        //Username label
        this.userLabel = new javafx.scene.control.Label("Username:");
        GridPane.setConstraints(userLabel,0,0);

        // Username input
        this.userInput = new javafx.scene.control.TextField();
        userInput.setPromptText("Username");
        GridPane.setConstraints(userInput,1,0);

        // Password label
        this.passLabel = new javafx.scene.control.Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        // Password input
        this.passInput = new javafx.scene.control.TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput,1,1);

        loginB = new javafx.scene.control.Button("Login");
        loginB.setOnAction(e -> {
            database.loginAttempt(userInput.getText(), passInput.getText());
        });
        GridPane.setConstraints(loginB,1,2);

        addUserB = new Button("Add User");
        addUserB.setOnAction(e -> {
            database.checkForUsername(userInput.getText());
            database.addUser(userInput.getText(), passInput.getText());
        });
        GridPane.setConstraints(addUserB,2,0);

        grid.getChildren().addAll(userLabel, userInput, passLabel, passInput, loginB, addUserB);
    }

    public Pane getPane(){
        System.out.println("inside");
        return this.grid;
    }
}
