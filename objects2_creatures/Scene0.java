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
public class Scene0 {
    public static void main(String[] args) {
        // make a creature object 
        Creature owl = new Creature(); 
        // set its species member variable 
        owl.species = "Owl with black and white fur"; 
        
        // make a new Donut object 
         SizedDonut d = new SizedDonut(); 
         // set its id for fun (not in photo)
         d.id = 300; 
         d.type = "Cinnamon"; 
         
         printSizedDonutStats(d); 
         
         System.out.println("Eating donut...");
         // make sure the turtle takes bites of 50% of a donut
         owl.setBiteSizeInPercent(34); 
         // then go send the donut to the owl 
         owl.eatDonut(d);
         printSizedDonutStats(d);
         
    } // close main method 
public static void printSizedDonutStats(SizedDonut dtp){
    System.out.println("***STATS***");
    System.out.println("Flavor: " + dtp.type);
    System.out.println("ID: " + dtp.id);
    System.out.println("percRemaining: " + dtp.getPercRemaining());
  } // close method     
    
} // close class
