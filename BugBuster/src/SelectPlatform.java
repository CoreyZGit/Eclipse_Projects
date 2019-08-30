import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectPlatform extends JFrame {

    private JFrame window;
    private JPanel panel;
	private String platform;
	private String iosS;
	private String androidS;
	private String webappS;
	private String serverS;

	public SelectPlatform(){				
		
		window = new JFrame("Select Platform");  
		window.setSize(600, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);	   

	    	            
	    panel = new JPanel();
	    panel.setLayout(null);
	   
	    if(ColorClass.getGvalue() == 255 || ColorClass.getGvalue() == 51 || ColorClass.getGvalue() == 153 || ColorClass.getGvalue() == 192 || ColorClass.getGvalue() == 204)
	    {
		    
	    panel.setBackground(new Color(ColorClass.getRvalue(), ColorClass.getGvalue(), ColorClass.getBvalue()));  
	    
	    }else {
	      
	    panel.setBackground(null);
	    
	    }
	    	    
	    JButton ios = new JButton("iOS");
	    ios.setBounds(100, 170, 100, 100);    
	    panel.add(ios);
	        
	    JButton android = new JButton("Android");
	    android.setBounds(200, 170, 100, 100);    
	    panel.add(android);
	    	    
	    JButton webappClient = new JButton("Web-app");
	    webappClient.setBounds(300, 170, 100, 100);    
	    panel.add(webappClient);
	    	    
	    JButton serverSide = new JButton("Server");
	    serverSide.setBounds(400, 170, 100, 100);    
	    panel.add(serverSide);
	    
	    JLabel makeSelection = new JLabel("Select the appropriate platform for this bug or select server.");
	    makeSelection.setFont(new Font("Serif", Font.BOLD, 20));
	    makeSelection.setBounds(55, 40, 600, 100);    
	    panel.add(makeSelection);
	    
	    window.add(panel);
	    window.setVisible(true);
	        		        	
	    ios.addActionListener(
		    		new ActionListener() {
		    			public void actionPerformed(ActionEvent event) {
		    			
		    			iosS = "iOS";	
		    			platform = String.format("***Platform***: " + "%s" + " (Client)\n", iosS);
		    			window.setVisible(false);		
		    			
		    		    }    		 		
		    	    }
		    	
	 );
	    android.addActionListener(
			    	new ActionListener() {
			    		public void actionPerformed(ActionEvent event) {
			    	
			    		androidS = "Android";
			    		platform = String.format("***Platform***: " + "%s" + " (Client)\n", androidS);
			    		window.setVisible(false);	
			    						
			    		 }    		 		
			    	 }
			    	
	 );
	    webappClient.addActionListener(
				    new ActionListener() {
				    	public void actionPerformed(ActionEvent event) {
				    	
				    		
				    	webappS = "Web-App";		
				    	platform = String.format("***Platform***: " + "%s" + " (Client)\n", webappS);		
				    	window.setVisible(false);			    	
				    						
				    	  }    		 		
				      }
				    	
	 );
	    serverSide.addActionListener(
					    new ActionListener() {
					    	public void actionPerformed(ActionEvent event) {
					    
					    serverS = "Server";							    		
					    platform = String.format("***Platform***: " + "%s" + " (Node JS)\n", serverS);
					    window.setVisible(false);	
					    								    						
					       }    		 		
					   }
					    	
	 );
	    
	    	  
	        		
}
	    
	public String getPlatform() {
				
		return platform;
		
		
	}
	
	
}
