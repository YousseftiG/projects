package DAL;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jdom2.Element;
import org.jdom2.input.DOMBuilder;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import Beans.*;



public class XMLReaderClass {

	
	
	public static void readObject( String filename, List<FIGURE> figures, List<Rule> rules  ) {
		
		org.jdom2.Document document;
		
		try {
			
			document = initilizeDomParser( filename );
			Element figurelement = document.getRootElement().getChild( "figures" );
			Element rulelement = document.getRootElement().getChild( "rules" );
			
			List<Element> elementsOfFigure = figurelement.getChildren();
			List<Element> elementsOfRule = rulelement.getChildren();

			
			for (Element element : elementsOfFigure ) {
				
				if ( element.getName().equals( "rectangle" ) ) {
					
					RECTANGLE rectangle = new RECTANGLE();
					//rectangle.setId( element.getAttributeValue( "id" ) );
					rectangle.setColor( element.getAttributeValue( "color" ));
					rectangle.setOrder( Integer.parseInt( element.getAttributeValue( "order" ) ));
					
					rectangle.setPosition( new POINT(getValueOfChild( element, "position", "x"), getValueOfChild( element, "position", "y") ) );
					rectangle.setWidth( getValueOfChild( element, "width", "value") );
					rectangle.setHeight(( getValueOfChild( element, "height", "value") ));

					figures.add(rectangle);

				} else if( element.getName().equals( "triangle" ) ) {
					
					TRIANGLE triangle = new TRIANGLE();
					//triangle.setID( element.getAttributeValue( "id" ) );
					triangle.setColor( element.getAttributeValue( "color" ));
					triangle.setOrder( Integer.parseInt( element.getAttributeValue( "order" ) ));
					
					List<POINT> pointslist = new ArrayList<POINT>();
					
					List<Element> element_point = element.getChildren( "point" );
					
					if ( !element_point.isEmpty() ) {

						for( Element point : element_point) {
							POINT point_bean = new POINT();
							point_bean.setX( Double.parseDouble( point.getAttributeValue( "x" ) ));
							point_bean.setY( Double.parseDouble( point.getAttributeValue( "y" ) ));
							pointslist.add( point_bean );
						}	
						
					}
					
					//triangle.setPointlist(pointslist);
					
					figures.add(triangle);

				}else if( element.getName().equals( "carre" ) ) {
					
					CARRE carree = new CARRE();
					//carree.setID( element.getAttributeValue( "id" ) );
					carree.setColor( element.getAttributeValue( "color" ));
					carree.setOrder( Integer.parseInt( element.getAttributeValue( "order" ) ));
					
					carree.setPosition( new POINT(getValueOfChild( element, "position", "x"), getValueOfChild( element, "position", "y") ) );
					carree.setSide( getValueOfChild( element, "side", "value") );
					
					figures.add(carree);

				}else if( element.getName().equals( "cercle" ) ) {
					
					CERCLE cercle = new CERCLE();
					//cercle.setID( element.getAttributeValue( "id" ) );
					cercle.setColor( element.getAttributeValue( "color" ));
					cercle.setOrder( Integer.parseInt( element.getAttributeValue( "order" ) ));
					
					cercle.setPosition( new POINT(getValueOfChild( element, "point", "x"), getValueOfChild( element, "point", "y") ) );
					cercle.setRadius( getValueOfChild( element, "radius", "value") );
					
					figures.add(cercle);

				}
			}
			
			
			for ( Element element : elementsOfRule ) {
				
				List<Element> element_rules = element.getChildren( "rule" );
				
				if( !element_rules.isEmpty() ) {
					
					for (Element rule_bean : element_rules) {
						Rule rule = new Rule();
						List<FIGURE> list_figure = new ArrayList<FIGURE>();
						List<Element> list_figure_element = rule_bean.getChildren( "element" );

							for( Element element_figure : list_figure_element) {
								String idref = element_figure.getAttributeValue( "figure" );
								Predicate<FIGURE> figurePredicate = p->p.getId().equals( idref );
								FIGURE figure = figures.stream().filter( figurePredicate ).findFirst().get();
								list_figure.add(figure);
							}
							
						rule.setElements(list_figure);
						
						rule.setType( rule_bean.getChildText( "type" ) );
						rule.setDescription( rule_bean.getChildText( "description" ) );
						rules.add( rule );
					}
					
				}
			
		}
		
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static org.jdom2.Document initilizeDomParser( String filename ) throws ParserConfigurationException, SAXException, IOException {
		
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		
		Document document = builder.parse( new File( filename ));
		
		DOMBuilder domBuilder = new DOMBuilder();
		
		return domBuilder.build( document );	
	}
	
	private static double getValueOfChild( Element element, String child, String attribute ) {
		return Double.parseDouble( element.getChild( child ).getAttributeValue( attribute ) );
	}
	
}
