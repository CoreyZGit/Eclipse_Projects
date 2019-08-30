import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;

public class BasicInfo extends JFrame {
	
	private JPanel panel;
	private JFrame window;
	private static String verSprint;
	private String date;
	private String dateSprint;

	public BasicInfo() {
				
		ColorClass colorObj = new ColorClass(); 
	    super.setSize(600, 500);
	    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    super.setLocationRelativeTo(null);
	    super.setResizable(false);	
	    JPanel panel = new JPanel();
	    panel.setBounds(565, 5, 35, 30);

	    JButton continueButton = new JButton("Continue");
	    continueButton.setBounds(247, 200, 100, 30);    
	    super.add(continueButton);
	    
	    JLabel title = new JLabel("Bug Buster v2.0");
	    title.setFont(new Font("Serif", Font.BOLD, 18));	    
	    title.setBounds(10, 5, 150, 30); 
	    title.setToolTipText("This program has been designed to help detail and format bug tickets.  It is intended to be used with pivotal tracker!");
	    super.add(title);
		
	    JLabel progBy = new JLabel("; )");
	    progBy.setFont(new Font("Serif", Font.BOLD, 22));	    
	    progBy.setToolTipText("Programmed By: Corey Zwart");
	    panel.add(progBy);
	    
	    JLabel introText = new JLabel("Enter the date and sprint/version number below.");
	    introText.setFont(new Font("Serif", Font.PLAIN, 18));
	    introText.setBounds(125, 50, 600, 20);
	    super.add(introText);	    	 
	    
	    JTextField dateArea = new JTextField("     Enter Date");
	    dateArea.setFont(new Font("Serif", Font.BOLD, 14));
	    dateArea.setCaretColor(Color.WHITE);
	    dateArea.setBounds(240, 100, 115, 20);
	    super.add(dateArea);
	    
	    JTextField verArea = new JTextField(" Enter Ver/Sprint");
	    verArea.setFont(new Font("Serif", Font.BOLD, 14));
	    verArea.setCaretColor(Color.WHITE);
	    verArea.setBounds(240, 135, 115, 20);
	    super.add(verArea);
	   
	    PaintClass paintRect = new PaintClass();
	    super.add(paintRect);
	    super.add(panel);
	    super.setVisible(true);	
	    
	    dateArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(dateArea.getText().equals("     Enter Date"))
	            {
	            	dateArea.setText("");
	                repaint();
	                revalidate();
	                dateArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
	    
	    verArea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	            if(verArea.getText().equals(" Enter Ver/Sprint"))
	            {
	            	verArea.setText("");
	                repaint();
	                revalidate();
	                verArea.setCaretColor(Color.BLACK);
	            }           
	        }
	    });
	        	    	    
	    continueButton.addActionListener(
	    		new ActionListener() {
	    			public void actionPerformed(ActionEvent event) {
	    			
	    			date = dateArea.getText();
	    			verSprint = verArea.getText();			    			
	    					
	    			dateSprint = String.format("***First discovered:*** " + "%s" + "\n" 	                   		
	 	                   					+ "\n"
	 	                   					+ "***Version/Sprint:*** " + "%s" + "\n", date, verSprint); 	 
	    		
	    			window.setVisible(false);
	    		}  
	    			
	    			
	    	}
	    		
	);
	   
	    
	    
	    progBy.addMouseListener(new MouseAdapter()
	    {
	        public void mouseEntered(MouseEvent e)
	        {
	        		        		
	        		colorObj.ChooseColor();  		
	        		super.setBackground(new java.awt.Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue())); 	     	       
	        	         
	     }
	});
	        	   
	   
	    
	}
		 
		public String getDateSprint() {
		
		return dateSprint;
	    
 }	
		
		public static String getSprintVer() {
			
		return verSprint;	
			
		}
}
		
		
		
		
		
	   
	    
	    
	    
	
		
		
		
		

