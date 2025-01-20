/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q5;

import java.util.Random;

/**
 *
 * @author warre
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int score1 = 0;
        int score2 = 0;

        while (score1 < 101 && score2 < 101) {
            score1 += rd.nextInt(0, 7);

            while (score1 == 6) {
                score1 += rd.nextInt(0, 7);
            }

            score2 += rd.nextInt(0, 7);
            while (score2 == 6) {
                score2 += rd.nextInt(0, 7);
            }
        }
        
        System.out.println("Score1: "+score1);
        System.out.println("Score2: "+score2);
        
        if(score1>score2){
            System.out.println("Player 1 wins!");
        }
        else if(score2>score1){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("Tie.");
        }

    }

}
