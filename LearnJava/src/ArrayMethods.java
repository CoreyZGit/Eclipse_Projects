
public class ArrayMethods {
public static void main(String []args) {
		
		int bucky2[] = {3,4,5,6,7};
		change(bucky2);
		
		for(int y : bucky2)
			System.out.println(y);				
	}

	public static void change(int x[]) {
		
		for(int counter = 0; counter < x.length; counter++)
			x[counter]+=5;
	}
}
