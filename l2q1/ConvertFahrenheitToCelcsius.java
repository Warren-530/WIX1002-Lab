/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class ConvertFahrenheitToCelcsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        
        System.out.print("Enter temperature in degree Fahrenheit:");
        fahrenheit = sc.nextDouble();
        
        celsius = (fahrenheit-32)/1.8;
        
        System.out.printf( "%.2f Farenheit = %.2f degree Celsius",fahrenheit,celsius);
    }
    
}
