package de.telekom.sea7;

public class PunktMain {

public static void main(String[] args) {

Punkt p = null;

Punkt p1 = new Punkt();
p1.setX(24);
p1.setY(71);

Punkt p2 = new Punkt();
p2.setX(170);
p2.setY(42);

Punkt p3 = p2;
p3.setX(10000);
p3.setY(-314);

new Punkt();

System.out.println(
String.format(
"Referenz '%s', X = %s, Y = %s",
p, 0, 0));
System.out.println(
String.format(
"Referenz '%s', X = %s, Y = %s",
p1, p1.getX(), p1.getY()));
System.out.println(
String.format(
"Referenz '%s', X = %s, Y = %s",
p2, p2.getX(), p2.getY()));
System.out.println(
String.format(
"Referenz '%s', X = %s, Y = %s",
p3, p3.getX(), p3.getY()));

if(p2==p3) {
System.out.println("p2 und p3 sind identisch");
}
if(p2.equals(p3)) {
System.out.println("gleich");
}
else {
System.out.println("ungleich");
}

}

}