import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;


public class SelectDifficulty extends JFrame {
	
	private JLabel intro1;
	private JLabel intro2;
	private String introText1;
	private String introText2;
	private JButton easy;
	private JButton medium;
	private JButton hard;
	private JFrame window;
	private JPanel panel;
	private int difficulty = 0;

	
public int SelectDiff() {
	
	window = new JFrame("Select Difficulty");
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setLocationRelativeTo(null);
	window.setSize(300, 200);
	window.setResizable(false);
	
	panel = new JPanel();
	panel.setLayout(null);
	window.add(panel);
	
	
	introText1 = "Welcome to your daily math quiz!";
	introText2 = "Select difficulty below.";
			               
	intro1 = new JLabel(introText1);
	intro1.setBounds(35, 30, 300, 20);
	intro1.setFont(new Font("Serif", Font.BOLD, 16));
	intro1.setToolTipText("Answer as many math questions as you would like.\n"
			+			  "You will have 15 seconds per question and will be graded.");
	panel.add(intro1);
	    
	intro2 = new JLabel(introText2);
	intro2.setBounds(70, 55, 300, 20);
	intro2.setFont(new Font("Serif", Font.BOLD, 16));
	panel.add(intro2);
	
	easy = new JButton("Easy");
	easy.setBounds(15, 100, 80, 30);
	easy.setToolTipText("Elementary School Level");
	panel.add(easy);
	
	easy.addActionListener(
	    	new ActionListener() {
	    		public void actionPerformed(ActionEvent event) {
	    			
	    			difficulty = 1;
	    			
	    						
	    		}    		 		
	    	}
	    	
	    );
	
	medium = new JButton("Medium");
	medium.setBounds(108, 100, 80, 30);
	medium.setToolTipText("Middle School Level");	
	panel.add(medium);
	
	medium.addActionListener(
	    	new ActionListener() {
	    		public void actionPerformed(ActionEvent event) {
	    			
	    			difficulty = 2;
	    						
	    		}    		 		
	    	}
	    	
	    );
	
	hard = new JButton("Hard");
	hard.setBounds(200, 100, 80, 30);
	hard.setToolTipText("High School Level");	
	panel.add(hard);
	
	hard.addActionListener(
	    	new ActionListener() {
	    		public void actionPerformed(ActionEvent event) {
	    			
	    			difficulty = 3;
	    			
	    						
	    		}    		 		
	    	}
	    	
	    );
	
	while(difficulty == 0){
		
		window.setVisible(true);
		
	}		
	
	window.setVisible(false);
	return difficulty;
	
}
	


	
	
	

}
