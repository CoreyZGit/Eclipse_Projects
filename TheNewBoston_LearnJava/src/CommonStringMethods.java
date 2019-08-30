import java.util.*;
public class CommonStringMethods {
	
	public static void main(String args[]) {
		
		//CommonStringMethods();
		//SomeMoreStringMethods();
		//System.out.println(RecursionFactorial(5));
		IntroToCollections();
	}
	
	public static void CommonStringMethods() {
		
		String[] words = {"funk", "chunck", "furry", "baconator"};
		
		//startsWith
		for(String w : words) {
			
			if(w.startsWith("fu"))
				System.out.println(w + " starts with fu");
			
			
		}
		
		//endsWith
		for(String w : words) {
			
			if(w.endsWith("unk"))
				System.out.println(w + " ends with unk");
		}
		
	}
	
	public static void SomeMoreStringMethods() {
		
		String s = "coreyzwartcoreyzwartcoreyzwart";
		
		System.out.println(s.indexOf('e', 5));
		
		System.out.println(s.indexOf("zwa", 10));
		
		String a = "Bacon";
		String b = " monster";
		
		System.out.println(a.concat(b));
		
		System.out.println(a.replace('B', 'f'));
		
		System.out.println(b.toUpperCase());
		
		System.out.println(b.trim());
		
	}
	
	public static long RecursionFactorial(long n) {
	
		if(n <= 1)
			
			return 1;
		
		else
	
			return n * RecursionFactorial(n - 1);
	
	}
	
	public static void IntroToCollections() {
		
		String[] things = {"eggs, lasers", "hats,", "pie"};
		
		List<String> list1 = new ArrayList<String>();
		
		//add array items to list
		for(String x : things)
			list1.add(x);
		
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		for(String y : morethings) 
			list2.add(y);
		
		for(int i = 0; i < list1.size(); i++) {
			
			System.out.printf("%s ", list1.get(i));
						
		}
		
		Iterator<String> it = list1.iterator(); 
		
		while(it.hasNext()) {
			
			if(list2.contains(it.next()));
				it.remove();
		
		
		System.out.println();
		
		for(int i = 0; i < list1.size(); i++) {
			
			System.out.printf("%s ", list1.get(i));
			
			
			}					
		
		}
				
	}
		
}

