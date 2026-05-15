package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Etiqueta inicial
        Label etiqueta = new Label("Texto original");

        // Botón
        Button boton = new Button("Cambiar texto");

        // Evento del botón
        boton.setOnAction(e -> cambiarTexto(etiqueta));

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(etiqueta, boton);

        Scene scene = new Scene(root, 400, 250);

        primaryStage.setTitle("Cambiar texto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método privado para cambiar el texto
    private void cambiarTexto(Label etiqueta) {
        etiqueta.setText("¡El texto ha cambiado!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}