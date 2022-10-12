package mbb64_MenuManager;

public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Sides side;
	private Dessert dessert;

	public Menu(String name) {
		this.name = name;
	}
	public Menu(String name, Entree entree, Sides side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	public Menu(String name, Entree entree, Sides side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	int totalCalories;
	String description;
}
