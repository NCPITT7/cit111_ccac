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
public class CreatureLand {
   public static void main(String[] args){
       // make a pointer variable 
       Creature penguin; 
       penguin = new Creature(); 
       // writing member variable values 
       penguin.name = "Pablo"; 
       penguin.species = "Emporer Penguin";
       penguin.setSizeLimit(40); 
       penguin.setBiteSizeInPercent(5);
       
       SizedDonut donutForPenguin = new SizedDonut(); 
       donutForPenguin.name = "Chole"; 
       donutForPenguin.sizeInmm = 32; 
       
       penguin.eatDonut(donutForPenguin);
       System.out.println(donutForPenguin.getPercRemaining());      

    } // close method  
} // close Class 
