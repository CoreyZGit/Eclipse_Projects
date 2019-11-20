
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

@SuppressWarnings("serial")
public class BasicInfo extends JFrame {
	
	private static String verSprint;
	private String date;
	private String dateSprint;

	public BasicInfo() {
				
		JFrame window = new JFrame();
		ColorClass colorObj = new ColorClass(); 
		window.setSize(600, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);	
	    JPanel panel = new JPanel();
	    panel.setBounds(565, 5, 35, 30);
	    panel.setLayout(null);

	    JButton continueButton = new JButton("Continue");
	    continueButton.setBounds(247, 200, 100, 30);    
	    panel.add(continueButton);
	    
	    JLabel title = new JLabel("Bug Buster v2.0");
	    title.setFont(new Font("Serif", Font.BOLD, 18));	    
	    title.setBounds(10, 5, 150, 30); 
	    title.setToolTipText("This program has been designed to help detail and format bug tickets.  It is intended to be used with pivotal tracker!");
	    panel.add(title);
		
	    JLabel progBy = new JLabel("; )");
	    progBy.setFont(new Font("Serif", Font.BOLD, 22));	    
	    progBy.setToolTipText("Programmed By: Corey Zwart");
	    progBy.setBounds(565, 3, 30, 30);
	    panel.add(progBy);
	    
	    JLabel introText = new JLabel("Enter the date and sprint/version number below.");
	    introText.setFont(new Font("Serif", Font.PLAIN, 18));
	    introText.setBounds(125, 50, 600, 20);
	    panel.add(introText);	    	 
	    
	    JTextField dateArea = new JTextField("     Enter Date");
	    dateArea.setFont(new Font("Serif", Font.BOLD, 14));
	    dateArea.setCaretColor(Color.WHITE);
	    dateArea.setBounds(240, 100, 115, 20);
	    panel.add(dateArea);
	    
	    JTextField verArea = new JTextField(" Enter Ver/Sprint");
	    verArea.setFont(new Font("Serif", Font.BOLD, 14));
	    verArea.setCaretColor(Color.WHITE);
	    verArea.setBounds(240, 135, 115, 20);
	    panel.add(verArea);
	   
	    window.add(panel);
	    window.setVisible(true);	
	    
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
	        		panel.setBackground(new java.awt.Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue())); 	     	       
	        	         
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
		
		
		
		
		
	   
	    
	    
	    
	
		
		
		
		

