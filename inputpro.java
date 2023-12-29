// WAJP to take input from user for 3 integar variables and print the values//

import java.util.Scanner;

class inputpro{
	int a;
	int b;
	int c;
	
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		inputpro ob= new inputpro();
	
		System.out.println("Enter value of a: ");
		ob.a=sc.nextInt();
		
		System.out.println("Enter value of b: ");
		ob.b=sc.nextInt();
		
		System.out.println("Enter value of c: ");
		ob.c=sc.nextInt();
		
		
		System.out.println(" value of a: "+ob.a);
		System.out.println(" value of b: "+ob.b);
		System.out.println(" value of c: "+ob.c);
		
		
		
		
	}
	
}