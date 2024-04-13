/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.company.proyectolp;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author pinto
 */
class Interfaz {
    //añadimos los objetos de pa escena y el panel principal
    Scene escena;
    AnchorPane panelP;
    Acciones ac;
    public Interfaz(Stage escenario,Acciones ac) {
        
        this.panelP = new AnchorPane();
        this.escena = new Scene(this.panelP,600,600);
        
        escenario.setScene(this.escena);
        escenario.show();
    }
    
}
