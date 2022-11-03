package mbb64_MenuManager;
/**
 * Class MenuTest
 * author : Max Bauer
 * created: 10/12/2022
 */
public class MenuTest {

	public static void main(String[] args) {

		Entree steak = new Entree("Steak", "Juicy steak", 360);
		Entree chicken = new Entree("Chicken", "White meat chicken", 250);
		Sides greenBeans = new Sides("Green Beans", "Green beans with salt, pepper, and lemon juice", 15);
		Salad ceaser = new Salad("Ceaser Salad", "Salad with ceaser dressing", 45);
		Salad garden = new Salad("Garden Salad", "Salad with tomatoes", 35);
		Dessert brownieSundae = new Dessert("Brownie Sundae", "Brownie topped with ice cream", 570);

		Menu mOne = new Menu("First menu", steak, null, ceaser, null);
		System.out.println(mOne.getName() + ": " + "\n" + mOne.description());
		System.out.println("Total Calories: " + mOne.totalCalories() + "\n");

		Menu mTwo = new Menu("Second Menu", chicken, greenBeans, garden, brownieSundae);
		System.out.println(mTwo.getName() + ": " + "\n" + mTwo.description());
		System.out.println("Total Calories: " + mTwo.totalCalories() + "\n");
	}

}
