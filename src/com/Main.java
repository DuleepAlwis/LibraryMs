package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("com.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        this.stage = primaryStage;
        //mainWindow(primaryStage);
        try {
            Parent parent = FXMLLoader.load(this.getClass().getResource("fxview/Home.fxml"));

            Scene scene = new Scene(parent);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Library Management System");
            primaryStage.setResizable(true);
            //primaryStage.getIcons().add(new Image("/lk/pos/thogakade/accets/icons8_Apple_28px.png"));
            primaryStage.show();
        }
        catch (IOException ex)
        {
            //ex.printStackTrace();
            System.out.println(ex.getCause());
            System.exit(1);
        }
    }


    public void mainWindow(Stage primaryStage) {

            /*FXMLLoader loader = new FXMLLoader(Main.class.getResource("com.fxml"));
            AnchorPane pane = (AnchorPane)loader.load();
            Scene scene = new Scene(pane);
            stage.setResizable(true);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();*/


    }

        public static void main(String[] args) {
        launch(args);
    }
}
