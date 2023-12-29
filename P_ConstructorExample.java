// Paramtereized Constructor Program   1.Call by Value 2. Call by Reference//

import java.util.Scanner;

class P_ConstructorExample
{

	int x;
	
	P_ConstructorExample()
	{
	
		x=100;
	
	System.out.println("Value is : "+x);
	
	}
	
		P_ConstructorExample(int x , int y)
		{
			
			System.out.println("X+Y is : "+(x+y));
			
		}
	
	


	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int p,q;		
		
		
		System.out.println("Enter Value of P : ");
		p=sc.nextInt();	// Scanning Value of P
	
		System.out.println("Enter Value of Q : ");
		q=sc.nextInt();	// Scanning Value of q
		
		
		// P_ConstructorExample ob=new P_ConstructorExample(10,20);	// Passed 10 and 20 as Value 
		
		P_ConstructorExample ob=new P_ConstructorExample(p,q);	// Passed P and Q Variables as Reference
		
		
	
	}



}