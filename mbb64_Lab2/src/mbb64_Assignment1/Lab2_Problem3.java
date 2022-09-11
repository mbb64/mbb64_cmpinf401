package mbb64_Assignment1;

import javax.swing.JOptionPane;

public class Lab2_Problem3 {

	public static void main(String[] args) {
		
		String money = JOptionPane.showInputDialog(null, "Enter amount of money in dollars:");
		int m = Integer.parseInt(money);
		// Input of dollar amount
		
		int grands = m / 1000;
		int benjamins = (m % 1000) / 100;
		int sawbucks = ((m % 1000) % 100) / 10;
		int bucks = ((m % 1000) % 100) % 10;
		// Converting to grands, benjamins, sawbucks, bucks
		
		JOptionPane.showMessageDialog(null, "You have:\n" + grands + " grands\n" + benjamins + " benjamins\n" + sawbucks + " sawbucks\n" + bucks + " bucks" );

	}

}
