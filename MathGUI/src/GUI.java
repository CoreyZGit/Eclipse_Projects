import java.awt.*;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {
    
    private JLabel dailyMathQuiz;
    private JLabel question;
    private JLabel response;
    private JLabel answerlabel;
    private JLabel hover;
    private JTextField inputField;
    private JButton color;
    private JButton done;  
    private JButton nextQ;
    private JFrame window;
    private JPanel panel;
    private String qprompt;
    private String answer;
    private Font font1; 
    private Color green = Color.GREEN;
    private Color red = Color.RED;
    private Color lightBlue = new Color(31, 190, 214);
    private Color orange = Color.ORANGE;
    private Color pink = Color.PINK;
    private Color white = Color.WHITE;
    private int colorVar = 0;
    private String userInput;
    
    
    Logic mathLog = new Logic();
    int firstnum;
    int secondnum;
    int realAnswer;
    int[] numArray;
    int correctInp;
    int totalInp;
    
    
    

public GUI() {
	
    window = new JFrame("Daily Math Quiz!");   
    window.setSize(600, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setResizable(false);
    
    panel = new JPanel();
    panel.setLayout(null);
    window.add(panel);
    
    dailyMathQuiz = new JLabel("Daily Math Quiz");
    dailyMathQuiz.setToolTipText("Enter your answer and select enter." + " After answering each question select Next.");
    dailyMathQuiz.setBounds(10, 10, 300, 25);
    panel.add(dailyMathQuiz);
    dailyMathQuiz.setFont(new Font("Serif", Font.BOLD, 24));
         
    hover = new JLabel("; )");
    hover.setFont(new Font("Serif", Font.BOLD, 24));
    hover.setBounds(560, 540, 50, 25);
    hover.setToolTipText("Programmed By: Corey Zwart");
    panel.add(hover);
    
    color = new JButton("Color");
    color.setBounds(10, 540, 80, 25);    
    panel.add(color);
    
    done = new JButton("Done");
    done.setBounds(505, 10, 80, 25);
    panel.add(done);
    
    nextQ = new JButton("Next");
    nextQ.setBounds(259, 300 ,80, 25);
    panel.add(nextQ);
    
    inputField = new JTextField();
    inputField.setBounds(250, 180, 100, 100);
    font1 = new Font("SansSerif", Font.BOLD, 50);
    inputField.setFont(font1);
    inputField.setHorizontalAlignment(JTextField.CENTER);
    panel.add(inputField);
    
    response = new JLabel();
    response.setFont(new Font("Serif", Font.BOLD, 35));
	response.setBounds(240, 350, 300, 40);
	panel.add(response);
	
	answerlabel = new JLabel();
    answerlabel.setFont(new Font("Serif", Font.BOLD, 20));
    answerlabel.setBounds(192, 450, 300, 25);
    panel.add(answerlabel);
    
    numArray = mathLog.questionValues(firstnum, secondnum, realAnswer);
   	qprompt = mathLog.question(numArray);
   	System.out.println(Arrays.toString(numArray));
       
    question = new JLabel(qprompt);
    question.setFont(new Font("Serif", Font.BOLD, 22));
    question.setBounds(152, 110, 600, 30);
    panel.add(question);
      
    window.setVisible(true);
      
    HandlerClass handler = new HandlerClass();
    
    color.addActionListener(handler);
    done.addActionListener(handler);
    inputField.addActionListener(handler);
    nextQ.addActionListener(handler);
    
    
		
	   
}




private class HandlerClass implements ActionListener{
	
	 private long startTime = System.currentTimeMillis();

	public void actionPerformed(ActionEvent event) {
			
		if(event.getSource() == color) {
			
			if(colorVar == 0) {
			
				panel.setBackground(green);
				colorVar++;
		}
			else if(colorVar == 1) {
				
				panel.setBackground(red);
				colorVar++;
		}
	
			else if(colorVar == 2) {
				
				panel.setBackground(lightBlue);
				colorVar++;
		}
			else if(colorVar == 3) {
				
				panel.setBackground(orange);
				colorVar++;
		}
	
			else if(colorVar == 4) {
				
				panel.setBackground(pink);
				colorVar++;
		}
			
			else if(colorVar == 5) {
				
				panel.setBackground(white);
				colorVar++;
		}
					
			
			else if(colorVar == 6) {
				
				panel.setBackground(null);
				colorVar = colorVar - 6;
		}
			
			
		}	
		
		if(event.getSource() == inputField) { 
					
			answer = String.format("%d", numArray[2]);
			userInput = inputField.getText();
			long timePassed = System.currentTimeMillis() - startTime;
			inputField.setText(null);
						
			if((timePassed > 15000) && (answer.equals(userInput))) {
									
			response.setText("Wrong!");	
			answerlabel.setText(null);	
			totalInp++;
				
			}
									
			if(answer.equals(userInput) && (timePassed < 15000)) {			
			response.setText("Correct!");			
			correctInp++;
			totalInp++;
			System.out.println(correctInp + totalInp);							
				
			}
			
			else {
			response.setText("Wrong!");
			
			if(timePassed > 15000) {
			answerlabel.setText("You have run out of time!");		
			}
			
			else {
			answerlabel.setText("The correct answer was " + answer);
			totalInp++;
			System.out.println(correctInp + totalInp);
			}
		
		}
			
		}
		
		if(event.getSource() == nextQ) { 
			
			startTime = System.currentTimeMillis();												
			numArray = mathLog.questionValues(firstnum, secondnum, realAnswer);
			qprompt = mathLog.question(numArray);
			response.setText("");
			answerlabel.setText("");
			question.setText(qprompt);
			
			if(userInput == null) {
				
				totalInp++;		
			}	
			
		}
			
		
		
		
		if(event.getSource() == done) {
			
			window.setVisible(false);
			FinalScore scoreGUI = new FinalScore(correctInp, totalInp);
			
						
			
		}
				
		
}
}
}

		