/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author warre
 */
import java.util.Random;
public class Sum_Average_Of_RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int num1 = random.nextInt(10,51);
        int num2 = random.nextInt(10,51);
        int num3 = random.nextInt(10,51);
        
        int sum = num1 + num2 + num3;
        double avg = (double)sum/3;
        
        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        System.out.println("Number 3: "+num3);
        System.out.println("Sum of the numbers: "+sum);
        System.out.printf("Average of the numbers: %.2f",avg);
        
    }
    
}
