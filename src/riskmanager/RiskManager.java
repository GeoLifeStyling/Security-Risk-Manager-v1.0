package riskmanager;

import database.UserDataBase;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.AlertBox;
import view.ConfirmBox;
import view.LoginScene;


public class RiskManager extends Application {
    Stage window;
    Scene loginScene, newUserScene, clientInterface;
    UserDataBase database;

    @Override
    public void start(Stage window) throws Exception {
        database = new UserDataBase();

        this.window = window;
        window.setTitle("Security Risk Manager v1.0");

        loginScene = new Scene(new LoginScene().getPane(),500,500);
        window.setScene(loginScene);
        window.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}

/*
        this.newUserB = new Button("Add new User");
        newUserB.setOnAction(e -> {
            boolean result = ConfirmBox.display("Are You Sure", "Want send stuff");
            System.out.println(result);
            //window.setScene(newUserScene);
        });

        // Layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(userName, newUserB);
        loginScene = new Scene(layout1,300,300);

        // Button 2
        this.goToLogin = new Button("Go to Login");
        goToLogin.setOnAction(e -> {
            AlertBox.display("Exit new user page", "Do you want to leave page?");
            window.setScene(loginScene);
        });
 */