// A Java Program that provides a simple menu-driven interface to perform operations on a stack. Users can push elements onto the stack, pop elements from the stack, and display the current elements of the stack. The program uses the `Stack` class from the `java.util` package.


import java.util.*;

public class StackProgram {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        Scanner sc = new Scanner(System.in);

        int ch = 0;

        do {

            System.out.println("1. for PUSH      2. for POP     3. for Display");
            int ch2 = sc.nextInt();
            switch (ch2) {

                case 1:
                    System.out.println(" Enter an Element ");
                    s.push(sc.nextInt());
                    break;

                case 2: // System.out.println(" Enter an Element ");
                    s.pop();
                    break;

                case 3:
                    System.out.println("Elements of Stack are: ");
                    System.out.println(s);
                    break;

                case 4:
                    ch = 2;
                    break;

                default:
                    System.out.println("Enter Valid input");

            }
        } while (ch != 2);

    }

}
