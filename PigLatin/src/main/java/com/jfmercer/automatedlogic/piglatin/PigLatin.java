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

      boolean print = true;

      for(int i = 0; i < words.length; i++) {
         builder = new StringBuilder(words[i].length() + 3);
//         System.out.println("Length of " + words[i] + " is " + words[i].length());
//         System.out.println("Length of builder is " + builder.capacity());

         chars = words[i].toCharArray(); // TOO SHORT BY 2!!!!!!!
//         System.out.println("Length of chars is " + chars.length);

         firstLetterIndex = findFirstLetter(chars);
         lastLetterIndex = findLastLetter(chars);
//         if (print) {
//            System.out.println("First letter is " + chars[firstLetterIndex]);
//            System.out.println("Last letter is " + chars[lastLetterIndex]);
//            print = false;
//         }

         for (int j = 0; j < chars.length; j++) {
            // skip leading digits & symbols
            if (j < firstLetterIndex) {
//               System.out.println("Leading symbols/digits are " + chars[j]);
               builder.append(chars[j]);
               continue;
            }
            // skip first letter
            else if (j == firstLetterIndex) {
//               System.out.println("First letter is " + chars[j]);
               continue;
            }
            // add middle letters, digits, and symbols
            else if (j > firstLetterIndex && j < lastLetterIndex) {
//               System.out.println("Middle chars are " + chars[j]);
               builder.append(chars[j]);
            }
            // append last letter, first letter, & "ay"
            else if (j == lastLetterIndex) {
//               System.out.println("Appending end " + chars[lastLetterIndex] +
//                                          chars[firstLetterIndex] + suffix);
               builder.append(chars[lastLetterIndex]);
               builder.append(chars[firstLetterIndex]);
               builder.append(suffix);
            }
            // append trailing symbols & digits
            else { // j > lastLetterIndex
//               System.out.println("Appending trailing symbols/digits " + chars[j]);
               builder.append(chars[j]);
            }
//            System.out.println(builder.toString());


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
    * @return first letter's index
    */
   private static int findFirstLetter(char[] chars) {
      int firstLetterIndex = 0;

      for(int i = 0; i < chars.length; i++) {
         if (Character.isLetter(chars[i])) {
            firstLetterIndex = i;
            break;
         }
      }

      return firstLetterIndex;
   }

   /**
    * Finds last letter in a given word
    * @param chars the given word
    * @return last letter's index
    */
   private static int findLastLetter(char[] chars) {
      int lastLetterIndex = 0;

      for(int i = chars.length - 1; i >= 0; i--) {
         if (Character.isLetter(chars[i])) {
            lastLetterIndex = i;
            break;
         }
      }

      return lastLetterIndex;
   }
}
