/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

import java.util.Scanner;

/**
 *
 * @author warre
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int totalSum = 0;
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            totalSum+=sum;
            sum=0;//reset the sum
        }
        System.out.println("Sum: " + totalSum);
    }
}


