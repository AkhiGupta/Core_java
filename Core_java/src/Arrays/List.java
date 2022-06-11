package Arrays;

import java.util.ArrayList;

public class List {
	public static void main(String[]args)
	{
		ArrayList<String> li = new ArrayList<>();
		li.add("Hello");
		li.add("Akhilesh");
		System.out.println(li);
		
		
		System.out.println("--------------------------------");
		
		ArrayList<String> arr = new ArrayList<>();
		
		//Call add() method to add elements at the end of the list using the reference variable list.
		System.out.println("Adding elements to end of list");

		System.out.println();
		
		arr.add("A"); //Adding element at index o;
		arr.add("B"); //Adding element at index 1;		
		arr.add("D"); //Adding element at index 2;
		arr.add("E"); //Adding element at index 3;
		arr.add("G"); //Adding element at index 4;
		
		System.out.println("ArrayList insertion order:" +arr);
		System.out.println();
		
		System.out.println("Adding an element at a specific index after B element.");
		arr.add(2,"C");
		System.out.println();
		
		System.out.println("ArrayList insertion order after adding C:" +arr);
		System.out.println();
		
		System.out.println("Adding an element at a specific index after E.");
		arr.add(5,"F");
		System.out.println();
		
		System.out.println("ArrayList insertion order after adding F:" +arr);
		System.out.println();
		
	}
}
