// A Java Program that demonstrates the usage of the `TreeSet` class from the `java.util` package. The program prompts the user to enter the size of a tree set and then input elements for that set. After all elements are added, the program displays the sorted elements using the `TreeSet`'s inherent ordering. Note that `TreeSet` automatically sorts the elements upon insertion.


import java.util.*;

public class Treepro {

    public static void main(String[] args) {
        int n = 0;
        // int e = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a Size of Tree: ");
        n = sc.nextInt();

        TreeSet<Integer> t = new TreeSet<Integer>();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Element at " + i + " Position");
            // e = sc.nextInt();
            t.add(sc.nextInt());
        }

        // Collections.sort(t);

        System.out.println(t);
    }
}
