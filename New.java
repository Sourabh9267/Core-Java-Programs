// Abstract Class Example //


abstract class Example{

	abstract void f1();
	
	void f2()
	{
	
	System.out.println("Hello World from Abstract Class / Super Class: ");
		
	}

}

class New extends Example
{
	
	void f1()
	{
		
		System.out.println("Hello World from SUB CLass: ");
	}
	
	
	public static void main(String []args)
	{
		New ob=new New();
		ob.f1();
		ob.f2();
	
	}


}