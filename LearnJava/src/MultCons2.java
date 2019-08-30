
public class MultCons2 {
	public static void main(String[] args) {
		
		MultCons multObj1 = new MultCons();
		MultCons multObj2 = new MultCons(5);
		MultCons multObj3 = new MultCons(5, 13);
		MultCons multObj4 = new MultCons(5, 13, 43);
		
		System.out.printf("%s\n", multObj1.toMilitary());
		System.out.printf("%s\n", multObj2.toMilitary());
		System.out.printf("%s\n", multObj3.toMilitary());
		System.out.printf("%s\n", multObj4.toMilitary());
		
	}
	
	
	
	
	
	
	
	
	

}
