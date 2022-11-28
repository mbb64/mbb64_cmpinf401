package mbb64_MenuManager;
/**
 * Class Menu
 * author : Max Bauer
 * created: 10/12/2022
 */
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

	public int totalCalories() {
		int total = 0;
		if (entree != null) {
			total += entree.getCalories();
		}
		if (side != null) {
			total += side.getCalories();
		}
		if (salad != null) {
			total += salad.getCalories();
		}
		if (dessert != null) {
			total += dessert.getCalories();
		}
		return total;
	}

	public String description() {
		String mealDescription = "";
		if (entree == null) {
			mealDescription += "Entree: N/A";
		} else {
			mealDescription += "Entree: " + entree.getDescription();
		}
		mealDescription += "\n";
		if (side == null) {
			mealDescription += "Side: N/A";
		} else {
			mealDescription += "Side: " + side.getDescription();
		}
		mealDescription += "\n";
		if (salad == null) {
			mealDescription += "Salad: N/A";
		} else {
			mealDescription += "Salad: " + salad.getDescription();
		}
		mealDescription += "\n";
		if (dessert == null) {
			mealDescription += "Dessert: N/A";
		} else {
			mealDescription += "Dessert: " + dessert.getDescription();
		}
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
