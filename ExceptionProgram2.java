// A Java Program where a method intentionally throws a `NullPointerException` with a custom message, and then this exception is caught and re-thrown in the `main` method using a try-catch block.
public class ExceptionProgram2 {

    void f1() {

        try {

            throw new NullPointerException("Demo");

        } catch (NullPointerException e) {

            throw e;
        }

    }

    public static void main(String[] args) {

        ExceptionProgram2 ob = new ExceptionProgram2();
        
        try{
        ob.f1();
        }catch(NullPointerException e)
        {
        System.out.println(e);
        }
    }

}
