package ru.ncedu.java.examples.debug;

/**
 * @author kolesnikov
 */
public class TestDebug1 {

        public static void main(String[] agrs) {
            int a = 0;
            int b = 1;

            b = 2;
            a = 3;

            for (int i = 0; i< 5; i++) {
                b += i;
            }
            a = method1(b);
            System.out.println(a);
        }

        private static int method1(int b) {
            int c = b;
            c *= 5;
            return c;
        }

}
