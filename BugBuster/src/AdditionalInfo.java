import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AdditionalInfo extends JFrame {
	
	JFrame window = new JFrame();
	private String customTag;
	private int tagNumber;
	private String tagString;
	private String browser;
	private String device;
	private String specific;
	private String chromeText;
	private String safariText;
	private String firefoxText;
	private String deviceText;
	private String other;
	private int toMain;
	
	public AdditionalInfo() {
		
		JFrame window = new JFrame();	
		window.setTitle("Additional Info and Tags");   
	    window.setSize(600, 415); 	
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setLocationRelativeTo(null);
	    window.setResizable(false);
	    window.setVisible(true);
	    
	    JPanel panel1 = new JPanel();   
	    JPanel panel2 = new JPanel();   
	    JPanel panel3 = new JPanel();   
	    JPanel panel4 = new JPanel();
	    
	    panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
	    panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
	    panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
	    panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
	    
	    if(ColorClass.getGvalue() == 255 || ColorClass.getGvalue() == 51 || ColorClass.getGvalue() == 153 || ColorClass.getGvalue() == 192 || ColorClass.getGvalue() == 204)
	    {
		    
	    panel1.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));  
	    panel2.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));
	    panel3.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));
	    panel4.setBackground(null);
	    
	    }else {
	    
		panel1.setBackground(null);  
		panel2.setBackground(null);
		panel3.setBackground(null);
		panel4.setBackground(new Color(255, 153, 153));	   

	    }	
	    
    	
	    JLabel mainLabel = new JLabel("Select All That Apply");
	    panel4.add(mainLabel);	       	    
	    mainLabel.setFont(new Font("Serif", Font.BOLD, 20));
	    
	    JLabel deviceBrowser = new JLabel("Browsers and Devices");
	    deviceBrowser.setFont(new Font("Serif", Font.BOLD, 18));
	    panel1.add(deviceBrowser);
	    
	    JLabel tags = new JLabel("Tags and Labels ");
	    tags.setFont(new Font("Serif", Font.BOLD, 18));
	    panel2.add(tags);
	    
	    JLabel  bodyTags = new JLabel("Other");
	    bodyTags.setFont(new Font("Serif", Font.BOLD, 18));
	    panel3.add(bodyTags);
	            
	    JCheckBox bSpecific = new JCheckBox("Browser Specific   ", false);
	    JCheckBox dSpecific = new JCheckBox("Device Specific   ", false);
	    JCheckBox safari = new JCheckBox("Chrome");
	    JCheckBox chrome = new JCheckBox("Safari");
	    JCheckBox firefox = new JCheckBox("Firefox       ");	    
	    
	    JTextArea devices = new JTextArea("     Enter devices here", 9, 13);
	    devices.setFont(new Font("Serif", Font.BOLD, 14));
	    devices.setCaretColor(Color.WHITE);
	    devices.setLineWrap(true);
        devices.setWrapStyleWord(true);
	    
	    devices.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(devices.getText().equals("     Enter devices here"))
	            {
	            	devices.setText("");
	                repaint();
	                revalidate();
	                devices.setFont(new Font("Serif", Font.PLAIN, 14));
	                devices.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
	   
	    panel1.add(bSpecific);
	    panel1.add(dSpecific);
	    panel1.add(safari);
	    panel1.add(chrome);
	    panel1.add(firefox);
	    panel1.add(devices);
	    
    
	    JButton continueButton = new JButton("     Continue     ");
	    JCheckBox sprint = new JCheckBox("Include Sprint #     ", false);
	    JCheckBox version = new JCheckBox("Include Version #", false);
	    JCheckBox crash = new JCheckBox("Crash            ", false);
	    JCheckBox regression = new JCheckBox("Regression        ",false);
	    JCheckBox blocker = new JCheckBox("Blocker          ", false);
	    JCheckBox investigation = new JCheckBox("Investigation    ", false);	
	    JCheckBox retest = new JCheckBox("Retest           ", false);
	    JCheckBox mixpanel = new JCheckBox("Mixpanel         ", false);	   
	    JTextField custom = new JTextField("     Custom tag goes here", 15);
	    custom.setFont(new Font("Serif", Font.BOLD, 14));
	    custom.setCaretColor(Color.WHITE);	    	  
	     
	    custom.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(custom.getText().equals("     Custom tag goes here"))
	            {
	            	custom.setText("");
	                repaint();
	                revalidate();
	                custom.setFont(new Font("Serif", Font.PLAIN, 14));
	                custom.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
    
	    panel2.add(sprint);
	    panel2.add(version);
	    panel2.add(crash);
	    panel2.add(regression);
	    panel2.add(blocker);
	    panel2.add(investigation);
	    panel2.add(retest);
	    panel2.add(mixpanel);
	    panel2.add(custom);
	    panel2.add(continueButton);
	        
	    JTextArea extra = new JTextArea(" Add any other info here", 8, 13);
	    extra.setFont(new Font("Serif", Font.BOLD, 14));
	    extra.setCaretColor(Color.WHITE);
	    extra.setLineWrap(true);
        extra.setWrapStyleWord(true);
	    
	    JCheckBox feature = new JCheckBox("Include Feature Reference?");
	    JCheckBox screenShot = new JCheckBox("Screen shot provided?");
	    JCheckBox screenRecording = new JCheckBox("Screen recording provided?");
	    JCheckBox error = new JCheckBox("Error log provided?");
	    JCheckBox network = new JCheckBox("Request info provided?");
	    
	    extra.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(extra.getText().equals(" Add any other info here"))
	            {
	            	extra.setText("");
	                repaint();
	                revalidate();
	                extra.setFont(new Font("Serif", Font.PLAIN, 14));
	                extra.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
	    
	    panel3.add(extra);
	    panel3.add(feature);
	    panel3.add(screenShot);
	    panel3.add(screenRecording);
	    panel3.add(error);
	    panel3.add(network);	    	    
		       	   
	    panel1.setBounds(0, 35, 199, 365);
	    panel2.setBounds(201, 35, 199, 365);
	    panel3.setBounds(402, 35, 201, 365);
	    panel4.setBounds(0, 0, 605, 30);
	    window.add(panel1);
	    window.add(panel2);
	    window.add(panel3);
	    window.add(panel4);
	    window.setVisible(true);	  
	    
	    continueButton.addActionListener(
	    		new ActionListener() {
	    			public void actionPerformed(ActionEvent event) {
	    				    			
	    			tagNumber = 0;
	    			String[] tagArray = new String[8];
	    			
	    			
	    			if(sprint.isSelected() || version.isSelected()) {
	    				
	    			tagArray[tagNumber] = BasicInfo.getSprintVer();	
	    			tagNumber++;
	    			
	    			}
	    			
	    			if(crash.isSelected()) {
	    				
	    			tagArray[tagNumber] = "crash";	
	    			tagNumber++;
	    				
	    			}
	    			
	    			if(regression.isSelected()) {
	    				
	    			tagArray[tagNumber] = "regression";	
	    			tagNumber++;
	    			
	    			}
	    			
	    			if(blocker.isSelected()) {
	    				
		    		tagArray[tagNumber] = "blocker";	
		    		tagNumber++;
	    					    				
	    			}
	    			
	    			if(investigation.isSelected()) {
	    				
	    			tagArray[tagNumber] = "investigation";	
			    	tagNumber++;
	    				
	    			}
	    			
	    			if(retest.isSelected()) {
	    				
			    	tagArray[tagNumber] = "retest";	
			    	tagNumber++;
	    				  				
	    			}
	    			
	    			if(mixpanel.isSelected()) {
	    			
				    tagArray[tagNumber] = "mixpanel";	
				    tagNumber++;	
				
	    			}
	    			
	    			customTag = custom.getText();
	    			
	    			if(customTag.equals("     Custom tag goes here") || customTag.equals("")) {
	    			    			
			    	tagArray[tagNumber] = null;
	    				
	    			}
	    			
	    			else {
	    				
	    			tagArray[tagNumber] = customTag;	
	    				
	    			}
	    			

	    			tagString = tagArray[0] + ", " + tagArray[1] + ", " + tagArray[2] + ", " + tagArray[3] + ", " + tagArray[4] + ", " + tagArray[5] + ", " 
	    									+ tagArray[6] + ", " + tagArray[7] + ",    ";	
	    			
	    			tagString = tagString.replace(" null,","");
	    			tagString = tagString.replace("null,", "");
	    			tagString = tagString.replace(",    ", "");

	    			

	    			
	    			
	    			
	    			deviceText = devices.getText();
	    				    			
	    			if(chrome.isSelected()){
	    				
		    		chromeText = "Google Chrome";
		    				
		    		}
		    			
		    		if(safari.isSelected()) {
		    				
		    		safariText = "Apple Safari";	
		    				
		    		}
		    			
		    		if(firefox.isSelected()) {
		    				
		    		firefoxText = "Mozilla Firfox";	
		    				
		    		}
	    			
	    			
	    			if(bSpecific.isSelected()) {
	    				    			
	    			browser = String.format("###Browser Specfic \n\n%s\n%s\n%s\n\n", chromeText, safariText, firefoxText);
	    			browser = browser.replace("null", "");
	    			
	    			}
			
	    			if(dSpecific.isSelected()) {
	    				    			
	    			device = String.format("###Device Specific \n\n%s", deviceText);	
	    			
	    			}
	    			
	    			
	    			if(bSpecific.isSelected() == false && dSpecific.isSelected() == false) {
		    			
	    			browser = String.format("***Browsers:***\n\n%s\n%s\n%s\n\n", chromeText, safariText, firefoxText);
	    			device = String.format("***Devices:***\n\n%s\n\n", deviceText);
	    			
	    			}
	    			
	    			if(bSpecific.isSelected() == false && dSpecific.isSelected()) {
		    			
	    			browser = String.format("***Browsers:***\n\n%s\n%s\n%s\n\n", chromeText, safariText, firefoxText);
	    			
	    			}
	    			
	    			if(bSpecific.isSelected() == false && dSpecific.isSelected() == false) {
		    			
	    			device = String.format("***Devices:***\n\n%s\n\n", deviceText);
	    			
	    			}
	    				    			
	    			if(safari.isSelected() == false && chrome.isSelected() == false && firefox.isSelected() == false) {
	    				    			
	    			browser = null;
	    			
	    			}
	    				    			
	    			if(deviceText.equals("") || deviceText.equals( "     Enter devices here")) {
	    				
	    			device = null;	
	    				
	    			}	    			     			    					    			
	    			
	    			specific = browser + device;
	    			specific = specific.replace("null", "");
	    			

	    			
	    			
	    			
	    			List<String> extras = new ArrayList<String>(); 
	    			other = "";
	    			
	    			if(!extra.getText().equals("") && !extra.getText().equals(" Add any other info here")) {	    				
	    				    				
	    			extras.add(String.format("###Additional Info\n\n%s\n\n", extra.getText())); 
	    				
	    			}	
	    			
	    			if(feature.isSelected()) {    				
	    			
	    			extras.add("###Feature Spec Reference\n\nInclude a corresponding ticket or feaure spec here.\n\n");	 
	    			
	    			}
	    					
	    			if(screenShot.isSelected()) {
	    				
	    			extras.add("***screenshot attached***\n");
	    					    				
	    			}	    			    			
	    			
	    			if(screenRecording.isSelected()) {
	    				
	    			extras.add("***screen recording attached***\n");
	    			
	    			}	    				    
	    			
	    			if(error.isSelected()) {
	    				
	    			extras.add("***error/exception attached***\n");
   				    				
	    			}
	    			
	    			if(network.isSelected()) {
	    				
	    			extras.add("***request details attached***\n");
	    				    				
	    			}
	    			
	    			for(int i = 0; i < extras.size(); i++ ) {
	    					
	    			other = other + extras.get(i);	
	    				    				
	    			}
	    			
	    			toMain = 1;
	    			
	    			window.setVisible(false);
	    				    		
	    		}
	    	}	
	    			
	    	
	    );
		
	}
	
	
		
				
	
	public int getInfo(){
		
		
		return toMain;
				
	}
	
	public String getTags() {
		
		return tagString;
		

	}
	
	public String getBrowsersDevices() {
		
		return specific;	
		
	}
	
	public String getOther() {
		
		return other;
		
	}
	
		
	
	
	
}
