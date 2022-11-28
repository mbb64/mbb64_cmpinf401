package mbb64_MenuManager;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class MenuRandomize author : Max Bauer created: 11/3/2022
 */
public class MenuRandomize {
	private ArrayList<Entree> entree;
	private ArrayList<Sides> side;
	private ArrayList<Salad> salad;
	private ArrayList<Dessert> dessert;

	/**
	 * Method to load files into array list
	 * 
	 * @param entreeFile  string
	 * @param sideFile    string
	 * @param saladFile   string
	 * @param dessertFile string
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		this.entree = FileManager.readEntree(entreeFile);
		this.side = FileManager.readSide(sideFile);
		this.salad = FileManager.readSalad(saladFile);
		this.dessert = FileManager.readDessert(dessertFile);
	}

	/**
	 * Method to create a random menu
	 * 
	 * @return the random entree, side, salad, and dessert
	 */
	public Menu randomMenu() {
		Random rand = new Random();
		int e = entree.size();
		int s = side.size();
		int sa = salad.size();
		int d = dessert.size();
		Entree entree_1 = entree.get(rand.nextInt(e));
		Sides side_1 = side.get(rand.nextInt(s));
		Salad salad_1 = salad.get(rand.nextInt(sa));
		Dessert dessert_1 = dessert.get(rand.nextInt(d));
		String name = "Random Menu";
		Menu randomMenu = new Menu(name, entree_1, side_1, salad_1, dessert_1);
		return randomMenu;
	}
}
