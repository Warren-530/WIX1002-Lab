/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q3;

import java.util.Scanner;

/**
 *
 * @author warre
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int score;
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int N = 0;
        double avg;
        int totalX2 = 0;
        double s;

        do {
            System.out.print("Enter a score [negative sscore to quit] : ");
            score = sc.nextInt();
            if (score < 0) {
                break;
            }
            total += score;

            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

            totalX2 += score * score;
            N++;
        } while (score >= 0);
        
        avg = total/N;
        
        s=Math.sqrt((totalX2-((total*total)/N))/(N-1));
        
        System.out.println("Minimum Score: "+ min);
        System.out.println("Maximum Score: "+max);
        System.out.printf("Average Score: %.2f%n",avg);
        System.out.printf("Standard Deviation: %.2f%n",s);
    }

}
