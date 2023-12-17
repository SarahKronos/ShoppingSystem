package de.stuttgart.iwb.shoppingsystem;
import java.util.List;
import java.util.ArrayList;

public class Shoppingsystem {
	
	 private List<Produkte> produktListe;
	 private List<Benutzer> benutzerListe;
	 
	 public Shoppingsystem() {
	        this.produktListe = new ArrayList<>();
	        this.benutzerListe = new ArrayList<>();
	    }
	 
	 

	    public List<Benutzer> getBenutzerListe() {
		return benutzerListe;
	}



		public void produktHinzufuegen(Produkte _produkt) {
	        produktListe.add(_produkt);
	        System.out.println("Neues Produkt hinzugefügt: " + _produkt.getName());
	       
	    }	
	    
	    public void benutzerHinzufuegen(Benutzer benutzer) {
	        benutzerListe.add(benutzer);
	        System.out.println("Neuer Benutzer hinzugefügt: " + benutzer.getName());
	    }
	    
	    public void produktZumWarenkorbHinzufuegen(Benutzer benutzer, Produkte produkt) {
	        if (benutzerListe.contains(benutzer) && produktListe.contains(produkt)) {
	            benutzer.getWarenkorb().add(produkt);
	            System.out.println("Produkt '" + produkt.getName() + "' zum Warenkorb von "
	                    + benutzer.getName() + " hinzugefügt.");
	        } else {
	            System.out.println("Benutzer oder Produkt nicht gefunden.");
	        }
	        
	        
	      
	    }

	 
	 public static void main(String[] args) {
		 
		 
		       // Beispiel: Erstellen Sie eine Instanz von Shoppingsystem
		        Shoppingsystem shoppingSystem = new Shoppingsystem();

		        // Beispiel: Hinzufügen von Produkten
		        Produkte apfel = new Produkte(1, "Apfel", "Stück", 1.0, 6);
		        shoppingSystem.produktHinzufuegen(apfel);

		        Produkte banane = new Produkte(2, "Banane","Stück", 0.75 , 6);
		        shoppingSystem.produktHinzufuegen(banane);
		        
		        Produkte erdbeere = new Produkte(3, "Erdbeere","Stück", 0.75 , 6);
		        shoppingSystem.produktHinzufuegen(erdbeere);
		     
		        
		        

		        // Beispiel: Hinzufügen von Benutzer
		        Benutzer A = new Benutzer(1, "A");
		        shoppingSystem.benutzerHinzufuegen(A);

		        Benutzer B = new Benutzer(2, "B");
		        shoppingSystem.benutzerHinzufuegen(B);
		        
		        Benutzer C = new Benutzer(3, "C");
		        shoppingSystem.benutzerHinzufuegen(C);
		        
		     // Beispiel: Produkte zum Warenkorb hinzufügen
		        shoppingSystem.produktZumWarenkorbHinzufuegen(A, apfel);
		        shoppingSystem.produktZumWarenkorbHinzufuegen(B, banane);
	 
		        
		      
	 
		 
	 }
	 
	     
	     
		
		
		
	
		

	
	


	
	 
	 
	
	
}
