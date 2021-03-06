package de.telekom.sea7.VererbungID;

public class Auto extends BaseObjekt {

    public Auto(int id) {
        super(id); // Aufruf des Constructors von BaseObject-Klasse
    }


    // Soll den Namen der aktuellen Klasse (Auto) zurückgeben und die 
    // Klasse in der nächsten Ebene aufrufen
    public String classnameList() {
        return "Auto -> " + super.classnameList();
    }


    @Override // Verhindert Tipp-Fehler beim "überschreiben" von Methoden
    public int getId() {
        return super.getId(); // gibt zurück was die getId der BaseObject-Klasse zurückgibt
        // return this.getId(); !!! gefährlich, ruft sich endlos selbst auf.
    }

    @Override // Verhindert Tipp-Fehler beim "überschreiben" von Methoden
    public void setId(int id) {
        // super.toString(); // gibt Infos aus der BaseObject-Klasse aus
        // this.toString(); // gibt Infos aus der Auto-Klasse aus
        super.setId(id); // setzt die ID in der BaseObject-Klasse
    }

}
