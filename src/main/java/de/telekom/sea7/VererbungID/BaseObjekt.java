package de.telekom.sea7.VererbungID;

public class BaseObjekt {

    private int id;

    // eigenerConstructor 
    public BaseObjekt( int id ) {
        this.id = id;
    } 

    // Soll den Namen der aktuellen Klasse (BaseObject) zurückgeben und die Klasse in der nächsten Ebene aufrufen, 
    // da die Object.class aber den Namen nicht hat, ist es deshalb fest ausgeschrieben

    public String classnameList() {
        return "BaseObjekt -> " + "Object.class" /* super.getClass() */;
    }


    // GetId-/SetId-Methoden
    public void setId( int id ) {
        // setzt ID in der BaseObject Klasse
        this.id = id;
    }

    public int getId() {
        // Rückgabe der ID aus der BaseObject-Klasse
        return this.id;
    }

}