/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        System.out.println("Birsayı giriniz");
        int n=input.nextInt();
        
        for(int a=0;a<=n;a++){
            for(int b=0;b<=n;b++){
                if(3*a+5*b==n){
                  System.out.println(("a:"+a+ "b:"+b));  
                }
            }
            
        }
    }
       
}
