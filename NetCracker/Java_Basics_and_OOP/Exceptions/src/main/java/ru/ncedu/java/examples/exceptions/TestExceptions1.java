package ru.ncedu.java.examples.exceptions;

/**
 * @author kolesnikov
 */
public class TestExceptions1 {

    public static int stringSize(Object s) {
        try {
            return s.toString().length();
        } catch (Exception ex) {
            return -1;
        } finally {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringSize("string"));
        System.out.println(stringSize(null));
    }

}
