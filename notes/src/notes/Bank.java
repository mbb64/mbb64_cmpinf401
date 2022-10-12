package notes;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, -4, 0, -1, 3, 2, 4, -6};
		int c = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]<0) {
				c++;
			}
		}
		System.out.println(c);
	}
	
}
