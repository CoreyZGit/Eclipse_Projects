
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;

public class FinalScore extends JFrame {
	
	private JFrame window;
	private JPanel panel;
	private JButton submit;
	private JLabel scoreLabel;
	private float correct;
	private int intcorrect;
	private int total;
	private float percent;
	private int intpercent;
	private String scoreString;
	private JLabel infoPrompt;
	private JTextArea userInfo;
	private String submission;
	private String difficulty;
	MathGUI math = new MathGUI();
	
	
public FinalScore(float correctInp, int totalInp){
	
	window = new JFrame("Daily Math Quiz!");   
    window.setResizable(false);
    window.setSize(300, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setResizable(false);
    
    panel = new JPanel();
    panel.setLayout(null);
    window.add(panel);
    
    submit = new JButton("Submit");
    submit.setFont(new Font("Serif", Font.BOLD, 24));
    submit.setBounds(0 ,145 , 294, 30);
    panel.add(submit);
    
    submit.addActionListener(
    	new ActionListener() {
    		public void actionPerformed(ActionEvent event) {
    			
    			submission = userInfo.getText();
    			window.setVisible(false);
    		    percent = (correct/total)*100;
    		    intpercent = Math.round(percent);    		    
    		    DocumentScore document = new DocumentScore();
    		    
    		    
    		    
    		    try {
    		    	
					document.Document(submission, difficulty, intpercent);
					
				} catch (IOException e) {
					
					
					
				}
    		       		    
    		}    		 		
    	}
    	
    );
      
    correct = correctInp;
    intcorrect = Math.round(correct);
    total = totalInp;  
  
    scoreString = String.format("You scored %d/%d", intcorrect, total); 

    scoreLabel = new JLabel(scoreString);
    scoreLabel.setFont(new Font("Serif", Font.BOLD, 35));
    scoreLabel.setBounds(33, 20, 300, 30);
    panel.add(scoreLabel);
    
    infoPrompt = new JLabel("Enter name and date below.");
    infoPrompt.setFont(new Font("Serif", Font.PLAIN, 18));
    infoPrompt.setBounds(45, 55, 300, 30);
    panel.add(infoPrompt);
    
    userInfo = new JTextArea();
    userInfo.setFont(new Font("Serif", Font.BOLD, 14));
    userInfo.setBounds(65, 100, 160, 20);
    panel.add(userInfo);
      
    window.setVisible(true);
    
    switch(math.chosendiff) {
    
    case 1:
    	
    	difficulty = "Easy";
    	
    break;	
    
    case 2:
    	
    	difficulty = "Medium";
    	
    break;
    
    case 3:
    	
    	difficulty = "Hard";
    	
    break;
        
    }
    

}
	
	
	
	
	
	

}
