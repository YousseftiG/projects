/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author
 */


import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.Cursor;
import javafx.scene.paint.Paint;


import javafx.scene.layout.Pane;

public abstract class FIGURE {
	private static String id;
	private String color;
	private int order;
	private POINT position;
	 
	
	
	 double orgSceneX=0, orgSceneY=0;
	 double orgTranslateX=0, orgTranslateY=0;
	
	public FIGURE() {}

	

	public FIGURE( int order, String color,POINT position) {
		this.id = "shape-"+order;
		this.order = order;
		this.color = color;
		this.position=position;
	}

	public POINT getPosition() {
		return position;
	}



	public void setPosition(POINT position) {
		this.position = position;
	}



	public String getId() {
		return id;
	}

	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    @Override
    public String toString() {
        return " id=" + id + ", position="+position+", color=" + color + ", order=" + order ;
    }
    
    public abstract void draw(Pane p);

    EventHandler<MouseEvent> shapeOnMouseEnteredEventHandler = 
           new EventHandler<MouseEvent>() {
     
           @Override
           public void handle(MouseEvent t) {
                Shape s=(Shape)(t.getSource());
             s.setFill(Color.GREY);
             s.setCursor(Cursor.HAND);
               
               
                           if(t.getSource() instanceof Rectangle){
                               Rectangle r=(Rectangle)t.getSource();
                               POINT p=new POINT(r.getX()+r.getWidth(),r.getY()+r.getHeight());
                               if(  (t.getX()>p.getX()-10 &&  t.getY()>p.getY()-10 ) )  {
                                   r.setCursor(Cursor.NW_RESIZE);
                               }
                               else {s.setCursor(Cursor.HAND);}
                           }
           }
       };     
       
    EventHandler<MouseEvent> shapeOnMouseExitedEventHandler = 
           new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent t) {
                Shape s=(Shape)(t.getSource());
               
           s.setFill(Paint.valueOf(color));
           }
       }; 
      

   //redimentionner
   EventHandler<MouseEvent> shapeOnMouseDraggedEventHandler = 
           new EventHandler<MouseEvent>() {
     
           @Override
           public void handle(MouseEvent t) {
               double offsetX = t.getSceneX() - orgSceneX;
               double offsetY = t.getSceneY() - orgSceneY;
               double newTranslateX = orgTranslateX + offsetX;
               double newTranslateY = orgTranslateY + offsetY;
                
               ((Shape)(t.getSource())).setTranslateX(newTranslateX);
               ((Shape)(t.getSource())).setTranslateY(newTranslateY);
           }
       };

    //dragger
      
     
      //changer la position
       EventHandler<MouseEvent> shapeOnMousePressedEventHandler = 
           new EventHandler<MouseEvent>() {
    
           @Override
           public void handle(MouseEvent t) {
               orgSceneX = t.getSceneX();
               orgSceneY = t.getSceneY();
               orgTranslateX = ((Shape)(t.getSource())).getTranslateX();
               orgTranslateY = ((Shape)(t.getSource())).getTranslateY();
               
               
           }
       };
       
 
	
	

}
