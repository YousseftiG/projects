package Beans;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CARRE extends FIGURE{
	
	double side;

    public CARRE() {
        side=0;
       
    }

    public CARRE(POINT position, double side, int order, String color) {
        super( order, color,position);
      
        this.side=side;
    }

  

    public double getSide() {
        return side;
    }

    
   
    public void setSide(double side) {
        this.side = side;
    }

    

    @Override
    public String toString() {
        return "Carre "+super.toString()+", side=" + side;
    }

    
	@Override
	public void draw(Pane p) {
		Rectangle x=new Rectangle(this.getPosition().getX(),this.getPosition().getY(),side, side);
    	x.setFill(Color.valueOf(this.getColor()));
    	 x.setOnMousePressed(shapeOnMousePressedEventHandler);
    	 x.setOnMouseDragged(shapeOnMouseDraggedEventHandler);
  	   x.setOnMouseEntered(shapeOnMouseEnteredEventHandler);
  	   x.setOnMouseExited(shapeOnMouseExitedEventHandler);
    	p.getChildren().add(x);
	}

}
