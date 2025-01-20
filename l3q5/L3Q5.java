/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;

/**
 *
 * @author warre
 */
import java.util.Scanner;

public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double x, y, a, b, c, d, e, f;
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        System.out.print("Enter d: ");
        d = sc.nextDouble();
        System.out.print("Enter e: ");
        e = sc.nextDouble();
        System.out.print("Enter f:");
        f = sc.nextDouble();

        if ((a * d - b * c) == 0) {
            System.out.println("The equation has no solution");
        } else {
            x = (e * d - b * f) / (a * d - b * c);
            y = ((a * f - e * c) / (a * d - b * c));
            System.out.printf("x: %.2f%n",x);
            System.out.printf("y: %.2f%n",y);

        }

    }
}
