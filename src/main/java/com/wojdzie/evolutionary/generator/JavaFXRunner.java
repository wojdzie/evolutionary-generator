package com.wojdzie.evolutionary.generator;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXRunner extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Evolutionary Generator");
        Group root = new Group();
        Scene theScene = new Scene(root);
        stage.setScene(theScene);
        Canvas canvas = new Canvas(600, 600);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();


        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                gc.setFill(Color.GREEN);
                gc.fillRect(50, 50, 500, 500);
                gc.setFill(Color.DARKGREEN);
                gc.fillRect(250, 250, 100, 100);
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
