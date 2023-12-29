// A Java Program illustrating the use of the `this` keyword to call one method from another method within the same class. The `display` method calls the `show` method using `this.show()`. When the `main` method is executed, it invokes both the `show` method directly and the `display` method which, in turn, calls the `show` method.

class ThisExFxcall
{

	//int x=10;
	//int y=30;
	
	
	void display()
	{
		System.out.println("Control given to Show Function by This Keyword ");
		this.show();
	}
	
	
	void show()
	{
	System.out.println(" Show Function ");
	}
	
	
	
	public static void main(String a[])
	{
	
	//int x=10;
	
	ThisExFxcall ob=new ThisExFxcall();
	
	ob.show();
	ob.display();
	
	}


}