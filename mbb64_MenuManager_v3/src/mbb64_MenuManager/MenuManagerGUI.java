package mbb64_MenuManager;

import javax.swing.*;

public class MenuManagerGUI {
	private JLabel lbl;
	private JLabel lbl2;
	private JLabel lbl_entree;
	private JLabel lbl_side;
	private JLabel lbl_salad;
	private JLabel lbl_dessert;
	private JFrame mainFrame;
	private JButton button;
	private JComboBox entreeBox;
	private JTextField field;
	private MenuManager menu;
	
	public MenuManager() {
		menu = new MenuManager();
		initGUI();
	}
	private void initGUI() {
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setVisible(true);
		
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
		
		entreeBox = new JComboBox<Entree>((Entree[]) menu.getEntrees().toArray()); 
		entreeBox.setBounds(20, 140, 150, 30);
		mainFrame.getContentPane().add(entreeBox);
		
		
		
		
	}

	public static void main(String[] args) {

		MenuManager gui = new MenuManager();
	}

}
