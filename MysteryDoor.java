  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.Scanner;
/**
 *
 * @author nicholas.cellone83
 */
public class MysteryDoor {
    public static void main(String[] args) {
        final int SELECTOR = 3; 
        System.out.println("What car is under the car cover");
        System.out.println("-----Lamborghini Huracan, Telsla Model S, or Acura NSX-----");
        
         displayCarStats();
         displayCarPrice();
         System.out.println("_____________________");
        
                 
                 
                   
    } // close main
    
    public static void displayCarStats(){
         System.out.print("-----5.2L V10---"); 
         System.out.print("---Electric 0-60 2.3---");
         System.out.println("---3.5L V6---");       
    
    } // close car stat method
    
    public static void displayCarPrice(){
        System.out.print("-----$250,000---");
        System.out.print("---$150,000---");
        System.out.println("---$200,000---");
        
    } // close car price method
    
} // close class     
