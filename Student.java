/* Define a Class Student with Data Members Int age, float cgpa, String Name. define 2 data methods to take input in getData() and show details in showData() take input from user to create multiple objects*/



import java.util.Scanner;

class Student{
	
	int age;
	float cgpa;
	String name;
	
	Scanner sc=new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter Student Name: ");
		name=sc.nextLine();
		
		System.out.println("Enter Student Age: ");
		age=sc.nextInt();
		
		System.out.println("Enter Student CGPA: ");
		cgpa=sc.nextFloat();
	}
	
	
	void showData()
	{
		
		System.out.println("Student Name is: "+name);
		
		System.out.println("Student Age is: "+age);
		
		System.out.println("Student CGPA is: "+cgpa);
		
	}
	
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter Number of Students:  ");
		n=sc.nextInt();
		
		
		Student obj[] =new Student[n];
		
		for (int i=0; i<n ; i++)
		{
			
			obj[i]=new Student();
			
			
		}
		
		
		for (int i=0; i<n ; i++)
		{
			
			obj[i].getData();
			
			
		}
		
		
		for (int i=0; i<n ; i++)
		{
			
			obj[i].showData();
			
			
		}
		
		
		
	}
	
	
	
}