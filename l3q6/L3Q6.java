/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter coordinate x: ");
        double x = sc.nextDouble();
        System.out.print("Enter coordinate y: ");
        double y =sc.nextDouble();
        
        double distance = Math.sqrt((x*x)+(y*y));
        System.out.printf("Distance from the point to center: %.2f%n",distance);
        
        if(distance<=radius){
            System.out.println("The point is inside the circle.");
        }
        else{
            System.out.println("The point is outside the circle.");
        }
    }
    
}
