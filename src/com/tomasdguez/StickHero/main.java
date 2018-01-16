/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tomasdguez.StickHero;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
        

public class main extends Application {
    
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
       // Creamos la ventana donde desarrollaremos el icono
       primaryStage.setTitle("Stick Hero");
       Group root = new Group();
       Canvas canvas = new Canvas(600, 600);
       GraphicsContext gc = canvas.getGraphicsContext2D();
       drawShapes(gc);
       root.getChildren().add(canvas);
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
    }
      
    private void drawShapes(GraphicsContext gc) {
        
        // Creamos el cuerpo de Stick.
        gc.fillRoundRect(200, 100, 200, 260, 100, 100);
        
        // Creamos la base suelo de Stick.
        gc.fillRoundRect(150, 400, 300, 300, 0, 0);
        
        // Creamos las Piernas de Stick.
        //Pierna Izquierda.
        gc.fillRoundRect(200, 310, 45, 90, 50, 50);
        
        //Pierna Derecha.
        gc.fillRoundRect(350, 300, 45, 100, 50, 50);
        
        // Cambiamos de Color para el ojo.
        gc.setFill(Color.WHITE);
       
        // Creamos el ojo de Stick
        gc.fillOval(335, 160, 45, 45);
        
        //Cambiamos de Color la cinta.
        gc.setFill(Color.rgb (202, 42, 42));
        
        // Creamos el pañuelo de Stick
        gc.fillRect(195, 125, 210, 50);
        
        // Creamos el Primer triangulo del pañuelo.
        gc.fillPolygon(new double[]{200, 300, 40, 80},
                       new double[]{300, 300, 210, 180}, 4);
  
        //Creamos el Segundo triangulo del pañuelo.

        
        //Terminamos la creación.
        gc.closePath();
        }

    }