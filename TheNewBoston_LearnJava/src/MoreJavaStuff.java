import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class MoreJavaStuff {
	
public void LinkedList() {
		
		String[] things = {"apples", "noobs", "pwnage", "bacon", "goats"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for (String y : things2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		printMe(list1);
		removeStuff(list1, 2, 5);	
		reverseMe(list1);
		
		
	}

	
private static void printMe(List<String> l) {
	
	for(String b : l)
		System.out.printf("%s ", b);
	System.out.println();
	
}

private static void removeStuff(List<String> l, int from, int to) {
	
	l.subList(from, to).clear();
	
	
	
	
}

private static void reverseMe(List<String> l) {
	
	ListIterator<String> bobby = l.listIterator(l.size());
	while(bobby.hasPrevious())
		System.out.printf("%s ", bobby.previous());
	
	
	
}


public void ListToArray() {
	
	String[] stuff = {"babies", "weatermelon", "melon", "stuff"};
	LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
	
	thelist.add("pumpkin");
	thelist.addFirst("firstthing");
	
	stuff = thelist.toArray(new String[thelist.size()]);
	
	for(String x : stuff)
		System.out.printf("%s ", x);
}
	
public void CollectionsMethodsSort() {
	
	String[] crap = {"apples", "leamons", "geese", "bacon", "youtube"};
	List<String> l1 = Arrays.asList(crap);
	
	Collections.sort(l1);	
	System.out.printf("%s\n", l1);
	
	Collections.sort(l1, Collections.reverseOrder());
	System.out.printf("%s\n", l1);
	
}

public void MethodsReverseAndCopy() {
	
	Character[] ray = {'p', 'w', 'n'};
	List<Character> rayList = Arrays.asList(ray);
	System.out.println("List is: ");
	output(rayList);
	
	Collections.reverse(rayList);
	System.out.println("After Reverse: ");
	output(rayList);
	
	Character[] ray2 = new Character[3];
	List<Character> listCopy = Arrays.asList(ray2);
	
	Collections.copy(listCopy, rayList);
	System.out.println("Copy of List: ");
	output(listCopy);
	
	Collections.fill(rayList, 'X');
	System.out.println("After Filling the list: ");
	output(rayList);
	
	
}

private static void output(List<Character> theList) {
	
	for(Character thing : theList)
		System.out.printf("%s ", thing);
	
	System.out.println();
	
	
}

public void UsingAddAll() {
	
	String[] food = {"chicken", "apples", "cucumber", "watermelon"};
	List<String> list1 = Arrays.asList(food);
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("youtube");
	list2.add("google");
	list2.add("gemr");
	
	for(String x : list2)
		System.out.printf("%s ", x);
	
	Collections.addAll(list2, food);
	System.out.println();
	
	for(String x : list2)
		System.out.printf("%s ", x);
	
}

}
