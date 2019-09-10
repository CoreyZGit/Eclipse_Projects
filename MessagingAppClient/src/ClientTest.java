import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client clientObj;
		clientObj = new Client("127.0.0.1");
		clientObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientObj.startRunning();
		
	}

}
