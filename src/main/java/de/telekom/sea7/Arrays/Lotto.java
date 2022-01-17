package de.telekom.sea7.Arrays;

import java.util.Arrays;

public class Lotto {
	private int speicherposition = 0;
	private int[] lottozahlen = new int[7];
	


	// Methode sollte noch verbessert werden zum ausgeben einzelner Zahlen
	public void getLottozahl(int position) {
		if (position > 6 || position <= 0) {
			System.out.println("Es können nur die Positionen von 1 - 7 abgerufen werden!");
		} else {
			position = position -1;
			System.out.println("ausgegebene Zahl: " + lottozahlen[position]);	
		}
		
	}
	
	//Methode zum Ausgeben der Länge des Arrays
	public void ausgebenLaenge () {
	System.out.println("Die Länge des Arrays ist: " + lottozahlen.length);
	}
	
	
	// Methode um herauszufinden ob die Zahl gerade oder ungerade ist
	public void geradeUngerade () {
		for (int i = 0; i < lottozahlen.length; i++) {
		if ((lottozahlen[i] % 2)== 0) {
		System.out.println("Ich bin eine gerade Zahl!");
		}else {
		System.out.println("Ich bin eine ungerade Zahl!");
		}
	}
	}

	// Methode, Zahlen zwischen 1 und 49 werden ausgeschlossen, setze die 1. Zahl auf Position 0 und so weiter
	public void setLottozahlen(int lottozahl) {
		if (lottozahl < 1 || lottozahl > 49) {
			System.out.println("Nur Werte zwischen 1 und 49 sind gueltig");
		} else {
			if (speicherposition > 6) {

				System.out.println("Es duerfen nur 7 Zahlen angekreuzt werden, Du Depp!");
			} else {
				this.lottozahlen[speicherposition] = lottozahl;
				speicherposition++;
			}
		}
	}

	// Methode um den Speicherplatz immer um einen zu erhöhen
	public void ausgabeLottoschein() {
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);
		}
	}

	// Prüfung sind die Lottozahlen identisch
	public void pruefungZahlen() {
		Lottogesellschaft lottogesellschaft = new Lottogesellschaft();
		Object[] anArray = new Object[] { lottozahlen };
		Object[] anotherArray = new Object[] { lottogesellschaft.ziehungSamstag };
		System.out.println("Sind die Lottozahlen identisch: " + Arrays.deepEquals(anArray, anotherArray));
	}
}