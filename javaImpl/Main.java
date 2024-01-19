package javaImpl;

import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        // int boardSize = 8;
        // int[] ships = new int[]{0, 3, 0, 1};
        // ComputerPlayer player = new ComputerPlayer(boardSize, ships);
        
        // int[][] tmp = player.getNumberOfCombinationsPerSquare(0L, 0L, 0L, ships);

        // System.out.println(Arrays.deepToString(tmp));
        // System.out.println("Finished in " + (System.currentTimeMillis() - start) + "ms.");

        Gamestates gs = new Gamestates(8);
        try {
            String fileName = "validStates8x8.bin";
            long[] accepted = gs.tryAllStates(fileName);

            System.out.println("Accepted " + accepted.length + " states, this would take " + (float)(accepted.length*8/1000000000L) + "GB to store.");

        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}