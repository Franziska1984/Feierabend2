package de.telekom.sea7;

import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {

		System.out.println("calculator");
		System.out.println("Input number one:");

		Scanner scanner = new Scanner(System.in);

		int inputNumber1 = scanner.nextInt();

		System.out.println("Input number two:");
		int inputNumber2 = scanner.nextInt();

		System.out.println("what do you do?");
		System.out.println("add" + " " + "minus" + " " + "multiply" + " " + "divide");

		String select = scanner.next();

		int result;

		switch (select) {
		case "add":
			result = inputNumber1 + inputNumber2;
			System.out.println(result);
			break;
		case "minus":
			result = inputNumber1 - inputNumber2;
			System.out.println(result);
			break;
		case "multiply":
			result = inputNumber1 * inputNumber2;
			System.out.println(result);
			break;
		case "divide":
			result = inputNumber1 / inputNumber2;
			System.out.println(result);
			break;

		}

		scanner.close();
	}

}
