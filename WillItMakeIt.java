/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner; 
/**
 *
 * @author nicholas.cellone83
 */
public class WillItMakeIt {
    public static void main(String[] args) {
       double mpg = 28; 
       double gallons;
       double milesLeft;
       double avialableMiles; 
       
     System.out.println("********Will I Make It?********");
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("How many gallons of gas left");
        gallons = userInputScanner.nextDouble();    
        System.out.println("How many miles to the next service station?");
        // This line takes user info 
        milesLeft = userInputScanner.nextDouble(); 
        avialableMiles = mpg * gallons;
        System.out.println("avialableMiles is " + avialableMiles);
        System.out.println("milesLeft is " + milesLeft);
            
        if(milesLeft < avialableMiles){
          // this is run if the test is true 
            System.out.println("Your car will make it");
        
        } else{
            System.out.println("Your car will not make it");
            
        }
        
       
        
               
    }
    
}
