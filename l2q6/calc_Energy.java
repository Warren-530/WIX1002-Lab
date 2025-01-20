/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class calc_Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double weight_Gram;
        double weight_Kg;
        double energy;
        double initial_Temperature_Farenheit;
        double initial_Temperature_Celsius;
        double final_Temperature_Farenheit;
        double final_Temperature_Celsius;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        weight_Gram = sc.nextDouble();
        weight_Kg = weight_Gram/1000;
        
        System.out.print("Enter the initial temperature in Farenheit:");
        initial_Temperature_Farenheit = sc.nextDouble();
        initial_Temperature_Celsius = (initial_Temperature_Farenheit-32)/1.8;
        
        System.out.print("Enter the final temperature in Farenheit:");
        final_Temperature_Farenheit = sc.nextDouble();
        final_Temperature_Celsius = (final_Temperature_Farenheit-32)/1.8;
        
        energy = weight_Kg*(final_Temperature_Celsius-initial_Temperature_Celsius)*4184;
        
        System.out.printf("The energy needed is %.2e%n",energy);
    }
    
}
