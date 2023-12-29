// A Java Program to implement a basic calculator that performs addition, subtraction, multiplication, and division based on user input.


import java.util.Scanner;

class calc
{
	
	public static void main(String arg[])
	{
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter value of A ");
		a=sc.nextInt();
		
		
		System.out.println("Enter value of B ");
		b=sc.nextInt();
		
		System.out.println("Enter Your Choice");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		
		c=sc.nextInt();
		
		switch(c)
		{
			
			case 1: System.out.println(a+b);
					break;
			
			case 2: System.out.println(a-b);
					break;
			
			case 3: System.out.println(a*b);
					break;
			
			case 4: System.out.println(a/b);
					break;
			
			default: System.out.println(" Invalid Input ");
			
		}
		
	}
	
	
}

