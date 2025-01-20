/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

import java.util.Random;

/**
 *
 * @author warren
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rd = new Random();
        int n = rd.nextInt(0, 201);
        System.out.println("N: " + n);
        System.out.print("2");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {  
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if(i>2){
                
                
                System.out.print(", "+i );
                }
            }
        }

    }

}
