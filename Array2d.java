
// A Java Program to initialize and display values in a 2D integer array.
import java.util.Scanner;

public class Array2d
{


	public static void main(String arg[])
	{
	
		Scanner sc=new Scanner(System.in);
		
		int [][]a=new int[3][3];
        
        int row=3;
        int column=3;
		
		for(int i=0; i<row ;i++)
		{
			for(int j=0; j<column ;j++)
		    {
			System.out.println("Enter Element at "+i+" "+j+": ");
            a[i][j]=sc.nextInt();	
		    }
		}
		
        System.out.println("\n2D Array is: ");


		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
		{
		System.out.print("  "+a[i][j]);	
		}
		System.out.println(" ");
		}
		
	

	}


}
