import javax.swing.JFrame;


public class ServerTest {
	public static void main(String[] args) {
		Server serverObj = new Server();
		serverObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverObj.startRunning();
		
	}

}
