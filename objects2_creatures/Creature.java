/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author nicholas.cellone83
 */
public class Creature {
    
    public String name;
    public String species; 
    
    private int biteSizeInPercent;
    private int numBitesTaken; 
    private int sizeLimit; 
    
    // Method to simulate eating donut 
    public int eatDonut(SizedDonut donutToEat){
        // we'll program guts here 
        donutToEat.simulateEating(biteSizeInPercent);
        return numBitesTaken; 
    }
    
    // "getter" method a private member variable: ,sizeLimit 
    public int setSizeLimit(){
      // just send back the value of sizeLimit 
      return sizeLimit;
    }
    
    // "setter" method for private member variable: sizeLimit
    public void setSizeLimit(int sizeLimit){
       // we need guts to check for a resonable size limit 
       this.sizeLimit = sizeLimit; 
    }

    // "getter" for numBitesTaken
    public int getNumBitesTaken() {
        // just send back the value of numBitesTaken 
        return numBitesTaken;
    }
    
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    }
    
    // setter method for biteSizeInPercent 
    public void setBiteSizeInPercent(int biteSizeInPercent){
        // we need guts to check bite size 
        this.biteSizeInPercent = biteSizeInPercent;
    }
} // close class 


