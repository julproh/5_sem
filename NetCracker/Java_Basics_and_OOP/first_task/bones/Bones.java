package bones;

import java.util.Random;
import java.util.Scanner;

import org.graalvm.compiler.hotspot.nodes.profiling.RandomSeedNode;

public class Bones {
    public static void main (String[] args) {

        int n, k;

        System.out.println("Print the number of the players with the computer");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("Print the number of the kosti");
        k = in.nextInt();
        in.close();
    
        int[] players = new int[n];
        
        int number = 0;

        while (number < 7) {
            for (int i = 0; i < n; i++){
                players[i] += Math.random() %(n*k); // надо поменять функцию
            };
        };

    };
}