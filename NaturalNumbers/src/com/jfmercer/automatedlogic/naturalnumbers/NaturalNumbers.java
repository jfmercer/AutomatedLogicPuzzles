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
   public static void calculateNumberTotal(int x) {
      int total = 0;

      if(x < 0) {
         System.out.print("You must enter a natural number. " + x + " will be converted to a " +
                                  "positive number.\n");
         x = x * -1;
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
    * @param x The original number entered.
    * @param total The total from the calculateNumberTotal method.
    */
   private static void printResults(int x, int total) {
      System.out.print("You entered " + x + " and your total is " + total + ".\n");
   }
}
