//	Single inheritance in Java 
// A Java Program demonstrating single inheritance where a subclass inherits from a superclass and both constructors are invoked during object creation using the `super` keyword.
 class Parent
{
	
	Parent()
	{
		System.out.println("Super Class Constructor: ");
	}


}

 public class Child2 extends Parent
{

	Child2()
	{
		super();
		System.out.println("SubClass Constructor");
	}


	public static void main(String args[])
	{
	Child2 obj=new Child2();
	
	//obj.f1();
	//obj.f2();
	
	
	}
}

