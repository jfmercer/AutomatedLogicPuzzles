package com.jfmercer.automatedlogic.naturalnumbers;

/**
 * Description: AutomatedLogicPuzzles
 *
 * @author: John Mercer
 * @version: AutomatedLogicPuzzles
 */
public class NaturalNumbers
{
   /**
    * Sums all natural numbers less than x
    * which are divisible by 3 or 5.
    *
    * @param x
    */
   public void calculateNumberTotal(int x) {
      int total = 0;

      if(x < 0) {
         x = 0;
      }

      for(int i = 0; i < x; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            total += i;
         }
      }

      printResults(x, total);
   }

   /**
    * Prints out the results of method
    * calculateNumberTotal;
    *
    * @param x
    * @param total
    */
   private void printResults(int x, int total) {
      System.out.print("You entered " + x + " and your total is " + total + ".\n");
   }
}
