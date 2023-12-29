 // A Java Program demonstrating the use of a `finally` block. The program attempts to access an element beyond the array's size, leading to an exception. Regardless of the exception, the `finally` block ensures that its code is executed.
 
 public class FinallyException {

    public static void main(String[] args) {

        int x[] = { 98, 32, 33, 124, 54 };

        try {

           // System.out.println(x[0]);
            
            System.out.println(x[90]);

        } catch (Exception e) {

            System.out.println(e);

        }

        finally {

            System.out.println("This Code is always Excecuted");

        }

    }
}
