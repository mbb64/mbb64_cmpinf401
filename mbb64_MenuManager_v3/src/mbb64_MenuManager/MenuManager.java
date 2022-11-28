package mbb64_MenuManager;
/**
 * Class MenuManager
 * author : Max Bauer
 * created: 11/27/2022
 */
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Sides> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);
		
		for(int i = 0; i < items.size(); i++) {
			MenuItem menuObject = items.get(i);
			if (menuObject instanceof Entree) {
				entrees.add((Entree)menuObject);
			} else if (menuObject instanceof Sides) {
				sides.add((Sides)menuObject);
			}else if (menuObject instanceof Salad) {
				salads.add((Salad)menuObject);
			}else if (menuObject instanceof Dessert) {
				desserts.add((Dessert)menuObject);
			}else;
			
					
		}
		
	}
	public Menu randomMenu(String name) {
		Random rand = new Random();
		int e = entrees.size();
		int s = sides.size();
		int sa = salads.size();
		int d = desserts.size();
		Entree entree_1 = entrees.get(rand.nextInt(e));
		Sides side_1 = sides.get(rand.nextInt(s));
		Salad salad_1 = salads.get(rand.nextInt(sa));
		Dessert dessert_1 = desserts.get(rand.nextInt(d));
		Menu randomMenu = new Menu(name, entree_1, side_1, salad_1, dessert_1);
		return randomMenu;
	}
	/*public Menu minCaloriesMenu(String name) {
		return Menu;
	}
	public Menu maxCaloriesMenu(String name) {
		return Menu;
	}
	*/
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}
	public ArrayList<Sides> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Sides> sides) {
		this.sides = sides;
	}
	public ArrayList<Salad> getSalads() {
		return salads;
	}
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
}
