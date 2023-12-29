// A Java Program to initialize and display values in a 2D integer array with user-defined dimensions and an extra row and column index.

import java.util.Scanner;

public class Array2dindex1
{


	public static void main(String arg[])
	{
	
		Scanner sc=new Scanner(System.in);
		int row;
        int column;

		System.out.println("Enter Number of Rows: ");
		row=sc.nextInt();

		System.out.println("Enter Number of Column: ");
		column=sc.nextInt();
		


		int [][]a=new int[row+1][column+1];

		a[0][0]=0;
		//a[0][0]=0;
        
       
		for(int i=1; i<=row ;i++)
		{
			for(int j=1; j<=column ;j++)
		    {
			System.out.println("Enter Element at "+i+" "+j+": ");
            a[i][j]=sc.nextInt();	
		    }
		}
		
        System.out.println("\n\n2D Array is: ");


		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
		{
		System.out.print("  "+a[i][j]);	
		}
		System.out.println(" ");
		}
		
	

	}


}
