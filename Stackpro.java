// A Java Program demonstrating the usage of the `Stack` class from the `java.util` package. The program creates a stack of strings, pushes multiple elements onto the stack, pops two elements, and then displays the remaining elements, their count, and iterates through the stack using an iterator.

import java.util.*;

class Stackpro
{
	
	
	public static void main(String args[])
	{
		
	
	Stack <String> s=new Stack<String>();
	
	s.push("R1");
	s.push("R2");
	s.push("String ");
	s.push("R1");
	s.push("R2");
	s.push("String ");
	s.push("R1");
	s.push("R2");
	s.push("String ");
	
	s.pop();
	s.pop();
	
	System.out.println(s);
	
	System.out.println(s.size());
	
	Iterator itob=s.iterator();
	
	while(itob.hasNext())
	{
		
		System.out.println(itob.next());
		
		
	}
	

	
	
	
		
		
	}
		
	
}