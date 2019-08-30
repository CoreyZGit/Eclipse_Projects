
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class FifthPrompt extends JFrame {
    
    private JLabel GiveDesc;
    private JLabel GiveSteps;
    private JLabel GiveExpected;
    private JLabel GiveActual;
    private JLabel Continue;
    private JTextArea Description;
    private JTextArea Steps;  
    private JTextArea Expected;
    private JTextArea Actual;
    private JButton DescCont;
    
         
    public FifthPrompt(){
        
        setTitle("Description");
        setSize(500, 500);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        GiveDesc = new JLabel("In the space below enter a brief description of the bug.");
        GiveSteps = new JLabel("Next enter valid steps to reproduce this bug.");
        Description = new JTextArea(3, 30);
        Description.setLineWrap(true);   
        Description.setWrapStyleWord(true);
        Steps = new JTextArea(10, 30);   
        Steps.setLineWrap(true);
        Steps.setWrapStyleWord(true);
        GiveExpected = new JLabel("Enter the expected result of the previous steps.");
        GiveActual = new JLabel("Enter the actual results of the previous steps you entered.");
        Expected = new JTextArea(3, 30);
        Expected.setLineWrap(true);
        Expected.setWrapStyleWord(true);
        Actual = new JTextArea(3, 30);
        Actual.setLineWrap(true);
        Actual.setWrapStyleWord(true);
        Continue = new JLabel("Select continue after filling out the necessary fields.");
        DescCont = new JButton("Continue");
        
        add(GiveDesc);
        add(Description);
        add(GiveSteps);
        add(Steps);
        add(GiveExpected);
        add(Expected);
        add(GiveActual);
        add(Actual);
        add(Continue);
        add(DescCont);
        
       FifthHandler FiHandler = new FifthHandler();
       
       DescCont.addActionListener(FiHandler);
          
    }
    
   public class FifthHandler implements ActionListener{
            
       FinalFormat Format = new FinalFormat();
       BugReport BugObj = new BugReport();
    
   public void actionPerformed(ActionEvent event){
       
       if(event.getSource() == DescCont){
           
         BugObj.DescText = Description.getText();
         BugObj.StepsText = Steps.getText();
         BugObj.ExpectedText = Expected.getText();
         BugObj.ActualText = Actual.getText();
         
         FifthPrompt.this.setVisible(false);
         Format.setVisible(true);
         
        
         
        
         
       
           
       }
       
       
   } 
    
    
    
}
    
    
}
