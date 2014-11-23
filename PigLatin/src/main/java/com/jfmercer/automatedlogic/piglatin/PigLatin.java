package com.jfmercer.automatedlogic.piglatin;

/**
 * Description: PigLatin Translator
 *
 * @author: John Mercer
 * @version: 1.0
 */
public final class PigLatin {

   /**
    * Translates a String into Pig Latin.
    *
    * @param input
    * @return output. The input String translated into PigLatin.
    *  If the input is null, returns null.
    */
   public static String translator(String input) {

      if(input == null) {
         return null;
      }

      String output = "";
      String suffix = "ay";
      String[] words = input.split(" ");
      char[] chars;
      StringBuilder builder;
      int firstLetterIndex;
      int lastLetterIndex;

      for(int i = 0; i < words.length; i++) {
         builder = new StringBuilder(words[i].length() + 3);

         chars = words[i].toCharArray();

         firstLetterIndex = findFirstLetter(chars);
         lastLetterIndex = findLastLetter(chars);

         // test for no letter word
         if (firstLetterIndex == -1 && lastLetterIndex == -1) {
            builder.append(words[i]);
            if (i < words.length - 1) {
               builder.append(" ");
            }
            output += builder.toString();
            continue;
         }

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
            else if (j > firstLetterIndex && j < lastLetterIndex) {
               builder.append(chars[j]);
            }
            // append last letter, first letter, & "ay"
            else if (j == lastLetterIndex) {
               builder.append(chars[lastLetterIndex]);
               builder.append(chars[firstLetterIndex]);
               builder.append(suffix);
            }
            // append trailing symbols & digits
            else { // j > lastLetterIndex
               builder.append(chars[j]);
            }
         } // end inner for loop

         // separate words, but don't add trailing whitespace
         if (i < words.length - 1) {
            builder.append(" ");
         }
         output += builder.toString();
      } // end outer for loop

      return output;
   }

   /**
    * Finds first letter in a given word
    * @param chars the given word
    * @return first letter's index or -1 for no letter
    */
   private static int findFirstLetter(char[] chars) {
      int firstLetterIndex = 0;
      boolean isLetter = false;

      for(int i = 0; i < chars.length; i++) {
         if (Character.isLetter(chars[i])) {
            isLetter = true;
            firstLetterIndex = i;
            break;
         }
      }

      if(isLetter) {
         return firstLetterIndex;
      } else {
         return -1;
      }


   }

   /**
    * Finds last letter in a given word
    * @param chars the given word
    * @return last letter's index or -1 for no letter
    */
   private static int findLastLetter(char[] chars) {
      int lastLetterIndex = 0;
      boolean isLetter = false;

      for(int i = chars.length - 1; i >= 0; i--) {
         if (Character.isLetter(chars[i])) {
            isLetter = true;
            lastLetterIndex = i;
            break;
         }
      }

      if(isLetter) {
         return lastLetterIndex;
      } else {
         return -1;
      }
   }
}
