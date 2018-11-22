/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Nora
 */
public class RECTANGLE extends FIGURE {
  
    double width,height;

    public RECTANGLE() {
        width=height=0;
       
    }

    public RECTANGLE(POINT position, double width, double height,  int order, String color) {
        super(order, color,position);
      
        this.width = width;
        this.height = height;
    }

  

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

   
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle "+ super.toString()+", width=" + width + ", height=" + height ;
    }

    @Override
    public void draw(Pane p) {
    	Rectangle x=new Rectangle(this.getPosition().getX(),this.getPosition().getY(),width, height);
    	x.setFill(Color.valueOf(this.getColor()));
    	 x.setOnMousePressed(shapeOnMousePressedEventHandler);
    	 x.setOnMouseDragged(shapeOnMouseDraggedEventHandler);
  	   x.setOnMouseEntered(shapeOnMouseEnteredEventHandler);
  	   x.setOnMouseExited(shapeOnMouseExitedEventHandler);
    	p.getChildren().add(x);
    	
        }
    
    
    
}
