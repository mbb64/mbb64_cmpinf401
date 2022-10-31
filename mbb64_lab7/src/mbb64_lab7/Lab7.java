package mbb64_lab7;

import java.util.Random;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: "); 
		n = sc.nextInt(); 
		
		int[] array = new int[n];
		Random rd = new Random();
		 for (int i = 0; i < array.length; i++) {
	         array[i] = rd.nextInt();
		}
		 .max();
		 .min();
		 .sum();
		 .ave();
	}

}
