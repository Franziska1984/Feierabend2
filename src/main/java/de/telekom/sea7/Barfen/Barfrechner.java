package de.telekom.sea7.Barfen;
import java.util.Scanner; // Import der Scanner-Funktions-Bibliothek

public class Barfrechner {

    public static void main(String[] args) {

        // Kopie/neueInstanz der BarfVorlage Klasse erstellen und in der Variablen kopieBarfVorlage ablegen.
        BarfVorlage kopieBarfVorlage = new BarfVorlage(); 
        
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|xxxxxxxxxxx Barf-Rechner xxxxxxxxxxx|");
        System.out.println("|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx|");
        System.out.println("|                                    |");

        System.out.println("Bitte gib das Gewicht deines Hundes ein:");

        // Initialisierung des Scanners und Zuweisung der Funktionen in die Variable meinScanner
        Scanner meinScanner = new Scanner(System.in); 

        // Einlesen von Systemeingaben vom Typ Int und zuweisung in die Variable input
        double input = meinScanner.nextDouble();
        // Eingaben des Users die unter input gespeichert wurden einer variablen eingegebenesKoerpergewicht zusweisen
        double eingegebenesKoerpergewicht = input;

        // Ausgabe eines Satzes mit Aufruf der Funktion kopieBarfVorlage 
        // und Übergabe der Werte aus der Variablen eingegebenesKoerpergewicht
        System.out.println("dein Hund benötigt am Tag " + kopieBarfVorlage.gesamt(eingegebenesKoerpergewicht) + " kg");
        
        String ausgabeFleisch = String.format("der Fleischanteil ist: %.2f kg",kopieBarfVorlage.anteilFleisch(eingegebenesKoerpergewicht));
        System.out.println(ausgabeFleisch);
        
        String ausgabePflanzen = String.format("der Pflanzenanteil ist: %.2f kg",kopieBarfVorlage.anteilPflanzen(eingegebenesKoerpergewicht));
        System.out.println(ausgabePflanzen);
   
        meinScanner.close();
    }

}