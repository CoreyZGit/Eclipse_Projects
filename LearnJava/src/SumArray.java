
public class SumArray {
	public static void main(String []args) {
		
		int array[] = {34,67,3,87,21,43};
		int sum = 0;
		
		for(int counter = 0; counter < array.length; counter++) {
			
			sum += array[counter];
		}
		
		System.out.println("The sum of these numbers is " + sum);
		
	}
	
}
