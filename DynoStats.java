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
public class DynoStats {
   private int horsepower;
   public int torque; 
   public int engineSpeed;               
 final int radiansPerSecond = 5252; 
 public int getHorsepower(){
     horsepower = (engineSpeed * torque)/radiansPerSecond;
     return horsepower; 
 } 
     
} // close class
