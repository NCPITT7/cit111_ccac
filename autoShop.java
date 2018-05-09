/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dyno;

/**
 *
 * @author nicholas.cellone83
 */
public class autoShop {
      public static void main(String[] args){
        DynoStats firstStat = new DynoStats(); 
        
        firstStat.torque = 507; 
        firstStat.engineSpeed = 7560; 
        int returnedHp = firstStat.getHorsepower();
        
          System.out.println("Lamborghini Aventador S Horsepower: " + returnedHp + "HP" );
                
    } // close main
      
} // close class 
