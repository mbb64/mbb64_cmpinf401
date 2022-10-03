package mbb64_lab5;

import java.util.Scanner;
import java.util.Random;

public class lab5 {
	public static void rollDice(int numOfRolls, Random diceRoll) {
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;
		int countSeven = 0;
		int countEight = 0;
		int countNine = 0;
		int countTen = 0;
		int countEleven = 0;
		int countTwelve = 0;

		int dice1 = 0;
		int dice2 = 0;
		int diceTotal = 0;

		for (int i = 0; i < numOfRolls; i++) {
			dice1 = diceRoll.nextInt(6) + 1;
			dice2 = diceRoll.nextInt(6) + 1;
			diceTotal = dice1 + dice2;
			if (diceTotal == 2) {
				countTwo++;
			} else if (diceTotal == 3) {
				countThree++;
			} else if (diceTotal == 4) {
				countFour++;
			} else if (diceTotal == 5) {
				countFive++;
			} else if (diceTotal == 6) {
				countSix++;
			} else if (diceTotal == 7) {
				countSeven++;
			} else if (diceTotal == 8) {
				countEight++;
			} else if (diceTotal == 9) {
				countNine++;
			} else if (diceTotal == 10) {
				countTen++;
			} else if (diceTotal == 11) {
				countEleven++;
			} else if (diceTotal == 12) {
				countTwelve++;
			} else {
				System.out.println("Invalid roll.");
			}
		}
		System.out.println("Two rolled " + countTwo + "/" + numOfRolls);
		System.out.println("Three rolled " + countThree + "/" + numOfRolls);
		System.out.println("Four rolled " + countFour + "/" + numOfRolls);
		System.out.println("Five rolled " + countFive + "/" + numOfRolls);
		System.out.println("Six rolled " + countSix + "/" + numOfRolls);
		System.out.println("Seven rolled " + countSeven + "/" + numOfRolls);
		System.out.println("Eight rolled " + countEight + "/" + numOfRolls);
		System.out.println("Nine rolled " + countNine + "/" + numOfRolls);
		System.out.println("Ten rolled " + countTen + "/" + numOfRolls);
		System.out.println("Eleven rolled " + countEleven + "/" + numOfRolls);
		System.out.println("Twelve rolled " + countTwelve + "/" + numOfRolls);
	}

	public static void main(String[] args) {
		String cont = "y";
		boolean end = true;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		while (end == true) {
			System.out.println("Enter number of rolls:");
			int inputRolls = input.nextInt(); // to get next amount of rolls
			input.nextLine();
			Random rolls = new Random();
			rollDice(inputRolls, rolls);
			System.out.println("Would you like to continue (y/n)?");
			cont = input.nextLine(); // if they want to continue
			if (cont.equals("n")) {
				end = false;
			}
		}
		input.close();
		input2.close();
	}
}
