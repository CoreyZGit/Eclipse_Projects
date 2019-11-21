package AutomationPackage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddItemDeleteGUI extends JFrame{


	private JTextField numImages;
	private JTextField numClubs;
	private JCheckBox newCollection = new JCheckBox();
	private JCheckBox advanced = new JCheckBox();
	Boolean collectionBool = false;
	Boolean advancedBool = false;
	Integer images = 1;
	Integer clubs = 0;
	Integer itemInt = 0;
	
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
						
						itemInt = 3;
						configureItem();						
						window.setVisible(false);								
					}														
				}				
			);
		
		wanted.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						
						itemInt = 2;
						configureItem();					
						window.setVisible(false);
						
					}											
				}
			);
		
		collected.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						
						itemInt = 1;	
						configureItem();
						window.setVisible(false);
						
					}											
				}
			);
		
		   numImages.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		            if(numImages.getText().equals("Enter description here."))
		            {
		            	numImages.setText("");
		                repaint();
		                revalidate();
		                numImages.setCaretColor(Color.BLACK);
		            }           
		        }
		    });
		
		   numClubs.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		            if(numClubs.getText().equals("Enter description here."))
		            {
		            	numClubs.setText("");
		                repaint();
		                revalidate();
		                numClubs.setCaretColor(Color.BLACK);
		            }           
		        }
		    });
	
	}
	
	public void configureItem() {
		
		try {
			images = Integer.parseInt(numImages.getText());
			
			if(images > 10) {
				
				images = 1;
				
			}
			
			}catch(Exception e){
				
				images = 1;			
				System.out.println("Exception");
			}
			
			try {
			clubs = Integer.parseInt(numClubs.getText());
			
			if(clubs > 5) {
				
				clubs = 0;				
			}
			
			}catch(Exception e) {
				
				clubs = 0;
			}
			
			if(advanced.isSelected()) {
				
				advancedBool = true;
				
			}
			
			if(newCollection.isSelected()) {
				
				collectionBool = true;
				
			}				
		
		System.out.printf("%s%s%s%s", collectionBool, advancedBool, Integer.valueOf(images), Integer.valueOf(clubs));
			
	}
								
	public Boolean getAdvanced() {
		
		return advancedBool;
		
	}
	
	public Boolean getCollection() {
		
		return collectionBool;
		
	}
	
	public int getItemType() {
		
		return itemInt;
		
	}
	
	public int getImages() {
		
		return images;
		
	}
	
	public int getClubs() {
		
		return clubs;
		
	}
}
