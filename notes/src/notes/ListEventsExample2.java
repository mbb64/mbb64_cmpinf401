package notes;

	import javax.swing.*;
	import javax.swing.event.ListSelectionEvent;
	import javax.swing.event.ListSelectionListener;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.MouseEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseListener;
	// In this example, the class ListEventsExample2 implements ActionListener 
	// and MouseListener, which mean that it has to have the methods specified in these
	// interfaces. Also, since and object of ListEventsExample2 is also an ActionListsner and a MouseListener,
	// it adds itself as an event handler for the button and the list
	public class ListEventsExample2 implements ActionListener, MouseListener{
	    private JFrame myWindow;
	    private JButton button1;
	    
	    private JTextField text1;
	    private JList list1;
	    private DefaultListModel listModel;
	    
	    public ListEventsExample2(){
	        myWindow = new JFrame("My window");
	        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        myWindow.setResizable(false);
	        myWindow.setBounds(100,150,400,250);
	        myWindow.setLayout(null);
	        listModel = new DefaultListModel();
	        list1 = new JList(listModel);
	        button1 = new JButton("Add");
	        text1 = new JTextField();
	        text1.setBounds(20,20,250,25);
	        button1.setBounds(280,20,100,25);
	        button1.addActionListener(this);
	        
	        list1.setBounds(20,60,350,150);
	        list1.setBorder(BorderFactory.createLineBorder(Color.black));
	        list1.addMouseListener(this);
	     
	        myWindow.add(text1);
	        myWindow.add(button1);
	        myWindow.add(list1);
	        
	        myWindow.setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent event){
	        listModel.addElement(text1.getText());  
	    }

	    @Override
	    public void mouseClicked(MouseEvent event) {
	        // double click
	    		if(event.getClickCount() == 2){
	            int index = list1.getSelectedIndex();
	            if (index >= 0) 
	                JOptionPane.showMessageDialog(null, 
	                        listModel.elementAt(index).toString());
	        }
	    }

	    @Override
	    public void mouseEntered(MouseEvent arg0) {}

	    @Override
	    public void mouseExited(MouseEvent arg0) {}


	    @Override
	    public void mousePressed(MouseEvent arg0) {}

	    @Override
	    public void mouseReleased(MouseEvent arg0) {}
	    
	    public static void main(String[] args){
	        ListEventsExample2 test = new ListEventsExample2();
	    }

	}

