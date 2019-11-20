import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AddDescription extends JFrame {
	
	private String description;
	private JLabel giveDesc;
    private JLabel giveSteps;
    private JLabel giveExpected;
    private JLabel giveActual;
    private JTextArea descriptionArea;
    private JTextArea stepsArea;  
    private JTextArea expectedArea;
    private JTextArea actualArea;
    private JButton continueButton;
    	
	public AddDescription(){
		
		JFrame window = new JFrame();
		
		window.setTitle("Valid Steps");   
	    window.setSize(600, 425); 	
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setLocationRelativeTo(null);
	    window.setResizable(false);
	    
	    JPanel panel = new JPanel();       
	    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
	    
	    if(ColorClass.getGvalue() == 255 || ColorClass.getGvalue() == 51 || ColorClass.getGvalue() == 153 || ColorClass.getGvalue() == 192 || ColorClass.getGvalue() == 204)
	    {
		    
	    panel.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));  
	    
	    }else {
	      
	    panel.setBackground(null);
	    
	    }	
	    
        giveDesc = new JLabel("In the space below enter a brief description of the bug.");
        giveSteps = new JLabel("Next enter valid steps to reproduce this bug.");
        descriptionArea = new JTextArea(3, 30);
        descriptionArea.setLineWrap(true);   
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setText("Enter description here.");
        
        descriptionArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(descriptionArea.getText().equals("Enter description here."))
	            {
	            	descriptionArea.setText("");
	                repaint();
	                revalidate();
	                descriptionArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
	    
        panel.add(giveDesc);
        panel.add(giveSteps);
        panel.add(descriptionArea);
        
        stepsArea = new JTextArea(10, 30);   
        stepsArea.setLineWrap(true);
        stepsArea.setWrapStyleWord(true);
        stepsArea.setText("Enter reproducible steps here.");
        
        stepsArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(stepsArea.getText().equals("Enter reproducible steps here."))
	            {
	            	stepsArea.setText("");
	                repaint();
	                revalidate();
	                stepsArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
        
        panel.add(stepsArea);
                 
        giveExpected = new JLabel("Enter the expected result of the previous steps.");
        giveActual = new JLabel("Enter the actual result of the previous steps.");
        expectedArea = new JTextArea(3, 30);
        expectedArea.setLineWrap(true);
        expectedArea.setWrapStyleWord(true);
        expectedArea.setText("Enter expected behavior here.");
        
        expectedArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(expectedArea.getText().equals("Enter expected behavior here."))
	            {
	            	expectedArea.setText("");
	                repaint();
	                revalidate();
	                expectedArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
        
        panel.add(giveExpected);
        panel.add(giveActual);
        panel.add(expectedArea);
               
        actualArea = new JTextArea(3, 30);
        actualArea.setLineWrap(true);
        actualArea.setWrapStyleWord(true);
        actualArea.setText("Enter the current behavior.");
        
        actualArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(actualArea.getText().equals("Enter the current behavior."))
	            {
	            	actualArea.setText("");
	                repaint();
	                revalidate();
	                actualArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
        
        panel.add(actualArea);
        
        continueButton = new JButton("                             Continue                             ");
        panel.add(continueButton);
              
	    window.add(panel); 
	    window.setVisible(true);
	   		    	    	    			
	
	    
	    continueButton.addActionListener(
    		new ActionListener() {
    			public void actionPerformed(ActionEvent event) {
    				
    				window.setVisible(false);
    			    	           	    
    			    	   description = String.format("***Description:***\n"
    			                   + "%s\n"
    			                   + "\n"
    			                   + "***Steps to reproduce:***\n"
    			                   + "%s\n" 
    			                   + "\n"
    			                   + "***Expected behavior:***\n"
    			                   + "%s\n"
    			                   + "\n"
    			                   + "***Current behavior:***\n"   			         			                   
    			                   + "%s", descriptionArea.getText(), stepsArea.getText(), expectedArea.getText(), actualArea.getText());
    			    	   
    			}
    		}
    	);
	}	  	        			
    

	
	
	 public String getDescription() {
		 
		 return description;
		 
		 
	 }
	 
    			
	
	}
	
	
