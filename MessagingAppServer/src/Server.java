import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Server extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	//constructor for messaging window
	public Server() {
		super("Server Message Window");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {					
					public void actionPerformed(ActionEvent event) {
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}								
				);
		
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(350, 200);
		setVisible(true);
		
		
	}
	
	//set up and run the server
	public void startRunning() {
		try {
			
			server = new ServerSocket(6789, 100);
			while(true){
				try {
					//connect to client
					waitForConnection();
					setUpStreams();
					whileChatting();
					
				}catch(EOFException eofException) {
					showMessage("\nServer terminated the connection! ");
						
				}finally {
					
					closeCrap();
					
				}
			}	
		}catch(IOException ioException){
			ioException.printStackTrace();		
		}		
	}
	//wait for connection, then display connection information
	private void waitForConnection() throws IOException{
		showMessage("Waiting for client... \n");
		connection = server.accept();
		showMessage("Now connected to: " + connection.getInetAddress().getHostName());
				
	}
	//get stream to send and recieve data
	private void setUpStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\nIO streams engagning.\n");
	
	}
	//controls the chat conversation
	private void whileChatting() throws IOException{
		
		String message = "You are now connected!";
		sendMessage(message);
		ableToType(true);
		do { //have a conversation
			try {
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){				
				showMessage("\n idk wtf that user sent!");
				
			}
		}while(!message.equals("CLIENT - END"));	
	}
	
	//close streams and sockets after done chatting
	public void closeCrap() {
		showMessage("\nTerminating scoket connection... \n");
		ableToType(false);
		try {
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException) {
			ioException.printStackTrace();				
		}
	}
	//sends a message to client
	private void sendMessage(String message) {
		try {
			output.writeObject("SERVER - " + message);
			output.flush();
			showMessage("\nSERVER - " + message);
			
			
		}catch(IOException ioException) {
			chatWindow.append("\n ERROR: DUDE I CAN'T SEND THAT MESSAGE");
			
		}
	}
	
	//updates chat window
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					chatWindow.append(text);						
				}
			}		
		);				
	}	
	
	//makes text field editable
	private void ableToType(final boolean tof) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						userText.setEditable(tof);						
				}
			}		
		);	
			
	}
}
