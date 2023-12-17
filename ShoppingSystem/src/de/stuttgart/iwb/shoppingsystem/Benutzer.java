package de.stuttgart.iwb.shoppingsystem;
import java.util.List;
import java.util.ArrayList;

public class Benutzer {
	
	private int benutzerId;
    private String name;
    private List<Produkte> warenkorb;
    
	public String getName() {
		return name;
		
	}	
	
	public List<Produkte> getWarenkorb() {
		return warenkorb;
		
	}	
		public Benutzer(int _benutzerId, String _name){
			this.benutzerId = _benutzerId;
	    	this.name = _name;
	    	this.warenkorb = new ArrayList<>();}
		
		 

}
