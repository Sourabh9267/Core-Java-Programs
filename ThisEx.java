// A Java Program demonstrating the use of the `this` keyword to differentiate between instance variables and local variables when they have the same names. The program sets values for instance variables `x` and `y` using the `this` keyword inside the `show` method and then displays them along with the local variables' values.
class ThisEx
{

	int x=10;
	int y=30;
	
	void show()
	{
	int x=30;
	int y=60;
	this.x=90;
	System.out.println(x+" "+y+" "+this.x+"  "+this.y);
	}
	
	
	
	public static void main(String a[])
	{
	
	//int x=10;
	
	ThisEx ob=new ThisEx();
	
	ob.show();
	
	
	}


}