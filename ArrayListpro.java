// A Java Program to demonstrate basic operations on an ArrayList, including addition, removal based on a condition, and displaying its size and contents.

import java.util.ArrayList;

class ArrayListpro {

	public static void main(String[] args) {

		ArrayList<String> ob = new ArrayList<String>();
		ArrayList<String> ob1 = new ArrayList<String>();

		ob.add("A Sentence 1");
		ob.add("A Sentence 2");
		ob.add("A Sentence 3");
		ob.add("Sentence 4");
		ob.add("Sentence 4");
		ob.add("Sentence 5");
		
		ob1.add("A Sentence 1");
		ob1.add("A Sentence 2");
		ob1.add("A Sentence 3");
		ob1.add("Sentence 4");
		ob1.add("Sentence 4");
		ob1.add("Sentence 5");
		
		
		System.out.println(ob.size());
	    System.out.println(ob);
		
		//ob.remove("Sentence 4");
		
		ob.removeIf(n -> (n.charAt(n.length()-1) == '5'));
		
		System.out.println(ob.size());
	    System.out.println(ob);
		
		
		//System.out.println(ob);
		
		//System.out.println(ob.size());
		
		// ob.clear();
		
		//ob.iterator();
		
		//ob.equals(ob==ob1);
		
	//	System.out.println(ob.size());
	}

}