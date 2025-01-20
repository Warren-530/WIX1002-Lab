/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q6;
import java.util.Random;
/**
 *
 * @author warre
 */
public class L1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int digit=0;
        
        int num = rd.nextInt(0,100000);
        System.out.println("Integer: "+num);
        
        while(num>0){
            num=num/10;
            digit++;
        }
        System.out.println("Number of digits: "+digit);
    }
    
}
