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
        
        firstStat.torque = 400; 
        firstStat.engineSpeed = 3000; 
        int returnedHp = firstStat.getHorsepower();
        
          System.out.println("Horsepower: " + returnedHp + "HP" );
                
    } // close main
      
} // close class 
