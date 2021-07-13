package ru.ncedu.java.examples.exceptions;

/**
 * @author kolesnikov
 */
public class TestExceptions0 {

    public static void main(String[] agrs) {
        try {
            System.out.println("Start");
            int x = 0;
            int y = 5 / x;
            System.out.println("Finish");
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("finished");
    }

}
