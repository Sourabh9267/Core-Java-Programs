// A Java Program demonstrating constructor chaining using the `this` keyword. The class `ThisExCons` has two constructors - a default constructor and a parameterized constructor. The default constructor calls the parameterized constructor using `this(10)`. When an object of `ThisExCons` is created using the default constructor, it first invokes the parameterized constructor and then executes its body.

class ThisExCons
{

	ThisExCons()
	{
		
		this(10);
		System.out.println("Default Constructor: ");
	
	}
	
	ThisExCons(int n)
	{
		
		System.out.println("N is : "+n);
	
	
	}
	
	
	
	public static void main(String []arr)
	{
		
			ThisExCons ob=new ThisExCons();
			
			
	
	}

}