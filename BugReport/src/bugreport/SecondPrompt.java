
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SecondPrompt extends JFrame {
       
    private JLabel Platform;
    private JButton iOS;
    private JButton Android;
    private JButton Webapp; 
    private JButton Node;
    
    public SecondPrompt(){
        
        setTitle("Specify Platform");
        setSize(400, 120);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());   
        
        Platform = new JLabel("Choose the corresponding platform this bug was found on.");
        iOS = new JButton("iOS");
        Android = new JButton("Android");
        Webapp = new JButton("Webapp");
        Node = new JButton("All Platforms");
        
        add(Platform);
        add(Android);
        add(iOS);
        add(Webapp);
        add(Node);
        
        SecondHandler SHandler = new SecondHandler();
        iOS.addActionListener(SHandler);
        Android.addActionListener(SHandler);
        Webapp.addActionListener(SHandler);    
        Node.addActionListener(SHandler);
                
    }
    
public class SecondHandler implements ActionListener{ 
    
    ThirdPrompt Third = new ThirdPrompt();  
    BugReport BugObj = new BugReport();
    
    public void actionPerformed(ActionEvent event){
               
      if(event.getSource() == iOS){
             
              BugObj.SpecPlat = "iOS";             
              SecondPrompt.this.setVisible(false); 
              Third.setVisible(true);
      }           
      else if(event.getSource() == Android){
                
              BugObj.SpecPlat = "Android";            
              SecondPrompt.this.setVisible(false);
              Third.setVisible(true);
              
      }                            
      else if(event.getSource() == Webapp){
              
              BugObj.SpecPlat = "Webapp";              
              SecondPrompt.this.setVisible(false);
              Third.setVisible(true);
                               
      }
      else if(event.getSource() == Node){
              
              BugObj.SpecPlat = "All platforms (Server)";              
              SecondPrompt.this.setVisible(false);
              Third.setVisible(true);
            
              
      
    }
      
                 
} 
    
  

 

    }


}

 
    



