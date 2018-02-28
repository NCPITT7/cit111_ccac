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
public class AuthenticationProgram {
   public static void main (String[] args) {
       final String CORRECT_USERNAME = "NICK";
       final String CORRECT_PASSWORD = "TRUNKS7";
       
      String username;
      String password; 
      
      Scanner input = new Scanner(System.in); 
      System.out.println("Type in your username");
      username = input.next(); 
      System.out.println("Type in your password");
      password = input.next();
      
      if(CORRECT_USERNAME.equals(username)&& CORRECT_PASSWORD.equals(password)){
            System.out.println("Your username and password is correct"); 
            
   }else{
      System.out.println("Cannot login wrong user input");
        } // close else 
        
    } // close main 

} // close class 