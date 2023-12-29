
// This Java program demonstrates the behavior of Vector objects with varying capacities.

import java.util.*;

public class VectorProgram {

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
