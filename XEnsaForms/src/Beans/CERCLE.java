/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author
 */
public class CERCLE extends FIGURE {
    
    double radius;

    public CERCLE() {
        radius=0;
       
    }

    public CERCLE(POINT position, double radius, int order, String color) {
        super( order, color,position);
     
        this.radius = radius;
    }

   

    public double getRadius() {
        return radius;
    }

   

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cercle "+ super.toString()+", radius=" + radius;
    }

    @Override
    public void draw(Pane p) {
    	Circle c=new Circle(this.getPosition().getX(),this.getPosition().getY(),radius,Color.valueOf(this.getColor()));
    	
    	
    	c.setOnMouseDragged(shapeOnMouseDraggedEventHandler);
    	   c.setOnMousePressed(shapeOnMousePressedEventHandler);
    	   c.setOnMouseEntered(shapeOnMouseEnteredEventHandler);
    	   c.setOnMouseExited(shapeOnMouseExitedEventHandler);
    	   p.getChildren().add(c);
       }
    
 
    
}
