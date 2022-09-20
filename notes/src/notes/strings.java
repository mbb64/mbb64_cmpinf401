package notes;

public class strings {

	public static void main(String[] args) {
		String temp = "Hello world";
		
		// Getting a character at a specified index / position
		System.out.println(temp.charAt(0));
		System.out.println(temp.charAt(3));
		
		System.out.println((int) temp.charAt(3));

		// Getting an index of a character
		System.out.println(temp.indexOf('H'));
		System.out.println(temp.indexOf('x'));
		
		// Getting part of a string
		System.out.println(temp.substring(6));
	}

}
