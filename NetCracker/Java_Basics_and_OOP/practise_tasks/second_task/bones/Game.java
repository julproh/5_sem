//package bones;

import java.util.Scanner;

public interface Game {

    int getPlayers (Scanner in);
    int getBones (Scanner in);
    int[][] createArray (int n);
    int game(int[][] players, int n, int k);

}