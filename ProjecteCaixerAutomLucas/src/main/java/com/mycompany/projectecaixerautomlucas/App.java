package com.mycompany.projectecaixerautomlucas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
    //static String nom;
    static Client client;
    
    
    
    @Override
    public void start(Stage stage) throws IOException {
        //nom="Ana";
        
        
        //client = new Client();
        //usuari.setNomUsuari("lucas");
        //usuari.setPassUsuari("hola");
        
        Banc banc = null;
        banc.afegirClient("Lucas", "Acevedo", "lucas123", "contraseña_de_lucas");

        
                
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}