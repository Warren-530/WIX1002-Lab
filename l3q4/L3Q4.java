/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author warre
 */
import java.util.Random;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        
        int dice1_Player1 = rd.nextInt(0,7);
        int dice2_Player1 = rd.nextInt(0,7);
        int dice1_Player2 = rd.nextInt(0,7);
        int dice2_Player2 = rd.nextInt(0,7);
        
        int scorePlayer1 = dice1_Player1 + dice2_Player1;
        int scorePlayer2 = dice1_Player2 + dice2_Player2;
        
        System.out.println("Player 1 first roll: "+dice1_Player1);
        System.out.println("Player 1 second roll "+dice2_Player1);
        System.out.println("Score of player 1: "+scorePlayer1);
        System.out.println("Player 2 first roll: "+dice1_Player2);
        System.out.println("Player 2 second roll: "+dice2_Player2);
        System.out.println("Score of player 2: "+scorePlayer2);
        
        if(scorePlayer1>scorePlayer2){
            System.out.println("Player 1 wins!");
        }
        else if(scorePlayer2>scorePlayer1){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("Tie!");
        }
        
        
        
    }
    
}
