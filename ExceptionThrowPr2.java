// A Java Program where the user inputs integers, and then the program computes the division of their sum by the difference of two other integers. An exception is thrown and caught if the denominator is zero.

import java.util.Scanner;

public class ExceptionThrowPr2 {

    public static void main(String[] args) {

        int a, b, c, d, f, g, h, r;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Unique Integars: ");
        a = sc.nextInt();

        b = sc.nextInt();

        c = sc.nextInt();

        System.out.println("Enter 2 Positive integars: ");

        d = sc.nextInt();
        f = sc.nextInt();

        g = a + b + c;

        System.out.println("Numerator is: " + g);
        h = d - f;

        System.out.println("Denominator is: " + h);

        try {

            if (h == 0) {

                throw new ArithmeticException("Denominator is 0 \n Can't Solve");

            }

            else {
                r = g / h;

                System.out.println("Division is : " + r);
            }

        } catch (Exception e) {

            System.out.println(" :Exception Caught: ");
            System.out.println(e.getMessage());

        }

    }

}
