/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XEnsaForms;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import Beans.CARRE;
import Beans.CERCLE;
import Beans.DESSIN;
import Beans.POINT;
import Beans.RECTANGLE;
import Beans.Rule;
import Beans.TRIANGLE;
import DAL.XMLWriterClass;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



/**
 *
 * @author
 */
public class XEnsaFormsMain extends Application {
    @FXML
    Pane drawPane;
    @FXML
    ColorPicker color;
    
    DESSIN dessin=new DESSIN();
    int order=1;
	String selectedShape="";
	
	
	List<Rule> ruleList = new ArrayList<Rule>();
	
	@FXML
	public void onMouseClickDrawPane(MouseEvent event) {
	if(!selectedShape.equalsIgnoreCase("") && event.getSource()==drawPane) {
	System.out.println(event.getSource().toString());

		if(  selectedShape.equalsIgnoreCase("CERCLE")) {
			CERCLE c=new CERCLE(new POINT(event.getX(),event.getY()), 30, order++, color.getValue().toString());
			dessin.getShapesList().add(c);
			c.draw(drawPane);
			System.out.println(c);
		
		}
		else if(selectedShape.equalsIgnoreCase("TRIANGLE")) {
			TRIANGLE t=new TRIANGLE(new POINT(event.getX(),event.getY()), new POINT(event.getX()+40,event.getY()+60), new POINT(event.getX()-40,event.getY()+60), order++, color.getValue().toString());
			dessin.getShapesList().add(t);
			t.draw(drawPane);
			System.out.println(t);
		}
		else if(selectedShape.equalsIgnoreCase("RECTANGLE")) {
			RECTANGLE r=new RECTANGLE(new POINT(event.getX(),event.getY()), 80, 50, order++, color.getValue().toString());
			dessin.getShapesList().add(r);
			r.draw(drawPane);
			System.out.println(r);
		}
		else if(selectedShape.equalsIgnoreCase("CARRE")) {
			CARRE c=new CARRE(new POINT(event.getX(),event.getY()), 100, order, color.getValue().toString());
			dessin.getShapesList().add(c);
			c.draw(drawPane);
			System.out.println(c);
		}

	
	}
	
		
	}
	
	@FXML
	public void onMouseClickCercle(MouseEvent event) {
		selectedShape="CERCLE";
		System.out.println("ok Cercle");
	}
	@FXML
	public void onMouseClickRectangle(MouseEvent event) {
		selectedShape="RECTANGLE";
		System.out.println("ok Rectangle");
	}
	@FXML
	public void onMouseClickTriangle(MouseEvent event) {
		selectedShape="TRIANGLE";
		System.out.println("ok Triangle");
	}
	@FXML
	public void onMouseClickCarre(MouseEvent event) {
		selectedShape="CARRE";
		System.out.println("ok Carre");
	}
	@FXML
	public void onMouseClickClear(MouseEvent event) {
		drawPane.getChildren().clear();
	}
	@FXML
	public void onMouseClickEnregistrer(MouseEvent event) {
		XMLWriterClass.writeObject(dessin.getShapesList(), ruleList, "\\Users\\mac\\Desktop\\Dev_Env\\workspace\\XEnsaForms\\xml-ressources\\figure.xml" );
	}
	
	
	
	
    @Override
    public void start(Stage stage) throws Exception {
        try {
      // Localisation du fichier FXML.
      final URL url = getClass().getResource("FXMLDocument.fxml");
      // Creation du loader.
      final FXMLLoader fxmlLoader = new FXMLLoader(url);
      // Chargement du FXML.
      Pane root = (Pane) fxmlLoader.load();
      // Cr�ation de la sc�ne.
      final Scene scene = new Scene(root);
      //affectation scene->stage
      stage.setScene(scene);
      
      
    } catch (IOException ex) {
      System.err.println("Erreur au chargement: " + ex);
    }
        //ajout de l'icon
        stage.getIcons().add(new Image("file:Images/iconApp.png"));
        //modification du titre
        stage.setTitle("XEnsaForms");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
