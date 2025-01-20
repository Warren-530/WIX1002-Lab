/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int second;
        int hour;
        int min;
        int secondRemained;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        second = sc.nextInt();
        
        hour = second/3600;
        min = (second-hour*3600)/60;
        secondRemained = second - hour*3600 - min*60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",second,hour,min,secondRemained);
        
              
    }
    
}
