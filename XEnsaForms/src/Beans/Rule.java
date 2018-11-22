package Beans;

import java.util.ArrayList;
import java.util.List;

public class Rule {
	
	private List<FIGURE> elements ;
	private String type;
	private String description;
	
	
	public Rule() {
		this.elements = new ArrayList<FIGURE>();
		this.type = "";
		this.description = "";
	}


	public Rule( String type, String description, List<FIGURE> elements) {
		this.elements = elements;
		this.type = type;
		this.description = description;
	}


	public List<FIGURE> getElements() {
		return elements;
	}


	public void setElements(List<FIGURE> elements) {
		this.elements = elements;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		
		String rulestring = "";
		int i = 1;
		for( FIGURE figure : getElements() ) {
			rulestring += " element " + i + " : " + figure.toString() + " | ";
		}
		
		
		return " Rule : " + rulestring + " " + getType() + " " + getDescription();
	}
	
}
