// A Java Program illustrating the usage of packages (`p1`, `p2`, and `p3`). The program creates instances of classes `A` from package `p1`, `B` from package `p2`, and `C` from package `p3` to access and display data using their respective methods.


import p1.*;
import p2.*;
import p3.*;

import java.util.Scanner;

public class PackExample {

    public static void main(String[] args) {

        p1.A ob1 = new p1.A();
        p2.B ob2 = new p2.B();
        p3.C ob3 = new p3.C();

        ob1.getData1();
        ob2.getData2();
        ob3.getData3();

        ob1.showData1();
        ob2.showData2();
        ob3.showData3();

    }

}
