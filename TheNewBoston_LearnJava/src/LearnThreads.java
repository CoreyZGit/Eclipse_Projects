
import java.util.Random;

public class LearnThreads implements Runnable{

	String name;
	int time;
	
	Random r = new Random();
	
	public LearnThreads(String x) {
		
		name = x;
		time = r.nextInt(10000);
		
		
	}
	
	public void run() {
		
		try {
			
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
			
			
		}catch(Exception e) {
			
			
			
		}
		
	}
	
	

}

