package notes;

import javax.swing.JOptionPane;

public class sept_14 {

	// What is a palindrome? -  a word of a phrase that reads the same backwards as forwards
	// Should ignore capitalization
	// Ignore everything that's not a letter

	/*
	 * 1. User Provides input
	 * 2. Convert everything to lower case
	 * 3. Remove all non-letter characters
	 * 4. Reverse the word
	 * 5. Compare the two strings
	 */
	
	public static void main(String[] args) {
		
		//1. User Provides input
		String phrase = JOptionPane.showInputDialog("Please enter a word or phrase: ");
		
		//2. 2. Convert everything to lower case
		phrase = phrase.toLowerCase();
		System.out.println(phrase);
		
		//3. Remove all non-letter characters
		/*
		 * a. Iterate through all characters in the input string
		 * b. If a character is a lowercase letter, keep it, otherwise ignore  it
		 * ascii table - character codes
		 */
		char letter = 'x';
		int lowerBound = (int) 'a';
		int upperBound = (int) 'z';
		int asciiLetter = (int) letter;
		
		if(asciiLetter >= lowerBound && asciiLetter <= upperBound){
		System.out.println("It is a letter");
		}
		
				}

}
