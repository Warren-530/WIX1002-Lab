/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        int sales = sc.nextInt();
        double commission =0;
        if(sales<=100&&sales>=0){
            commission = sales*0.05;
        }
        else if(sales>100&&sales<=500){
            commission = sales*0.075;
        }
        else if(sales>500&&sales<=1000){
            commission = sales*0.1;
        }
        else if(sales>1000){
            commission = sales*0.125;
        }
        else{
            System.out.println("Sales volume cannot be negative!");
            return;
        }
        System.out.printf("Commission: %.2f%n",commission);
    }
    
}
