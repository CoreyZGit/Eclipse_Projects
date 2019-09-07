
public class MainMultipleThreads {
	public static void main(String[] args){
		
		Thread t1 = new Thread(new LearnThreads("first thread"));
		Thread t2 = new Thread(new LearnThreads("second thread"));
		Thread t3 = new Thread(new LearnThreads("third thread"));
		Thread t4 = new Thread(new LearnThreads("fourth thread"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
