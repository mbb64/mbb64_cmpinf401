package mbb64_MenuManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;



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
	private JButton btnDetails;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnRandom;
	private JComboBox<Entree> entreeBox;
	private JComboBox<Sides> sideBox;
	private JComboBox<Salad> saladBox;
	private JComboBox<Dessert> dessertBox;
	private MenuManager menu;
    private JList list1;
    private DefaultListModel listModel;
	
	public MenuManagerGUI() {
		menu = new MenuManager("data/dishes.txt");
		initGUI();
	}
	private void initGUI() {
		mainFrame = new JFrame("Menu Manager");
		mainFrame.setBounds(100, 100, 500, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		
		 listModel = new DefaultListModel();
	        list1 = new JList(listModel);
	        list1.setBounds(275, 50, 200, 200);
	        list1.setBorder(BorderFactory.createLineBorder(Color.black));
	        mainFrame.getContentPane().add(list1);
	        
	        
	        btnDetails = new JButton("Details");
	        btnDetails.setBounds(275, 260, 100, 29);
	        mainFrame.getContentPane().add(btnDetails);
	        btnDetails.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent a) {
	        		if(a.getSource()==btnDetails) {
	        			
	        			int selectedIndex = list1.getSelectedIndex();
	        		    Menu item = (Menu)listModel.getElementAt(selectedIndex); 
	        			
	        			JFrame newWindow = new JFrame("Menu: " + item.getName());
	        			newWindow.setBounds(100, 100, 700, 800);
	        			newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        			newWindow.getContentPane().setLayout(null);
	        			newWindow.setVisible(true);
	        			
	        			JLabel labelE = new JLabel("Entree:");
	        			labelE.setBounds(20, 40, 150, 30);
	        			newWindow.getContentPane().add(labelE);
	        			
	        			JTextArea txtE = new JTextArea(item.getEntree().newString());
	        			txtE.setBounds(80, 40, 600, 100);
	        			txtE.setEditable(false);
	        			txtE.setLineWrap(true);
	        			newWindow.getContentPane().add(txtE);
	        			
	        			JLabel labelS = new JLabel("Side:");
	        			labelS.setBounds(20, 140, 150, 30);
	        			newWindow.getContentPane().add(labelS);
	        			
	        			JTextArea txtS = new JTextArea(item.getSide().newString());
	        			txtS.setBounds(80, 140, 600, 100);
	        			txtS.setEditable(false);
	        			txtS.setLineWrap(true);
	        			newWindow.getContentPane().add(txtS);
	        			
	        			JLabel labelSld = new JLabel("Salad:");
	        			labelSld.setBounds(20, 240, 150, 30);
	        			newWindow.getContentPane().add(labelSld);
	        			
	        			JTextArea txtSld = new JTextArea(item.getSalad().newString());
	        			txtSld.setBounds(80, 240, 600, 100);
	        			txtSld.setEditable(false);
	        			txtSld.setLineWrap(true);
	        			newWindow.getContentPane().add(txtSld);;
	        			
	        			JLabel labelD = new JLabel("Dessert:");
	        			labelD.setBounds(20, 340, 150, 30);
	        			newWindow.getContentPane().add(labelD);
	        			
	        			JTextArea txtD = new JTextArea(item.getDessert().newString());
	        			txtD.setBounds(80, 340, 600, 100);
	        			txtD.setEditable(false);
	        			txtD.setLineWrap(true);
	        			newWindow.getContentPane().add(txtD);
	        			
	        			JLabel labelCal = new JLabel("Total Calories:");
	        			labelCal.setBounds(20, 440, 150, 30);
	        			newWindow.getContentPane().add(labelCal);
	        			
	        			JTextArea txtCal = new JTextArea(Integer.toString(item.totalCalories()));
	        			txtCal.setBounds(120, 440, 150, 30);
	        			txtCal.setEditable(false);
	        			txtCal.setLineWrap(true);
	        			newWindow.getContentPane().add(txtCal);
	        			
	        			JLabel labelPrice = new JLabel("Total Price: $");
	        			labelPrice.setBounds(20, 490, 150, 30);
	        			newWindow.getContentPane().add(labelPrice);
	        			
	        			JTextArea txtPrice = new JTextArea(Double.toString(item.totalPrice()));
	        			txtPrice.setBounds(120, 490, 150, 30);
	        			txtPrice.setEditable(false);
	        			txtPrice.setLineWrap(true);
	        			newWindow.getContentPane().add(txtPrice);
	        		}
	        	}
	        });
	        
	        
	        btnDelete = new JButton("Delete All");
	        btnDelete.setBounds(380, 260, 100, 29);
	        mainFrame.getContentPane().add(btnDelete);
	        btnDelete.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent b) {
	        	listModel.removeAllElements();
	        	}
	        });
	        
	        
	        btnSave = new JButton("Save");
	        btnSave.setBounds(328, 295, 100, 29);
	        mainFrame.getContentPane().add(btnSave);
	        btnSave.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent c) {
	        	}
	        });
	        		
	        		
	        		
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
				listModel.addElement(createdMenu);
			}
		});
		mainFrame.getContentPane().add(button);

		
		
		lbl = new JLabel("Build your own menu");
		lbl.setBounds(10, 10, 150, 30);
		mainFrame.getContentPane().add(lbl);
		
		lbl2 = new JLabel("Generate a menu");
		lbl2.setBounds(10, 300, 150, 30);
		mainFrame.getContentPane().add(lbl2);
		
		btnRandom = new JButton("Generate a Random Menu");
		btnRandom.setBounds(10, 340, 200, 29);
		mainFrame.getContentPane().add(btnRandom);
		 btnRandom.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent d) {
	        		String userCreatedMenu = JOptionPane.showInputDialog("Please input a name for the random menu");
	        		Menu userRandomMenu = menu.randomMenu(userCreatedMenu);
	        		listModel.addElement(userRandomMenu);
	        	}
	        });
		
		
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
	        
	        
	        
		/*field = new ();
		field.setBounds(275, 50, 200, 200);
		mainFrame.getContentPane().add(field);
		*/
		
		entreeBox = new JComboBox(menu.getEntrees().toArray());
		entreeBox.setBounds(65, 40, 150, 30);
		entreeBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(entreeBox);
		
		sideBox = new JComboBox(menu.getSides().toArray()); 
		sideBox.setBounds(65, 90, 150, 30);
		sideBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(sideBox);
		
		saladBox = new JComboBox(menu.getSalads().toArray()); 
		saladBox.setBounds(65, 140, 150, 30);
		saladBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(saladBox);
		
		dessertBox = new JComboBox(menu.getDesserts().toArray()); 
		dessertBox.setBounds(65, 190, 150, 30);
		dessertBox.setSelectedIndex(-1);
		mainFrame.getContentPane().add(dessertBox);
		
		
	}

	public static void main(String[] args) {

		MenuManagerGUI gui = new MenuManagerGUI();
		gui.mainFrame.setVisible(true);
	}

}
