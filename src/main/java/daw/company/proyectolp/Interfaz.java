/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.company.proyectolp;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
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

    public Interfaz(Stage escenario, Acciones ac) {

        this.panelP = new AnchorPane();

        this.escena = new Scene(this.panelP, 1000, 750);

        menus();

        escenario.setScene(this.escena);
        escenario.show();
    }

    private void menus() {

        MenuBar mb = new MenuBar();

        Menu archivo = new Menu("Archivo");

        MenuItem guardar = new MenuItem("Guardar Datos");

        MenuItem abrir = new MenuItem("Abrir Datos");

        SeparatorMenuItem sep1 = new SeparatorMenuItem();

        MenuItem salir = new MenuItem("Salir");

        Menu ajustes = new Menu("Ajustes");

        MenuItem reiniciar = new MenuItem("Reiniciar Tabla");

        SeparatorMenuItem sep2 = new SeparatorMenuItem();

        MenuItem pantalla = new MenuItem("Pantalla Completa");

        mb.getMenus().addAll(archivo, ajustes);

        archivo.getItems().addAll(guardar, abrir, sep1, reiniciar, sep2, salir);

        ajustes.getItems().addAll(reiniciar, sep2, pantalla);

        this.panelP.getChildren().addAll(mb);
    }

}
