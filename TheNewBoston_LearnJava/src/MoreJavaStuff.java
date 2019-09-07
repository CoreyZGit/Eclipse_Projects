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
	System.out.println();
	
	System.out.println(Collections.frequency(list2, "gemr"));
	
	boolean tof = Collections.disjoint(list1, list2);
	System.out.println(tof);
	
	if(tof)
		System.out.println("These lists do not have anything in common.");
	
	else
		System.out.println("These lists must have something in common!");
	
}

public void StackPushPop() {
	
	Stack<String> stack = new Stack<String>();
	stack.push("bottom");
	printStack(stack);
	stack.push("second");
	printStack(stack);
	stack.push("third");
	printStack(stack);
	
	stack.pop();
	printStack(stack);
	stack.pop();
	printStack(stack);
	stack.pop();
	printStack(stack);
	
	
	
}

private static void printStack(Stack<String> s) {
	
	if(s.isEmpty())
		System.out.println("You have nothing in your stack");
	
	else
		System.out.printf("%s TOP\n", s);
	
}

public void Queue() {
	
	PriorityQueue<String> q = new PriorityQueue<String>();
	
	q.offer("first");
	q.offer("second");
	q.offer("third");
	
	System.out.printf("%s ", q);
	System.out.println();
	
	System.out.printf("%s ", q.peek());
	System.out.println();
	
	String f = q.poll();
	System.out.printf("%s ", q);
	System.out.println(f);

}

public void HashSet() {
	
	String[] things = {"apple", "bob", "ham", "bob", "bacon"};
	List<String> list = Arrays.asList(things);
	
	System.out.printf("%s ", list);
	System.out.println();
	
	Set<String> set = new HashSet<String>(list);
	System.out.printf("%s ", set);
	
}

public void OverloadedMethods() {
	
	Integer[] iray = {1, 2, 3, 4};
	Character[] cray = {'c', 'o', 'r', 'e', 'y'};
	
	printMe(iray);
	printMe(cray);
	printMeGeneric(iray);
	printMeGeneric(cray);
	
	
	
}

private void printMe(Integer[] i) {
	
	for(Integer x : i)
		System.out.printf("%s ", x);
	System.out.println();
	
	
	
}

private void printMe(Character[] i) {
	
	for(Character x : i)
		System.out.printf("%s ", x);
	System.out.println();
	
	
	
}

private <T> void printMeGeneric(T[] x){
	
	for(T b : x)
		System.out.printf("%s ", b);
	System.out.println();
		
	
}

public void GenericReturnTypes() {
	
	System.out.println(max(23, 42, 1));
	System.out.println(max("apples", "tots", "chicken"));
	
	
	
}

private <T extends Comparable<T>> T max(T a, T b, T c) {
	
	T m = a;
	if(b.compareTo(a) > 0)
		m = b;
	
	if(c.compareTo(b) > 0)
		m = c;
	
	return m;
	
	
	
}




}
