package com.jfmercer.automatedlogic.piglatin;

/**
 * Description: PigLatin
 *
 * @author: John Mercer
 * @version: PigLatin
 */
public final class PigLatin {

   /**
    *
    * @param input
    * @return output. The input String translated into PigLatin.
    */
   public static String translator(String input) {

      String output = "";
      String suffix = "ay";
      String[] words = input.split(" ");
      char[] chars;
      StringBuilder builder;
      int firstLetterIndex;
      int lastLetterIndex;

      for(int i = 0; i < words.length; i++) {
         builder = new StringBuilder(words[i].length() + 2);
         chars = words[i].toCharArray();

         firstLetterIndex = findFirstLetter(chars);
         lastLetterIndex = findLastLetter(chars);

         for (int j = 0; j < chars.length; j++) {
            // skip leading digits & symbols
            if (j < firstLetterIndex) {
               builder.append(chars[j]);
               continue;
            }
            // skip first letter
            else if (j == firstLetterIndex) {
               continue;
            }
            // add middle letters, digits, and symbols
            else if (j > firstLetterIndex && j < lastLetterIndex) {
               builder.append(chars[j]);
            }
            // append last letter, first letter, & "ay"
            else if (j == lastLetterIndex) {
               builder.append(chars[j] + chars[firstLetterIndex] + suffix);
            }
            // append trailing symbols & digits
            else { // j > lastLetterIndex
               builder.append(chars[j]);
            }

         }
         // don't add trailing whitespace at end of string
         if (i != words.length - 1) {
            builder.append(" ");
         }

         output += builder.toString();
      }

      return output;
   }

   private static int findFirstLetter(char[] chars) {
      int firstLetterIndex = 0;

      for(int i = 0; i < chars.length; i++) {
         if (Character.isAlphabetic(chars[i])) {
            firstLetterIndex = i;
            break;
         }
      }

      return firstLetterIndex;
   }

   private static int findLastLetter(char[] chars) {
      int lastLetterIndex = 0;

      for(int i = chars.length - 1; i >= 0; i--) {
         if (Character.isAlphabetic(chars[i])) {
            lastLetterIndex = i;
            break;
         }
      }

      return lastLetterIndex;
   }
}
