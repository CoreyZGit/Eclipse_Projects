package AutomationPackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CreateCampaignGUI extends JFrame{
	
	
	private String landingPageString;
	private boolean giveawayBool = false;
	private boolean branchBool = false;
	private boolean advancedBool = false;
		
	public CreateCampaignGUI() {
		
		JFrame window = new JFrame();
		window.setTitle("Create Campaign");   
		window.setSize(320, 175); 	
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel prompt = new JLabel("Enter Landing Page URL and then select all that apply.");
		JTextField landingPage = new JTextField(25);
		JCheckBox giveaway = new JCheckBox("Create New Giveaway", false);
		JCheckBox branch = new JCheckBox("Custom Branch Information", false);
		JCheckBox advanced = new JCheckBox("Add Advanced Information", false);	
		JButton cont = new JButton("Continue");
		
		window.add(prompt);
		window.add(landingPage);
		window.add(giveaway);
		window.add(branch);
		window.add(advanced);
		window.add(cont);			
		
	    cont.addActionListener(
	    		new ActionListener() {
	    			public void actionPerformed(ActionEvent event) {
	    				
	    				if(giveaway.isSelected()){
	    					
	    					giveawayBool = true;				
	    					
	    				}
	    				
	    				if(branch.isSelected()){
	    					
	    					branchBool = true;				
	    					
	    				}
	    				
	    				if(advanced.isSelected()){
	    					
	    					advancedBool = true;				
	    					
	    				}

	    				landingPageString = landingPage.getText();
	    				window.setVisible(false);
	    				
	    			}
	    		}
	    	);
	    
	    window.setVisible(true);
	}
	
	public String getLandingPage() {
		
		return landingPageString;
		
	}
	
	public Boolean getGiveaway() {
		
		return giveawayBool;
		
	}
	
	public Boolean getBranch() {
		
		return branchBool;
		
	}
	
	public Boolean getAdvanced() {
		
		return advancedBool;
		
	}		

}
