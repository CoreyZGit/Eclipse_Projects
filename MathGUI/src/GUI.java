import java.awt.*;
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
    private String aprompt;
    private String answer;
    private Font font1; 
    private Color green = Color.GREEN;
    private Color red = Color.RED;
    private Color blue = Color.BLUE;
    private Color orange = Color.ORANGE;
    private Color pink = Color.PINK;
    private Color white = Color.WHITE;
    private int colorVar = 0;
    private String userInput;
   
    
    Logic mathLog = new Logic();
    int firstnum = 0;
    int secondnum = 0;
    int realAnswer = 0;
    int[] numArray;
    
    
    

public GUI() {
	
	numArray = mathLog.questionValues(firstnum, secondnum, realAnswer);
	qprompt = mathLog.question(numArray);
	System.out.println(Arrays.toString(numArray));
	
    window = new JFrame("Daily Math Quiz!");   
    window.setResizable(false);
    window.setSize(600, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    
    panel = new JPanel();
    panel.setLayout(null);
    window.add(panel);
    
    dailyMathQuiz = new JLabel("Daily Math Quiz");
    dailyMathQuiz.setBounds(10, 10, 300, 25);
    panel.add(dailyMathQuiz);
    dailyMathQuiz.setFont(new Font("Serif", Font.PLAIN, 24));
         
    hover = new JLabel("; )");
    hover.setFont(new Font("Serif", Font.PLAIN, 24));
    hover.setBounds(560, 540, 50, 25);
    hover.setToolTipText("Programmed By: Corey Zwart");
    panel.add(hover);
    
    color = new JButton("Color");
    color.setBounds(10, 540, 80, 25);    
    panel.add(color);
    
    done = new JButton("Done");
    done.setBounds(500, 10, 80, 25);
    panel.add(done);
    
    nextQ = new JButton("Next");
    nextQ.setBounds(258, 300 ,80, 25);
    panel.add(nextQ);
    
    inputField = new JTextField();
    inputField.setBounds(250, 180, 100, 100);
    font1 = new Font("SansSerif", Font.BOLD, 50);
    inputField.setFont(font1);
    inputField.setHorizontalAlignment(JTextField.CENTER);
    panel.add(inputField);
    
    response = new JLabel();
    response.setFont(new Font("Serif", Font.PLAIN, 35));
	response.setBounds(245, 350, 300, 40);
	panel.add(response);
	
	answerlabel = new JLabel();
    answerlabel.setFont(new Font("Serif", Font.PLAIN, 20));
    answerlabel.setBounds(195, 450, 300, 25);
    panel.add(answerlabel);
    
    question = new JLabel(qprompt);
    question.setFont(new Font("Serif", Font.PLAIN, 22));
    question.setBounds(155, 110, 600, 25);
    panel.add(question);
      
    window.setVisible(true);
    
    HandlerClass handler = new HandlerClass();
    
    color.addActionListener(handler);
    done.addActionListener(handler);
    inputField.addActionListener(handler);
    inputField.addActionListener(handler);
   
}




private class HandlerClass implements ActionListener{
	
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
				
				panel.setBackground(blue);
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
				
				panel.setBackground(null);
				colorVar = colorVar - 5;
		}
			
			
		}	


		
		if(event.getSource() == inputField) { 
			
			answer = String.format("%d", numArray[2]);
			userInput = inputField.getText();
			
			if(answer.equals(userInput)) {			
			response.setText("Correct!");
			inputField.setText("");
				
			}else {
				
			response.setText("Wrong!");
			answerlabel.setText("The correct answer was " + answer);		
			inputField.setText("");
			
			}	
		}
		
		if(event.getSource() == nextQ) { 
			
		
			numArray = mathLog.questionValues(firstnum, secondnum, realAnswer);
			qprompt = mathLog.question(numArray);
			response.setText("");
			answerlabel.setText("");
			question.setText(qprompt);
		
		}
		
		
		
		
		
}
}
}