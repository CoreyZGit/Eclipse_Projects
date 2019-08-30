
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IntroPrompt extends JFrame  {
       
    private JLabel Instruction;
    private JButton Begin;
    private JTextField TodaysDate;
      
    public IntroPrompt(){
        
        setTitle("New Bug Report");
        setSize(300, 120);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
                
        Instruction = new JLabel("Enter todays date and then select begin.");
        Begin = new JButton("Begin");
        TodaysDate = new JTextField(7);
            
        add(Instruction);
        add(TodaysDate);
        add(Begin);
           
        IntroHandler IHandler = new IntroHandler();
        
        Begin.addActionListener(IHandler);
        
    }
        
        public class IntroHandler implements ActionListener{
            
            FirstPrompt First = new FirstPrompt();
            BugReport BugObj = new BugReport();
    
    public void actionPerformed(ActionEvent event){
         if(event.getSource() == Begin){
         
         BugObj.Date = TodaysDate.getText();    
         IntroPrompt.this.setVisible(false);
         First.setVisible(true);
         
        
        
        
}        
    
}

}
}