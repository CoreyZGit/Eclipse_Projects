
public class ClassTime2 {
	private String name;
	private ClassTime birthday;
	
	public ClassTime2(String theName, ClassTime theDate) {
		
		name = theName;
		birthday = theDate;
		
		
	}
	
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
		
		
		
	}

}
