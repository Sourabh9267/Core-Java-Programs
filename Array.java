
// A Java Program to initialize and display values in an integer array.

import java.util.Scanner;

class Array
{

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		//int []a;

		int []a= new int[7];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Value at index "+i);
		a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
		
		System.out.println("Value at Array index " +i+ " is: "+a[i]);
		}
	
	
	}


}