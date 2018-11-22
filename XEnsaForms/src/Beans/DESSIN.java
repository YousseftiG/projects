package Beans;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.Pane;

public class DESSIN {
	List<FIGURE> shapesList;
	
	public DESSIN() {
		shapesList=new ArrayList<FIGURE>();
	}
	public List<FIGURE> getShapesList() {
		return shapesList;
	}
	public void setShapesList(List<FIGURE> l) {
		shapesList=l;
	}
	public void draw(Pane p) {
		for(FIGURE f :shapesList) {
			f.draw(p);
		}
	}
}
