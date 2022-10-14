package mbb64_MenuManager;

public class MenuTest {

	public static void main(String[] args) {
		
		Entree steak = new Entree("Steak", "Juicy steak", 360);
		Entree chicken = new Entree("Chicken", "White meat chicken", 250);
		Sides greenBeans = new Sides("Green Beans", "Green beans with salt, pepper, and lemon juice", 15);
		Salad ceaser = new Salad("Ceaser Salad", "Salad with ceaser dressing", 45);
		Salad garden = new Salad("Garden Salad", "Salad with tomatoes", 35);
		Dessert brownieSundae = new Dessert("Brownie Salad", "Brownie topped with ice cream", 570);
		
		//Menu mOne = new Menu("First menu", steak, ceaser);
		//System.out.println(mOne.getName() + " " + mOne.getEntree().getName() + " " + mOne.getSalad().getName());
		
		Menu mTwo = new Menu("Second Menu", chicken, greenBeans, garden, brownieSundae);
		System.out.println(mTwo.getName() + " " + mTwo.getEntree().getName() + " " + mTwo.getSide().getName() + " " + mTwo.getSalad().getName() + " " + mTwo.getDessert().getName());
		
	}

}
