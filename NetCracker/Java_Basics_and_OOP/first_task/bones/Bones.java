package bones;

import java.util.Random;
import java.util.Scanner;


public class Bones {

    public static void main (String[] args) {

        int n, k;

        System.out.println("Print the number of the players with the computer");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println("Print the number of the bones");
        k = in.nextInt();
        in.close();
    
        int[][] players = new int[2][n];
        for  (int i = 0; i < n; i++) {
            players[0][i] = i+1;
            players[1][i] = 0;
        }
        int[] current = new int [n];

        int winner = 0;
        int max = 0;
        int flag = 0;

        final Random random = new Random();

        while (flag == 0) {
            for (int i = 0; i < n; i++){
                for (int j = 0; j < k; j++) {
                    
                    current[i] += random.nextInt(5) + 1; 
                }
                if ( current[i] > max) {
                    max = current[i];
                    winner = i;
                }
            };
            players[1][winner]++;
            if (players[1][winner]==7){
                flag = 1;
            } 
            else {
                int number = players[1][winner];
                for(int i = winner; i > 0; i--) {
                    players[0][i] = players[0][i-1];
                    players[1][i] = players[1][i-1];
                }
                players[0][0] = winner+1;
                players[1][0] = number;
                for (int i=0; i < n; i++) {
                    current[i] = 0;
                }

            }
        };

        System.out.println("The winner is " + players[0][0] + " player");

    };
}