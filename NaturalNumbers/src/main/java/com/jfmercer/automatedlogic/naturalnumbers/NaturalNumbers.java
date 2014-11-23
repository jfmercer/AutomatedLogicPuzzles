package com.jfmercer.automatedlogic.naturalnumbers;

/**
 * Description: AutomatedLogicPuzzles
 *
 * @author: John Mercer
 * @version: 1.0
 */
public final class NaturalNumbers
{
   /**
    * Sums all natural numbers less than x
    * which are divisible by 3 or 5.
    *
    * @param x
    */
   public static int calculateNumberTotal(int x) {
      int total = 0;

      if(x < 0) {
         x *= -1;
      }

      for(int i = 0; i < x; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            total += i;
         }
      }

      return total;
   }

}
