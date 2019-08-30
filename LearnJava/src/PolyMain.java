
public class PolyMain {
	public static void main(String []args) {
		
		Polymorphism Hello[] = new Polymorphism[2];
		Hello[0] = new Poly2();
		Hello[1] = new Poly3();
		
		for(int x = 0; x < 2; ++x) {
			
			Hello[x].Polymorph1();
			
			
			
		}
		
	}

}
