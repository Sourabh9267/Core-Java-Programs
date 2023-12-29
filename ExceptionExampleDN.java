// A Java Program to demonstrate exception handling where an attempt is made to divide an integer by zero, and the exception is caught and printed.

public class ExceptionExampleDN {

    public static void main(String[] args)

    {

        int x = 10;
        int y = 0;
        try {
            System.out.println((x / y));
        } catch (Exception c) {

            System.out.println(c);

        }
    }

}