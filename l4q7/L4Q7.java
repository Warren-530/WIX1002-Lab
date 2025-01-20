/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

import java.util.Scanner;

/**
 *
 * @author warre
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double P;
        double i;
        int N;
        double C;
        double L;
        double R;
        double totalInterest;
        double lastInterest=0;

        System.out.print("Enter principle amount: ");
        P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = sc.nextInt();

        CalcLoan calcLoan = new CalcLoan(P, i, N);
        double M = calcLoan.calcM(P, i, N);

        System.out.println("Month\tMonthly Payment\t\tPrinciple\tInterest\tUnpaid Balance\t\tTotal Interest");

        for (int j = 1; j <= N; j++) {
            System.out.print(j + "\t\t");
            System.out.printf("%.2f\t\t",M);
            C = calcLoan.calcC(M, i, N, j);
            System.out.printf("%.2f\t\t",C);
            L = calcLoan.calcL(M, C);
            System.out.printf("%.2f\t\t",L);
            R=calcLoan.calcR(L, i, C);
            System.out.printf("%.2f\t\t\t",R);
            
            totalInterest = L + lastInterest;
            lastInterest = totalInterest;
            System.out.printf("%.2f",totalInterest);
            
            System.out.println("");//jump to next line
        }

    }

}

class CalcLoan {

    double M;
    double P;
    double i;
    int N;
    int n;

    //constructor;
    CalcLoan(double P, double i, int N) {
        this.P = P;
        this.i = i;
        this.N = N;
    }

    public double calcM(double P, double i, int N) {
        M = ((P * i / (12 * 100)) / (1 - Math.pow((1 + (i / (12 * 100))), -N)));
        return M;
    }

    public double calcC(double M, double i, int N, int n) {
        double C;
        C = M * Math.pow((1 + (i / (12 * 100))), -(1 + N - n));
        return C;
    }

    public double calcL(double M, double C) {
        double L;
        L = M - C;
        return L;
    }

    public double calcR(double L, double i, double C) {
        double R;
        R = (L / (i / (12 * 100))) - C;
        return R;
    }
}
