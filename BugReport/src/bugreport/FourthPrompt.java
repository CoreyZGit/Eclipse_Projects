
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FourthPrompt extends JFrame {
    
    private JLabel Specific;
    private JLabel Specific2;
    private JTextArea Browser; 
    private JButton AddList; 
    private JButton NonApplicable;       
     
public FourthPrompt(){ 
    
    setTitle("Browses and Devices");
        setSize(360, 200);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
             
    Specific = new JLabel("Is this bug specific to certain browsers or devices?");
    Specific2 = new JLabel("(List all that apply then select continue)");
    Browser = new JTextArea(8, 10);
    Browser.setLineWrap(true);
    Browser.setWrapStyleWord(true);
    Browser.setLineWrap(true);
    AddList = new JButton("Continue");        
    NonApplicable = new JButton("N/A");
    add(Specific);
    add(Browser);
    add(AddList);
    add(NonApplicable);
    
    FourthHandler FHandler = new FourthHandler();
    
    AddList.addActionListener(FHandler);
    NonApplicable.addActionListener(FHandler);
        
    
}

public class FourthHandler implements ActionListener{
    
    FifthPrompt Fifth = new FifthPrompt();
    BugReport BugObj = new BugReport();
    
    public void actionPerformed(ActionEvent event){
        
        if(event.getSource() == AddList){    
            BugObj.BrowsersDevices = Browser.getText();
            FourthPrompt.this.setVisible(false); 
            Fifth.setVisible(true);
            
        }
        else if(event.getSource() == NonApplicable){
            BugObj.BrowsersDevices = "Not specific";
            FourthPrompt.this.setVisible(false);
            Fifth.setVisible(true);
            
            
            
            
        } 
        
        
       
        
    }
    
    
}



}