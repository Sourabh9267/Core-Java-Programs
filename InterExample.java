
// A Java Program illustrating the implementation of an interface (`I1`) in a class (`InterExample`). The class provides a concrete implementation for the method `f1()` defined in the interface.

interface I1
{

void f1();

}


class InterExample implements I1
{
	
	public void f1()
	{
	System.out.println(" Hello ");
	}

	public static void main(String []args)
	{
		InterExample ob=new InterExample();
		
		ob.f1();
	
	}



}