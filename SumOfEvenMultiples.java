// A Java Program to calculate the sum of even numbers that are multiples of 3 up to a given number 'n' in the class named "SumOfEvenMultiples".

import java.util.Scanner;

public class SumOfEvenMultiples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        System.out.println("Enter Value of N");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++)

        {

            if ((2 * i) % 3 == 0)

            {

                sum = sum + (2 * i);

            }

        }
        System.out.println("Sum is : " + sum);
    }
    // System.out.println("S"+sum);
}
