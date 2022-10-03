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
		// new Scanner(System.in);
		// initialize counts before loops
		// in for loop
		int dice1 = diceRoll.nextInt(6) + 1;
		int dice2 = diceRoll.nextInt(6) + 1;
		int diceTotal = dice1 + dice2;

		if (diceTotal == 2) {
			countTwo++;
		}
		else if (diceTotal == 3) {
			countThree++;
		}
		else if (diceTotal == 4) {
			countFour++;
		}
		else if (diceTotal == 5) {
			countFive++;
		}
		else if (diceTotal == 6) {
			countSix++;
		}
		else if (diceTotal == 7) {
			countSeven++;
		}
		else if (diceTotal == 8) {
			countEight++;
		}
		else if (diceTotal == 9) {
			countNine++;
		}
		else if (diceTotal == 10) {
			countTen++;
		}
		else if (diceTotal == 11) {
			countEleven++;
		}
		else if (diceTotal == 12) {
			countTwelve++;
		}
		else {
			System.out.println("Invalid roll.");
		}
		// if sum = 3 add to 3s
		//int dice1 = rand.nextInt(6) + 1;
		//int dice2 = rand.nextInt(6) + 1;
		// 2 dice rolls
		// sum up rolls
		// compare to the counts
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// while loop
		System.out.println("Enter number of rolls:");
		
		int inputRolls = input.nextInt(); // to get next amount of rolls
		String cont = input.nextLine(); // if they want to continue
		
		

	}

}
