package de.telekom.sea7.Barfen;

public class Hund {


		public static void main (String[] args) {
		
			
			String grosserHund = "großer Hund ab 25 kg: ";
			String kleinerHund = "kleiner Hund bis 10 kg: ";  
				
			// wenn private, dann muss hier eine Kopie der Class erstellt werden
			
			Barf hund = new Barf();
					
			// Hund groß
			
			System.out.println(grosserHund);
			System.out.println("Preis Futter pro Tag ist " + hund.getPreisProTag());
			System.out.println("Preis Futter pro Woche ist " + hund.getPreisProWoche());
			hund.preisWochenAusrechnen(4);
			
			// Hund klein
			
			System.out.println(kleinerHund);
			System.out.println("Preis Futter pro Tag ist " + hund.getPreisProTagHundKlein());
			System.out.println("Preis Futter pro Woche ist " + hund.getPreisProWocheHundKlein());
			hund.preisWochenAusrechnenHundKlein(4);
		
		}

		}


		