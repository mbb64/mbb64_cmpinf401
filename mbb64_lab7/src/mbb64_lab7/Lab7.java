package mbb64_lab7;


import java.util.Random;
import java.util.Scanner;

public class Lab7 {
	public static double max(double[] data) {
		double max = 0;
		for(int i = 0; i < data.length; i++) {
			if(i == 0) {
				max = data[i];
			}else if(data [i] > max){
				max = data[i];
				}
			}
		return max;
		}

	public static double min(double[] data) {
		double min = 0;
		for(int i = 0; i < data.length; i++) {
			if(i == 0) {
				min = data[i];
			}else if(data [i] < min){
				min = data[i];
				}
			}
		return min;
	}

	public static double sum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public static double ave(double[] data) {
		double ave = sum(data)/data.length;
		return ave;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: "); 
		input = sc.nextInt(); 
		sc.close();
		
		double[] array = new double[input];
		Random rd = new Random();
		 for (int i = 0; i < array.length; i++) {
	         array[i] = rd.nextDouble();
	         System.out.println(array[i]);
		}
		 System.out.println("The max is " + max(array));
		 System.out.println("The min is " + min(array));
		 System.out.println("The sum is " + sum(array));
		 System.out.println("The average is " + ave(array));
		 
		 
	}

}
