// A Java Program to demonstrate exception handling when initializing and accessing array elements based on user input.

import java.util.Scanner;

public class ArrayExcep {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Array upto 10");
        n = sc.nextInt();
        int a[] = new int[10];
        // a[]={1,2,3,4,5};
        try {
            System.out.println("Enter Elements: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            System.out.println("Printing Array Elements: ");
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
                // a[i]=sc.nextInt();

            }
        } catch (Exception e) {

            System.out.println(e);
            System.out.println(" :Exception Occured: "+e.getMessage());
        }

        System.out.println("Program Executed till here");
    }

}
