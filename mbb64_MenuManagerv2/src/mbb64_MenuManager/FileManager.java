package mbb64_MenuManager;

/**
 * Class FileManager
 * author : Max Bauer
 * created: 11/3/2022
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
	/**
	 * Method to convert file to entree array list
	 * 
	 * @param fileName String
	 * @return Entree array list
	 */
	public static ArrayList<Entree> readEntree(String fileName) {
		ArrayList<Entree> menu = new ArrayList<Entree>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] menuInp = line.split("@@");
				String name = menuInp[0];
				String description = menuInp[1];
				int calories = Integer.parseInt(menuInp[2]);
				Entree entree = new Entree(name, description, calories);
				menu.add(entree);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menu;
	}

	/**
	 * Method to convert file to sides array list
	 * 
	 * @param fileName String
	 * @return Sides array list
	 */
	public static ArrayList<Sides> readSide(String fileName) {
		ArrayList<Sides> menu = new ArrayList<Sides>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] menuInp = line.split("@@");
				String name = menuInp[0];
				String description = menuInp[1];
				int calories = Integer.parseInt(menuInp[2]);
				Sides side = new Sides(name, description, calories);
				menu.add(side);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menu;
	}

	/**
	 * Method to create file to Salad array list
	 * 
	 * @param fileName string
	 * @return Salad array list
	 */
	public static ArrayList<Salad> readSalad(String fileName) {
		ArrayList<Salad> menu = new ArrayList<Salad>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] menuInp = line.split("@@");
				String name = menuInp[0];
				String description = menuInp[1];
				int calories = Integer.parseInt(menuInp[2]);
				Salad salad = new Salad(name, description, calories);
				menu.add(salad);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menu;
	}

	/**
	 * Method to convert file to Dessert array list
	 * 
	 * @param fileName string
	 * @return Dessert array list
	 */
	public static ArrayList<Dessert> readDessert(String fileName) {
		ArrayList<Dessert> menu = new ArrayList<Dessert>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] menuInp = line.split("@@");
				String name = menuInp[0];
				String description = menuInp[1];
				int calories = Integer.parseInt(menuInp[2]);
				Dessert dessert = new Dessert(name, description, calories);
				menu.add(dessert);
			}
			br.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menu;
	}
}
