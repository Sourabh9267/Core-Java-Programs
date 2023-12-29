//	Single inheritance in Java 
// A Java Program demonstrating single inheritance where a subclass inherits from a superclass and both constructors are invoked during object creation.
class Parent
{
	
	Parent()
	{
		System.out.println("Super Class Constructor: ");
	}


}

public class Child extends Parent
{

	Child()
	{
		Super();
		System.out.println("SubClass Constructor");
	}


	private void Super() {
    }


    public static void main(String args[])
	{
	Child obj=new Child();
	
	//obj.f1();
	//obj.f2();
	
	
	}
}

