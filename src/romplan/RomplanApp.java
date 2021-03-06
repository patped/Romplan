/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romplan;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author patrick
 */
public class RomplanApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Panes
        FlowPane rootPane = new FlowPane();
        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(20,20,20,20));
        pane.setVgap(5);
        pane.setHgap(5);
        
        BorderPane pane2 = new BorderPane();
        pane2.setPadding(new Insets(20,20,20,20));
        
        // Nodes
        pane.add(new Label("Dato"), 0, 0);
        pane.add(new TextField(), 0, 1);
        pane.add(new Label("Time fra"), 1, 0);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Romnr"), 2, 0);
        pane.add(new TextField(), 2, 1);
        pane.add(new Label("Navn"), 0, 2);
        pane.add(new TextField(), 0, 3);
        pane.add(new Label("Time til"), 1, 2);
        pane.add(new TextField(), 1, 3);
        Button btRegistrer = new Button("Registrer");
        pane.add(btRegistrer, 2,3);
        GridPane.setHalignment(btRegistrer, HPos.CENTER);
        
        pane2.setLeft(getVBox());
        
        // Scenes
        Scene scene = new Scene(rootPane);
        rootPane.getChildren().addAll(pane, pane2);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().add(new Label("Registrerte timer"));
        
        Label[] timer = 
            {new Label(
                "CSCI 1301 se hvor langt dette kan gå før det går helt "
                + "over til andre enden da"), 
            new Label("CSCI 1302"), 
            new Label("CSCI 2410"), 
            new Label("CSCI 3720")};
        
        for (Label time : timer) {
            VBox.setMargin(time, new Insets(0,0,0,15));
            vBox.getChildren().add(time);
        }
        
        return vBox;
    
    }
    
}
