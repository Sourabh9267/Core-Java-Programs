// WAJP to Implement Interface: Create 3 Interface I1,I2,I3 
// I3-> I2-> I1 Inherit Sequence:
// Create a class With a name PQR and this class inherited to interface I3
// Implement this scenario in Java;


interface I1
{
void f1();
}

interface I2 extends I1
{
void f2();
}


interface I3 extends I2
{
void f3();
}

class InterfaceExm implements I3
{
	
	public void f1()
	{
	System.out.println("Function 1: ");
	}
	
	
	public void f2()
	{
	System.out.println("Function 2: ");
	}
	
	
	public void f3()
	{
	System.out.println("Function 3: ");
	}
	
	public static void main(String []args)
	{
	
	InterfaceExm ob=new InterfaceExm();
	
	ob.f1();
	ob.f2();
	ob.f3();
	}


}

