package mbb64_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(null, "Enter a distance or weight amount:");
		String[] units = input.split(" ");
		//Input
		
		String s1 = units[0];
		String s2 = units[1];
		//Obtaining number and unit
		
		double num = Double.parseDouble(s1);
		//Converting string to double
		if (s2.equals("in")) {
			double c = num * 2.54;
			System.out.println(input + " = " + c + " cm");
			//Inches to cm
		}
		else if (s2.equals("cm")){
			double i = num * 0.393701;
			System.out.println(input + " = " + i + " in");
			//Cm to in
		}
		else if (s2.equals("yd")){
			double meter = num * 0.9144;
			System.out.println(input + " = " + meter + " m");
			//yd to m
		}
		else if (s2.equals("m")){
			double y = num * 1.09361;
			System.out.println(input + " = " + y + " yd");
			//m to yd
		}
		else if (s2.equals("oz")){
			double gram = num * 28.3495;
			System.out.println(input + " = " + gram + " g");
			//oz to g
		}
		else if (s2.equals("g")){
			double o = num * 0.035274;
			System.out.println(input + " = " + o + " oz");
			//g to oz
		}
		else if (s2.equals("kg")){
			double pound = num * 2.20462;
			System.out.println(input + " = " + pound + " lb");
			//kg to lb
		}
		else if (s2.equals("lb")){
			double k = num * 0.453592;
			System.out.println(input + " = " + k + " kg");
			//lb to kg
		}
		else {
			System.out.println("Invalid measurement.");
		}
	}
}
