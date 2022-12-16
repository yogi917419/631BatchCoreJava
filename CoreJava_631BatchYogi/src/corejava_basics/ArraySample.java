package corejava_basics;

public class ArraySample {

	public static void main(String[] args) {
		int a = 10;
		String b = "hi all how are you";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("=================");
		//Array: it can store multiple values in container format { index based it will store the data}
		
		String c[] = {"hi", " my number","how are you"};
		String name[] = {"yogi","vijji","seenu","sathvika","ujjaval"};
		int d[] = {20,34,56,78,97,56,4,6,65,47};
		System.out.println(c.length);
		System.out.println(name.length);
		System.out.println(d.length);
		
		System.out.println("===================");
		// to print Array values : will use for loop / for each loop(advanced for loop)
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("====================");
		
		//print values using for each loop
		for (String abc : name) {
			System.out.println(abc);
		}

	}

}
