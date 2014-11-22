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
    *
    * @param x
    * @return
    */
   public void calculateNumberTotal(int x) {
      int total = 0;

      if(x < 0) {
         x = 0;
      }

      for(int i = 0; i <= x; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            total += i;
         }
      }

      printResults(x, total);
   }

   private void printResults(int x, int total) {
      System.out.print("You entered " + x + " and your total is " + total + ".\n");
   }
}
