package de.telekom.sea7.Feierabend;

import java.util.Scanner;

import de.telekom.sea7.Mittagspause;

public class Feierabend3 {

	public static void main(String[] args) {
		
		Mittagspause.add(102);

		System.out.println("\nHallo schön das du da bist. Ist dein Name Franzi?");
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		while (input.equals("ja")) {

			System.out.println("Hast du heute einen guten Tag? oder einen schlechten Tag?");

			input = scanner.nextLine();
			System.out.println(input);
			if (input.startsWith("guten Tag")) {
				System.out.println("das freut mich");
			} else {
				System.out.println("das ist nicht so schön, morgen wird es bestimmt wieder ein guter Tag sein");
			}
		}
		scanner.close();
	}
}