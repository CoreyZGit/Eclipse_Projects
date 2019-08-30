
public class MultiConstructors2 {
	public static void main(String []args) {
		
	MultiConstructors ContObj1 = new MultiConstructors();
	MultiConstructors ContObj2 = new MultiConstructors(5);
	MultiConstructors ContObj3 = new MultiConstructors(5, 13);	
	MultiConstructors ContObj4 = new MultiConstructors(5, 13, 43);	
	
	System.out.printf("%s\n", ContObj1.toMilitary());
	System.out.printf("%s\n", ContObj2.toMilitary());
	System.out.printf("%s\n", ContObj3.toMilitary());
	System.out.printf("%s\n", ContObj4.toMilitary());
	
	}
	
	

}
