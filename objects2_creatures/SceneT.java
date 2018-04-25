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
public class SceneT {
        public static void main(String[] args){
            // make creature object 
            Creature turtle = new Creature(); 
            // set its species member variable 
            turtle.species = "Turtle with green shell and body"; 
            // make a new Donut object +
            SizedDonut d = new SizedDonut(); 
            // set its id for fun (not in photo) 
            d.id = 102; 
            d.type = "Powdered"; 
            
            printSizedDonutStats(d);
            
            System.out.println("Eating donut...");
            // make sure the turtle takes bite of 50% of a donut
            turtle.setBiteSizeInPercent(20); 
            // then go send the donut to the turtle 
            turtle.eatDonut(d);
            printSizedDonutStats(d); 
        } // close main 
        
        public static void printSizedDonutStats(SizedDonut donutToPrint){
        
            System.out.println("***STATS***");
            System.out.println("Flavor: " + donutToPrint.type);
            System.out.println("ID: " + donutToPrint.id);
            System.out.println("PercRemaining: " + donutToPrint.getPercRemaining());
        } // close method
 } // close class 
        
