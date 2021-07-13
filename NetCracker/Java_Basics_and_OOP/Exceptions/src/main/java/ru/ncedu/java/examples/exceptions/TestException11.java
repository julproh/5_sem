package ru.ncedu.java.examples.exceptions;

import java.io.IOException;

/**
 * @author kolesnikov
 */
public class TestException11 {

    public static void main(String[] agrs)  {
        try {
            throwit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void throwit() throws IOException {
        throw new IOException();
    }


}
