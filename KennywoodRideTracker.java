/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1;
import java.util.Random;
/**
 *
 * @author nicholas.cellone83
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0; 
    private static int totalFailedRideAttempts = 0; 
    private static int totalSickRiders = 0; 
    
    // these are final variables to store height thresholds 
    private static int MIN_HEIGHT_THEME_RIDERS = 46;
    private static int MIN_HEIGHT_TRILLRIDERS = 52;
    
    public static void rideBlackWidow(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_TRILLRIDERS){
        
            System.out.println("Riding Black Widow!"); 
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders + 1); 
             totalSickRiders = numSickRiders + totalSickRiders; 
                    
        }else{
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("The amount of riders who were turned away " + riders);
        } // close else 
    
    } // closes method rideBlackWidow
    
    
    public static void rideMerryGoRound(int riders, int avgHeight){
        if(avgHeight >= MIN_HEIGHT_TRILLRIDERS){
            System.out.println("Riding the Merry Go Round!"); 
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders + 1); 
             totalSickRiders = numSickRiders + totalSickRiders; 
      
        }else{ 
          totalFailedRideAttempts = totalFailedRideAttempts + riders;
            System.out.println("The amount of riders who were turned away" + riders);
        } // close else 
    } // closes method rideMerryGoRound 
    
    public static void printRideStats(){
    
        System.out.println("Total Riders " + totalRiders);
        System.out.println("Total Sick Riders " + totalSickRiders);
        System.out.println("Failed Ride Attempts " + totalFailedRideAttempts);
                
                
    } // closes method printRideStats
    
    public static void main(String[] args){
        
        rideBlackWidow(50,52);
        rideMerryGoRound(80,46);
        
        printRideStats(); 
    } 

}


