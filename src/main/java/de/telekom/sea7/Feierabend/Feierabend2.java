package de.telekom.sea7.Feierabend;


public class Feierabend2 {

	public static void main(String[] args) {

		System.out.println("Hallo schön das du da bist. Ist dein Name Franzi?");

		String input = System.console().readLine();

		while (input.equals("ja")) {
			input = System.console().readLine();
			System.out.println(input);
			
			System.out.println("Hast du heute einen guten Tag? oder einen schlechten Tag?");

			input = System.console().readLine();
							
			if (input.equals("guten Tag")) {
				System.out.println("das freut mich");
			} else {
				System.out.println("das ist nicht so schön, morgen wird es bestimmt wieder ein guter Tag sein");
			}
		}

		
	}
}		
		
/*				
		System.out.println("Gib irgendwas ein oder exit");

		// es soll eine Eingabe in der Console ausgelesen werden
		String eingabe = System.console().readLine();
		
		while (!eingabe.startsWith ("exit")) {
			System.out.println("Gib irgendwas ein oder exit");
			eingabe = System.console().readLine();
			System.out.println(eingabe);
		}
	}
*/
		
		

