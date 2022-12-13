package mbb64_MenuManager;

/**
 * Class FileManager
 * author : Max Bauer
 * edited: 11/27/2022
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class FileManager {

	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
		/*try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] menuInp = line.split("@@");
				if(menuInp.length == 4) {
					if(menuInp[1] == "entree") {
						Entree e = new Entree(menuInp[0], menuInp[2], Integer.parseInt(menuInp[3]), Double.parseDouble(menuInp[4]));
						menu.add(e);
					}
					if(menuInp[1] == "side") {
							Sides s = new Sides(menuInp[0], menuInp[2], Integer.parseInt(menuInp[3]), Double.parseDouble(menuInp[4]));
							menu.add(s);
				}
					if(menuInp[1] == "salad") {
						Salad sld = new Salad(menuInp[0], menuInp[2], Integer.parseInt(menuInp[3]), Double.parseDouble(menuInp[4]));
						menu.add(sld);
			}
					if(menuInp[1] == "dessert") {
						Dessert d = new Dessert(menuInp[0], menuInp[2], Integer.parseInt(menuInp[3]), Double.parseDouble(menuInp[4]));
						menu.add(d);
		}
					else {
						System.out.println("Invalid");
					}
				}
			}
					br.close();
					fr.close();
			}catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return menu;
				*/
					
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String line = br.readLine();
				String[] menuInp = line.split("@@");
				String name = menuInp[0];
				String menuType = menuInp[1];
				String description = menuInp[2];
				int calories = Integer.parseInt(menuInp[3]);
				double price = Double.parseDouble(menuInp[4]);

				if (menuType.equalsIgnoreCase("entree")) {
					Entree entree = new Entree(name, description, calories, price);
					menu.add(entree);
					System.out.println("made it to entree " + name);
				} else if (menuType.equalsIgnoreCase("side")) {
					Sides side = new Sides(name, description, calories, price);
					menu.add(side);
				} else if (menuType.equalsIgnoreCase("salad")) {
					Salad salad = new Salad(name, description, calories, price);
					menu.add(salad);
				} else if (menuType.equalsIgnoreCase("dessert")) {
					Dessert dessert = new Dessert(name, description, calories, price);
					menu.add(dessert);
				} else
					;
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return menu;
		
	}

	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).getName());
				bw.newLine();
				bw.write(menus.get(i).getEntree().getName());
				bw.write("@@");
				bw.write(menus.get(i).getEntree().getDescription());
				bw.write("@@");
				bw.write(menus.get(i).getEntree().getCalories());
				bw.write("@@");
				bw.write(String.valueOf(menus.get(i).getEntree().getPrice()));
				bw.write("@@");
				bw.newLine();
				bw.write(menus.get(i).getSide().getName());
				bw.write("@@");
				bw.write(menus.get(i).getSide().getDescription());
				bw.write("@@");
				bw.write(menus.get(i).getSide().getCalories());
				bw.write("@@");
				bw.write(String.valueOf(menus.get(i).getSide().getPrice()));
				bw.write("@@");
				bw.newLine();
				bw.write(menus.get(i).getSalad().getName());
				bw.write("@@");
				bw.write(menus.get(i).getSalad().getDescription());
				bw.write("@@");
				bw.write(menus.get(i).getSalad().getCalories());
				bw.write("@@");
				bw.write(String.valueOf(menus.get(i).getSalad().getPrice()));
				bw.write("@@");
				bw.newLine();
				bw.write(menus.get(i).getDessert().getName());
				bw.write("@@");
				bw.write(menus.get(i).getDessert().getDescription());
				bw.write("@@");
				bw.write(menus.get(i).getDessert().getCalories());
				bw.write("@@");
				bw.write(String.valueOf(menus.get(i).getDessert().getPrice()));
				bw.write("@@");
				bw.newLine();
				bw.write(menus.get(i).totalCalories());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).totalPrice()));
				bw.newLine();
			}
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
