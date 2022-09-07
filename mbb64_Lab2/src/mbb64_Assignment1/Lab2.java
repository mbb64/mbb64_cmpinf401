package mbb64_Assignment1;

import javax.swing.*;

public class Lab2 {
		public static void main(String[] args) {
		
		String lengtha = JOptionPane.showInputDialog(null, "Enter side a length:");
		double a = Double.parseDouble(lengtha);
		// Side a input
		
		String lengthb = JOptionPane.showInputDialog(null, "Enter side b length:");
		double b = Double.parseDouble(lengthb);
		// Side b input
		
		double c;
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		c = c * 100; 
		c = Math.round(c);
		c = c / 100;
		JOptionPane.showMessageDialog(null, "The hypotenuse length is " + c);
		// Hypotenuse length
		}
}
