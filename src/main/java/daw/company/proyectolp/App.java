package daw.company.proyectolp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage escenario) {
        
        Datos dt = new Datos();
        
        Acciones ac = new Acciones(dt);
        
        Interfaz it = new Interfaz(escenario,ac);
        
    }

    public static void main(String[] args) {
        launch();
    }

}