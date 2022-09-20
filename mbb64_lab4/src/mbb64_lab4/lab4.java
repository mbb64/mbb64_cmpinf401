package mbb64_lab4;

import javax.swing.JOptionPane;

public class lab4 {

	public static void main(String[] args) {
		int x;
		int b;	
		do {
		x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a valid value for the log:"));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a valid value for the base:"));
		}while(x <= 0 || b <= 1);
		
		int count = 0;
		int div = x;
		while(div >= b) {
			div = div / b;
			count++;
			//System.out.println(x);
		}
		System.out.println("The log of " + x + " with base " + b + " has " + count + " divisions.");
	}
}

