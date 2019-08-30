
package bugreport;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FirstPrompt  extends JFrame {
    
    private JLabel Stack;
    private JButton Client;
    private JButton Server;
    private JButton Unknown;
      
public FirstPrompt(){
        
        setTitle("Stack Location");
        setSize(350, 120);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        Stack = new JLabel("Select the presumed stack location for this bug.");
        Client = new JButton("Client");
        Server = new JButton("Server");
        Unknown = new JButton("Unknown");    
        add(Stack);
        add(Client);
        add(Server);
        add(Unknown);
        
        
        FirstHandler FHandler = new FirstHandler();
        
        Client.addActionListener(FHandler);
        Server.addActionListener(FHandler);
        Unknown.addActionListener(FHandler);
        
        
}        
        
public class FirstHandler implements ActionListener{
    
    SecondPrompt Second = new SecondPrompt();
    BugReport BugObj = new BugReport();
    
    public void actionPerformed(ActionEvent event){
        
        
      if(event.getSource() == Client){
         BugObj.StackLoc = "Client";        
         FirstPrompt.this.setVisible(false); 
         Second.setVisible(true);
             }
                             
      else if(event.getSource() == Server){
         BugObj.StackLoc = "Server";        
         FirstPrompt.this.setVisible(false); 
         Second.setVisible(true);  
              }     
        
      else if(event.getSource() == Unknown){          
         BugObj.StackLoc = "Unknown";         
         FirstPrompt.this.setVisible(false); 
         Second.setVisible(true);
              }
        
        
        
    }




}

        
}




