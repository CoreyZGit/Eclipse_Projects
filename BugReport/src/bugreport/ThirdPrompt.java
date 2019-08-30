
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThirdPrompt extends JFrame {
    
    private JLabel Version;
    private JTextField VerInput;
    private JLabel PromptProd;
    private JButton ProdYes;
    private JButton ProdNo;
    
 
public ThirdPrompt(){
    
        setTitle("Version or Sprint");
        setSize(500, 120);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    
        Version = new JLabel("Enter the application version or current sprint in the text box."); 
        VerInput = new JTextField(7);
        PromptProd = new JLabel("Is this bug also in production?");
        ProdYes = new JButton("Yes");
        ProdNo = new JButton("No");
        
        add(Version);
        add(VerInput);
        add(PromptProd);
        add(ProdYes);
        add(ProdNo);
        
        ThirdHandler THandler = new ThirdHandler();
        
        
        ProdYes.addActionListener(THandler);
        ProdNo.addActionListener(THandler);
                
        
}

public class ThirdHandler implements ActionListener{
    
    FourthPrompt Fourth = new FourthPrompt();
    BugReport BugObj = new BugReport();
     
   
    public void actionPerformed(ActionEvent event){
   
    if(event.getSource() == ProdYes){
        BugObj.VerSprint = VerInput.getText();
        BugObj.SpecProd = "true";
        ThirdPrompt.this.setVisible(false);
        Fourth.setVisible(true);        }          
                
    else if (event.getSource() == ProdNo){    
        BugObj.VerSprint = VerInput.getText();
        BugObj.SpecProd = "false"; 
        ThirdPrompt.this.setVisible(false);
        Fourth.setVisible(true);
        
        
                }
    
   
    }   
}
}