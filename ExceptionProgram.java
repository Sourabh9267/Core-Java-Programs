// A Java Program demonstrating the manual throwing of a `NullPointerException` within a method and catching it in the `main` method using a try-catch block.

class ExceptionProgram {

    void f1() {
        // try {

        throw new NullPointerException();
        // } catch (NullPointerException e) {

        // System.out.println(e);
    }

    public static void main(String[] args) {

        ExceptionProgram ob = new ExceptionProgram();

        try {
            ob.f1();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

}