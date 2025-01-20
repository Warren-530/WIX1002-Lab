/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author warre
 */
import java.util.Random;
public class Sum_of_Digits_in_RandomNumber {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int randomNumber = random.nextInt(0,10001);
        int sum=0;
        System.out.println("Random number:"+randomNumber);
        
        while(randomNumber>0){
            sum += randomNumber%10;
            randomNumber = randomNumber/10;
        }
        
        System.out.printf("Sum of all the digits in the number is\t" + sum +"\n");
    }
    
}
