package de.telekom.sea7.Arrays;

public class LottoMain {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        
lotto.setLottozahlen(10);
lotto.setLottozahlen(9);
lotto.setLottozahlen(11);
lotto.setLottozahlen(23);
lotto.setLottozahlen(25);
lotto.setLottozahlen(32);
lotto.setLottozahlen(48);

// Methode zum abfragen der Position 
lotto.getLottozahl(1);

//Methode zum Ausgeben der Länge des Arrays
lotto.ausgebenLaenge();

lotto.geradeUngerade();

lotto.ausgabeLottoschein();

//Methode zum prüfen ob die Zahlen identisch sind
lotto.pruefungZahlen();
    }

}