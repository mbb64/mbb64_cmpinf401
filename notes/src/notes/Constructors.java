package notes;

public class Constructors {

	// public Constructors() {
		// Constructor has same name as the class
	}	
	// public Constructors() {
		// Can have multiple constructors in same class
		// qeue word "this" calls class variables, no this it brings from public class
		// ex) this.make
		/*
		 * Three levels of scope
		 * Global
		 * Local
		 * Code block level (loop or if statement)
		 */
		// Global variable, accessible from anywhere in class
		private int global;
		public Constructors() {
			this.global=0;
		}
		public void changeGlobal() {
		this.global ++;
	}
	


