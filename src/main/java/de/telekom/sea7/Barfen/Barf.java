package de.telekom.sea7.Barfen;

public class Barf {
	
	private double Fleisch = 3.50;
	private double KnochenKnorpel = 2.50;
	private double Innereien = 2.50;
	private double ObstGemüse = 1.00;
	
	//Berechnung Hund groß
	
	private double preisProTag = Fleisch + KnochenKnorpel + Innereien + ObstGemüse;
	private double preisProWoche = preisProTag * 7;
	
	public void preisWochenAusrechnen (int Tage) {
		double Gesamtpreis = preisProWoche * Tage;
		System.out.println("Preis für deine ausgerechneten Wochen " + Gesamtpreis);
	}
	
	// Berechnung Hund klein
	
	private double preisProTagHundKlein = (Fleisch + KnochenKnorpel + Innereien + ObstGemüse)/4;
	private double preisProWocheHundKlein = (preisProTag * 7)/4;
	
	
	public void preisAusrechnenHundKlein (int Tage) {
		double GesamtpreisHundKlein = preisProTagHundKlein * Tage;
		System.out.println("Preis für deine ausgerechneten Wochen " + GesamtpreisHundKlein);
	}
		
	public void preisWochenAusrechnenHundKlein (int Tage) {
		double GesamtpreisWocheHundKlein = preisProWocheHundKlein * Tage;
		System.out.println("Preis für deine ausgerechneten Wochen " + GesamtpreisWocheHundKlein);
	}
	
	// Getters, zur Benutzung der Variablen und Funktionen in der anderen Class
	
	public double getPreisProTag() {
		return preisProTag;
	}

	public double getPreisProWocheHundKlein() {
		return preisProWocheHundKlein;
	}
	public double getPreisProWoche() {
		return preisProWoche;
	}
	public double getPreisProTagHundKlein() {
		return preisProTagHundKlein;
	}
}