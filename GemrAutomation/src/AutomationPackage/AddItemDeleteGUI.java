package AutomationPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddItemDeleteGUI extends JFrame{

	private JLabel prompt;
	private JTextField numImages;
	private JTextField numClubs;
	private JButton forSale;
	private JButton wanted;
	private JButton collected;
	private JCheckBox newCollection = new JCheckBox();
	private JCheckBox advanced = new JCheckBox();
	Boolean collectionBool = false;
	Boolean advancedBool = false;
	
	public AddItemDeleteGUI() {
		
		JFrame window = new JFrame();
		window.setTitle("Create Campaign");   
		window.setSize(375, 140); 	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		window.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel prompt = new JLabel("Fill out all applicable fields for adding an item.");
		JTextField numImages = new JTextField("Number of images" , 10);
		JTextField numClubs = new JTextField("Number of clubs", 10);
		JCheckBox newCollection = new JCheckBox("Create new collection", false);
		JCheckBox advanced = new JCheckBox("Add advanced information", false);	
		JButton forSale = new JButton("For Sale");
		JButton wanted = new JButton("Wanted");
		JButton collected = new JButton("Collected");	
		
		window.add(prompt);
		window.add(numImages);
		window.add(numClubs);
		window.add(newCollection);
		window.add(advanced);
		window.add(forSale);	
		window.add(wanted);
		window.add(collected);	
		window.setVisible(true);
		
		forSale.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						
						Integer itemInt = 1;
						typeOfItem(1);
						
						
						
					}														
				}				
			);
		
		wanted.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						
						Integer itemInt = 1;
						typeOfItem(1);
						
						
					}											
				}
			);
		
		collected.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						
						Integer itemInt = 1;
						typeOfItem(1);
						
						
					}											
				}
			);
						
	}
	
	public void typeOfItem(Integer itemType) {
		
		try {
		Integer images = Integer.parseInt(numImages.getText());
		}catch(Exception e){
			
			Integer images = 1;
		}
		
		try {
		Integer clubs = Integer.parseInt(numClubs.getText());
		}catch(Exception e) {
			
			Integer clubs = 0;
		}
		
		if(advanced.isSelected()) {
			
			advancedBool = true;
			
		}
		
		if(newCollection.isSelected()) {
			
			collectionBool = true;
			
		}
		
	}
	
}
