package VererbungID;

public class AutoTest2 {

    // Ist die Testklasse für die eigene Übung

    public static void main(String[] args) {

        Auto auto = new Auto(123456);
        System.out.println(auto.classnameList());


    // ERGEBNIS
    // Ausgabe Klassenname Auto (3. Ebene)
    // AUsgabe Klassename BaseObject (2. Ebene)
    // Ausgabe Klassename Object.class (1. Ebene)


    }

}