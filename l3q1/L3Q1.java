/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

/**
 *
 * @author warre
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        

        switch (operand){
            case '+' ->{
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1+num2));
            }
            case '-' -> {
                if(num1>num2)
                    System.out.println(num1+" "+operand+" "+num2+" = "+(num1-num2));
                else
                    System.out.println(num2+" "+operand+" "+num1+" = "+(num2-num1));
            }
            case '*' -> {
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1*num2));
            }
            case '/' -> {
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1/num2));
            }
            case '%' -> {
                System.out.println(num1+" "+operand+" "+num2+" = "+(num1%num2));
            }
            default -> System.out.println("Invalid operand");
        }
    }
    
}
