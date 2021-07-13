package ru.ncedu.java.examples.exceptions;

/**
 * @author kolesnikov
 */
public class TestExceptions3 {

    public static void main(String[] args) {
        try {
            System.out.print("hello ");
            throwit();
        } catch (Exception re) {
            System.out.print("caught ");
        } finally {
            System.out.print("finally ");
        }
        System.out.println("after ");
    }

    public static void throwit() {
        System.out.print("throwit ");
        throw new RuntimeException();
    }
}
