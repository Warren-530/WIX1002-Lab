/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;
import java.util.Scanner;
/**
 *
 * @author warre
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int integer = sc.nextInt();
        
        System.out.print("The factors are: ");
        for(int i=1; i<=integer; i++){
            if(integer==i){
                System.out.print(i+"\n");
                break;
            }
            if(integer%i==0){
                System.out.print(i+", ");
            }
        }
    }
    
}
