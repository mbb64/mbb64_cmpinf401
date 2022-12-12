package mbb64_MenuManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuManagerGUI {
	private JLabel lbl;
	private JLabel lbl2;
	private JLabel createMenu;
	private JLabel lbl_entree;
	private JLabel lbl_side;
	private JLabel lbl_salad;
	private JLabel lbl_dessert;
	private JFrame mainFrame;
	private JButton button;
	private JComboBox<Entree> entreeBox;
	private JComboBox<Sides> sideBox;
	private JComboBox<Salad> saladBox;
	private JComboBox<Dessert> dessertBox;
	private JTextField field;
	private MenuManager menu;
	
	public MenuManagerGUI() {
		menu = new MenuManager("data/dishes.txt");
		initGUI();
	}
	private void initGUI() {
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Create Menu With These Dishes");
		button.setBounds(20, 230, 200, 29);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String createdName = JOptionPane.showInputDialog("Please input a name for the menu");
				Menu createdMenu = new Menu(createdName);
				createdMenu.setEntree((Entree)entreeBox.getSelectedItem());
				createdMenu.setSide((Sides)sideBox.getSelectedItem());
				createdMenu.setSalad((Salad)saladBox.getSelectedItem());
				createdMenu.setDessert((Dessert)dessertBox.getSelectedItem());
			}
		});
		mainFrame.getContentPane().add(button);

		
		
		lbl = new JLabel("Build your own menu");
		lbl.setBounds(10, 10, 150, 30);
		mainFrame.getContentPane().add(lbl);
		
		lbl2 = new JLabel("Generate a menu");
		lbl2.setBounds(10, 300, 150, 30);
		mainFrame.getContentPane().add(lbl2);
		
		lbl_entree = new JLabel("Entree");
		lbl_entree.setBounds(20, 40, 150, 30);
		mainFrame.getContentPane().add(lbl_entree);
		
		lbl_side = new JLabel("Side");
		lbl_side.setBounds(20, 90, 150, 30);
		mainFrame.getContentPane().add(lbl_side);
		
		lbl_salad = new JLabel("Salad");
		lbl_salad.setBounds(20, 140, 150, 30);
		mainFrame.getContentPane().add(lbl_salad);
		
		lbl_dessert = new JLabel("Dessert");
		lbl_dessert.setBounds(20, 190, 150, 30);
		mainFrame.getContentPane().add(lbl_dessert);
		
		createMenu = new JLabel("Created Menus");
		createMenu.setBounds(300, 20, 150, 30);
		mainFrame.getContentPane().add(createMenu);
		
		field = new JTextField("");
		field.setBounds(275, 225, 200, 200);
		mainFrame.getContentPane().add(entreeBox);
		
		entreeBox = new JComboBox<Entree>((Entree[]) menu.getEntrees().toArray());
		entreeBox.setBounds(20, 140, 150, 30);
		entreeBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(entreeBox);
		
		sideBox = new JComboBox<Sides>((Sides[]) menu.getSides().toArray()); 
		sideBox.setBounds(20, 140, 150, 30);
		sideBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(sideBox);
		
		saladBox = new JComboBox<Salad>((Salad[]) menu.getSalads().toArray()); 
		saladBox.setBounds(20, 140, 150, 30);
		saladBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(saladBox);
		
		dessertBox = new JComboBox<Dessert>((Dessert[]) menu.getDesserts().toArray()); 
		dessertBox.setBounds(20, 140, 150, 30);
		dessertBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(dessertBox);
		
		
	}

	public static void main(String[] args) {

		MenuManagerGUI gui = new MenuManagerGUI();
		gui.mainFrame.setVisible(true);
	}

}
