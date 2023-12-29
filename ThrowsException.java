// A Java Program demonstrating the usage of the `throws` keyword. The method `f1` declares that it might throw a `NullPointerException`, although in the provided code, it's commented out. The `main` method also declares that it might throw a `NullPointerException`. When the `f1` method is called within the `main` method, the caller (`main`) is made aware that it should be prepared to handle or propagate this exception.

public class ThrowsException {

    void f1() throws NullPointerException {

        // throw new NullPointerException("This is Exception: ");

    }

    public static void main(String[] args) throws NullPointerException {
        ThrowsException ob = new ThrowsException();

        ob.f1();

        System.out.println("Code Execution done: ");

    }
}
