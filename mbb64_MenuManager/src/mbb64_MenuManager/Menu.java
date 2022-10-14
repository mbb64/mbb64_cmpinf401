package mbb64_MenuManager;

public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Sides side;
	private Dessert dessert;

	public Menu(String name) {
		this.name = name;
		this.entree = null;
		this.side = null;
		this.salad = null;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Sides side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Sides side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	public int totalCalories(int total) {
		total = entree.getCalories() + side.getCalories() + salad.getCalories() + dessert.getCalories();
		return total;
	}
	// int total = salad.getCalories()
	// then return int
	public String description(String mealDescription) {
		mealDescription = entree.getDescription() + side.getDescription() + salad.getDescription() + dessert.getDescription();
		return mealDescription;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	public Sides getSide() {
		return side;
	}
	public void setSide(Sides side) {
		this.side = side;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
}
