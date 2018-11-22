package DAL;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import Beans.*;



public class XMLWriterClass {

	private static final String ROOT_ELEMENT_SCENE = "scene";
	private static final String CONTAINER_FIGURE_ELEMENT = "figures";
	private static final String CONTAINER_RULES_ELEMENT = "rules";
	private static final String PATH_DTD = "\\Users\\mac\\Desktop\\Dev_Env\\workspace\\XEnsaForms\\xml-ressources\\figures_schema.dtd";
	
	public static void writeObject( List<FIGURE> figureList, List<Rule> ruleList, String filename) {
		
		Document document = new Document();
		DocType docType = new DocType( ROOT_ELEMENT_SCENE, PATH_DTD );
		document.setDocType( docType );
		document.setRootElement( new Element( ROOT_ELEMENT_SCENE ) );
		
		Element container_figure = new Element( CONTAINER_FIGURE_ELEMENT );
		document.getRootElement().addContent( container_figure );
		document.getRootElement().setAttribute("name", filename);
		
		
		for (FIGURE figure : figureList) {
			
			Element elementFigure = null;
			
			if( figure instanceof RECTANGLE ){
				elementFigure = new Element( "rectangle" );
				
			
				
				
				Element width = new Element( "width" );
				width.setAttribute( "value" , ""+((RECTANGLE)figure).getWidth() );
				elementFigure.addContent(width);
				
				Element height = new Element( "height" );
				height.setAttribute( "value" , ""+((RECTANGLE)figure).getWidth() );
				elementFigure.addContent(height);
				

			}else if( figure instanceof TRIANGLE ){
				elementFigure = new Element( "triangle" );
				
				
				Element point1 = new Element( "p1" );
				point1.setAttribute( "x" ,  ""+((TRIANGLE) figure).getP1().getX() );
				point1.setAttribute( "y" ,  ""+ ((TRIANGLE) figure).getP1().getY() );
				elementFigure.addContent(point1);
				
				Element point2 = new Element( "p2" );
				point2.setAttribute( "x" ,  ""+((TRIANGLE) figure).getP2().getX() );
				point2.setAttribute( "y" ,  ""+ ((TRIANGLE) figure).getP2().getY() );
				elementFigure.addContent(point2);
				

			} else if( figure instanceof CARRE ){
				elementFigure = new Element( "carre" );
				
			
				
				Element side = new Element( "side" );
				side.setAttribute( "value" , ""+((CARRE)figure).getSide() );
				
				elementFigure.addContent(side);


			}else if( figure instanceof CERCLE ) {
				elementFigure = new Element( "cercle" );
				
		
				
				Element radius = new Element( "radius" );
				radius.setAttribute( "value", ""+ ((CERCLE)figure).getRadius() );
				
				elementFigure.addContent( radius );

				
			}
			
			Element point = new Element( "position" );
			point.setAttribute( "x" ,  ""+ figure.getPosition().getX() );
			point.setAttribute( "y" ,  ""+ figure.getPosition().getY() );
			elementFigure.addContent( point );
			
			elementFigure.setAttribute( "order", ""+figure.getOrder() );
			elementFigure.setAttribute( "color", ""+figure.getColor() );
			elementFigure.setAttribute( "position", ""+figure.getId() );
						
			
			document.getRootElement().getChild( CONTAINER_FIGURE_ELEMENT ).addContent(elementFigure);

		}
		
		Element container_rule = new Element( CONTAINER_RULES_ELEMENT );
		document.getRootElement().addContent( container_rule );
		
		for (Rule rule : ruleList) {
			
			Element rule_element = new Element( "rule" );
			
			for (FIGURE partie : rule.getElements()) {
				Element element = new Element( "element" );
				element.setAttribute( "figure", "" + partie.getId() );
				rule_element.addContent( element );
			}
			
			rule_element.addContent( new Element( "type" ).setText( rule.getType() ) );
			rule_element.addContent( new Element( "description" ).setText( rule.getDescription() ) );

			document.getRootElement().getChild( CONTAINER_RULES_ELEMENT ).addContent( rule_element );
			
		}
		
		
		XMLOutputter xmlOutputter = new XMLOutputter( Format.getPrettyFormat() ); 
		
		try {
			xmlOutputter.output( document, new FileOutputStream( filename ));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
}
