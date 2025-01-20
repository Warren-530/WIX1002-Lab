/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class Calc_Car_Loan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double P,D,R,M;
        int Y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the car(RM):");
        P = sc.nextDouble();
        System.out.print("Enter the down payment:");
        D = sc.nextDouble();
        System.out.print("Enter the interest rate(%):");
        R = sc.nextDouble();
        System.out.print("Enter the loan duration(in year):");
        Y = sc.nextInt();
        
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("The monthly payment is RM%.5f%n",M);
    }
    
}
