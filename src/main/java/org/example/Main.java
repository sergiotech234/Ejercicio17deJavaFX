package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Etiqueta inicial con un texto por defecto
        Label etiqueta =
                new Label("Texto original");

        // Crear botón
        Button boton =
                new Button("Cambiar texto");

        // Evento del botón:
        // Al hacer clic llama al método cambiarTexto()
        // y le pasa la etiqueta como parámetro
        boton.setOnAction(
                e -> cambiarTexto(etiqueta)
        );

        // Crear VBox con separación de 20 píxeles
        VBox root = new VBox(20);

        // Centrar elementos dentro de la ventana
        root.setAlignment(Pos.CENTER);

        // Añadir componentes al VBox
        root.getChildren().addAll(
                etiqueta,
                boton
        );

        // Crear escena con tamaño 400x250
        Scene scene =
                new Scene(root, 400, 250);

        // Configurar título de la ventana
        primaryStage.setTitle(
                "Cambiar texto"
        );

        // Asignar escena
        primaryStage.setScene(scene);

        // Mostrar ventana
        primaryStage.show();
    }

    // Método privado encargado de cambiar
    // el texto de la etiqueta
    private void cambiarTexto(
            Label etiqueta) {

        // Cambia el contenido del Label
        etiqueta.setText(
                "¡El texto ha cambiado!"
        );
    }

    // Método principal que inicia aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
