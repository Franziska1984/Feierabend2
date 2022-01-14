package de.telekom.sea7.Bank;


public class SingleTransactionController {
	
	// Eigene Run Methode um direkt Objektorientiert zu sein
	public void run(String[] args) {
		
		// Instanz eines Models erstellen
		SingleTransactionModel sT = new SingleTransactionModel("TestEmpfaenger", "DE12TESTIBAN123", "BICXXX", "12.5", "€", "blablabla" );
		
		// Instanz einer View erstellen
		TransactionView tV = new TransactionView();
		
		// Model und View bekannt machen
		tV.setsT(sT);
		
		tV.menu();
		
		
		// Aufruf der Ausgabenmethode aus der View
		//tV.ausgeben();
		
	}
	
}