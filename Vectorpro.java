// A Java Program illustrating the use of the `Vector` class from the `java.util` package. The program creates three vectors: `v`, `v1`, and `v2`. The vectors are initialized with different capacities using different constructors of the `Vector` class. The program then prompts the user to enter elements for each vector and displays the elements along with their capacities.


import java.util.*;

public class Vectorpro {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> v1 = new Vector<Integer>(5);
        Vector<Integer> v2 = new Vector<Integer>(2, 3);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Element at pos" + i + " in 1st Vector");
            v.add(sc.nextInt());

        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter Element at pos" + i + " in 2nd Vector");
            v1.add(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Element at pos" + i + "in 2 Parameter Vector");
            v2.add(sc.nextInt());
        }
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v1);
        System.out.println(v1.capacity());
        System.out.println(v2);
        System.out.println(v2.capacity());
    }

}
