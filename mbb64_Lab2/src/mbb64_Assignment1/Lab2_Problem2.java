package mbb64_Assignment1;

import javax.swing.JOptionPane;

public class Lab2_Problem2 {

	public static void main(String[] args) {

		String r = JOptionPane.showInputDialog(null, "Enter radius length:");
		double radius = Double.parseDouble(r);
		// Input of radius length
		
		double p;
		p = 2 * Math.PI * radius;
		p = p * 100; 
		p = Math.round(p);
		p = p / 100;
		// Calculating perimeter
		
		double a;
		a = Math.PI * radius * radius;
		a = a * 100; 
		a = Math.round(a);
		a = a / 100;
		// Calculating area
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + " has an area of " + a + " and a perimeter of " + p +".");
		// Output
		
	}

}
