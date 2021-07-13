import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double[] coefficient = new double[3]; 
        Scanner in = new Scanner(System.in);
        System.out.println("Start write");
        for (int i = 0; i < coefficient.length; i++) {
            coefficient[i] = in.nextDouble();
        }
        in.close();
        System.out.println(coefficient[0]);
        System.out.println(coefficient[1]);
        System.out.println(coefficient[2]);
    }

}
