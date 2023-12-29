// A Java Program demonstrating method overriding where a subclass (Derived) provides its own implementation of a method defined in its superclass (Base) and also invokes the superclass method using the `super` keyword.

// Define a Base Class with member methods void show().
// Define a class Child Derived from Base. Child modifies the defination of Show()


class Base{


void show()
{
System.out.println("Base Class Show Function: ");
}


}

class Derived extends Base
{

void show()
{
super.show();
System.out.println("Child Class Function: ");
}


public static void main(String []args)
{

//Base obj1=new Base();

Derived obj2=new Derived();

obj2.show();


}



}



