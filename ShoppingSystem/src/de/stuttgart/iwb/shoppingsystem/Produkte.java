package de.stuttgart.iwb.shoppingsystem;

public class Produkte {

	    private int produkteId;
	    private String einheit;
	    private String name;
	    private double preis;
	    private int lagerbestand;
	    
	    public Produkte(int _produkteId, String _name, String _einheit, double _preis, int _lagerbestand) {
			this.produkteId = _produkteId;
	    	this.name = _name;
	    	this.einheit= _einheit;
			this.preis = _preis;
			this.lagerbestand = _lagerbestand;
		}
	    
		public String getName() {
			return name;
		}
	    
	   
	
}
