/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
/**
 *
 * @author Nora
 */
public class TRIANGLE  extends FIGURE{
    POINT p1,p2;

    public TRIANGLE() {
    }

    public TRIANGLE(POINT position,POINT p1, POINT p2, int order, String color) {
        super( order, color,position);
        this.p1 = p1;
        this.p2 = p2;
        
    }

    public POINT getP1() {
        return p1;
    }

    public POINT getP2() {
        return p2;
    }



    public void setP1(POINT p1) {
        this.p1 = p1;
    }

    public void setP2(POINT p2) {
        this.p2 = p2;
    }

   

    @Override
    public String toString() {
        return "Triangle "+ super.toString()+ " ,p1=" + p1 + ", p2=" + p2  ;
    }

    @Override
    public void draw(Pane p) {
    	
    	Polygon x=new Polygon();
    	x.getPoints().addAll(new Double[]{
    			this.getPosition().getX(),this.getPosition().getY(),
    			p2.getX(),p2.getY(),
    			p1.getX(),p1.getY() });
    	
    	x.setFill(Color.valueOf(this.getColor()));
    	 x.setOnMousePressed(shapeOnMousePressedEventHandler);
  	   x.setOnMouseEntered(shapeOnMouseEnteredEventHandler);
  	 x.setOnMouseDragged(shapeOnMouseDraggedEventHandler);
  	   x.setOnMouseExited(shapeOnMouseExitedEventHandler);
    	p.getChildren().add(x);
    	
         }
    
    
}
