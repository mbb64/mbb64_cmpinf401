package mbb64_lab10;

public class Lab10 {

	public static void main(String[] args) {

	}
			static int sumOfDigits(int x) {
			if (x == 0) {
				return 0;
			}
			else {
				int lastNum = x % 10;
				int restOfNum = x / 10;
				return lastNum + sumOfDigits(restOfNum);
			}
	}
			void printArrayElements(int[] arr, int index) {
				if (index == arr.length) {
					return;
				}
				System.out.println(arr[index]);
				printArrayElements(arr, index+1);
			}
		
			public static void printCombos(int[] a, String out, int startIndex, int k) {
				
			}


}
