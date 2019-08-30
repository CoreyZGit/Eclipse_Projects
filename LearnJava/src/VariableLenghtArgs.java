
public class VariableLenghtArgs {
	public static void main(String []args) {
		System.out.println(average(23,45,634,8,2));
		
	}
	
	public static int average(int...numbers) {
		
		int total = 0;
		for(int x:numbers)
			total += x;
		
		return total/numbers.length;
		
		
	}

}
