/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;


/**
 *
 * @author nicholas.cellone83
 */
public class MathChecker {
    public static void main(String[]args){
        int answer = 10; 
        int userAnswer; 
        int numLoops = 0; 
        
        System.out.println("Math Checker");
        
        Scanner userInputScanner = new Scanner(System.in); 
         // while controls how many tries the user has 
        while(numLoops < 3){
           
         System.out.println("Compute the value of 5 + 5"); 
            
            userAnswer = userInputScanner.nextInt(); 
            
             // compare answer to user answer
            if (answer == userAnswer){
                System.out.println("Correct");
                break; 
            } else {
                System.out.println("Incorrect"); 

            } // closes else 
            numLoops = numLoops + 1; 
        
        } // close while
        
        
          
        
    } // closes main method 
        
        
} // closes main class
