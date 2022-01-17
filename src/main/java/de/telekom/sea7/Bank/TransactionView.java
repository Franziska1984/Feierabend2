package de.telekom.sea7.Bank;

import java.util.Scanner;

public class TransactionView {
	

	
	private SingleTransactionModel sT;
	
	
	
	// Menü
	public void menu() {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		
		while(!eingabe.equals("exit")) {
			System.out.println("Bitte gib eine Aktion ein (z.B. show, exit oder input (für eine neue Überweisung)");
			eingabe = scanner.nextLine();
			
			switch (eingabe) {
			case "show":	
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. Hier bitte: \n ");
				ausgeben();
					break;
			case "input":
				eingeben();
					break;
			case "exit": 
				System.out.println("Schön, dass du da warst. Tschüss \n ");
			}
			
		}
		
		
		
		
		
	}
	
	
	
	// Methoden die aus dem Menü aufgerufen werden können
	
	public void ausgeben() {
		System.out.println(
				"Empfänger: " +
				sT.getEmpfaenger() +
				"\nIBAN Empfänger: " +
				sT.getEmpfaengerIban() +
				"\nBIC Empfänger: " +
				sT.getEmpfaengerBic() +
				"\nBetrag: " +
				sT.getBetrag() + " " +
				sT.getWaehrung() +
				"\nVerwendungszweck: " +
				sT.getVerwendungszweck());
	}

	// Methoden die aus dem Menü eingegeben werden können
	

	public void eingeben() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hier kannst du einen neue Überweisung machen!");
		System.out.println("Bitte gib hier den Empfänger ein: ");
		String eingabeEmpfaenger;
		eingabeEmpfaenger = scanner.nextLine();
		System.out.println("Bitte gib hier die IBAN des Empfängers ein: ");
		String eingabeIbanEmpfaenger;
		eingabeIbanEmpfaenger = scanner.nextLine();
		System.out.println("Bitte gib hier die BIC des Empfängers ein: ");
		String eingabeBic = scanner.nextLine();
		System.out.println("Bitte gib hier den Betrag ein: ");
		double eingabeBetrag;
		eingabeBetrag = scanner.nextDouble();
		System.out.println("Bitte gib hier die Währung ein: ");
		String eingabeWaehrung;
		eingabeWaehrung = scanner.nextLine();
		System.out.println("Bitte gib hier den Verwendungszeck ein: ");
		String eingabeVerwendungszweck;
		eingabeVerwendungszweck = scanner.nextLine();
		SingleTransactionModel sT1 = new SingleTransactionModel (eingabeEmpfaenger, eingabeIbanEmpfaenger, eingabeBic, eingabeBetrag, eingabeWaehrung, eingabeVerwendungszweck);
		
		
		System.out.println("Danke für deine Eingabe");	
	}

	
	public SingleTransactionModel getsT() {
		return sT;
	}

	public void setsT(SingleTransactionModel sT) {
		this.sT = sT;
	}
	

}