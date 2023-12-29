// A Java Program demonstrating the implementation of multiple interfaces (`I1` and `I2`) in a class (`InterfaceMul`). The class provides concrete implementations for all the methods declared in both interfaces.

interface I1
{

void f1();



}


interface I2
{

void f2();
void f3();


}


class InterfaceMul impliments I1,I2
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

InterfaceMul ob=new InterfaceMul();

ob.f1(); 
ob.f2();
ob.f3();
}
}