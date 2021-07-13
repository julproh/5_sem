package ru.ncedu.java.examples.exceptions;

/**
 * @author kolesnikov
 */
public class TestExceptions4 {

    public static void main(String[] agrs) {
        try {
            badMethod();
            System.out.print("A");
        } catch (Exception ex) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod() {
        throw new Error(); /* Line 22 */
    }

}


