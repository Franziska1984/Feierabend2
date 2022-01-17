package de.telekom.sea7.VererbungID;

public class AutoTest {

public static void main(String[] args) {
Auto auto = new Auto(5);


auto.setId(7);

System.out.println(auto.getId());


System.out.println();
// alle Klassen hintereinanderweg
// Auto, BaseObjekt, Objekt

}

}