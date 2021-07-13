package ru.ncedu.java.examples.exceptions;

/**
 * @author kolesnikov
 */
public class TestExceptions2 {

    public static void main(String[] agrs) {
        try {
            //return;
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
    }

}
