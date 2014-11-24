package com.jfmercer.automatedlogic.piglatin;

/**
 * Description: PigLatin
 *
 * @author: John Mercer
 * @version: PigLatin
 */
public class Word {

   private String word;

   public Word(String word) {
      if (word == null) {
         // do something
      }
      this.word = word;
   }

   public Word getWord() {
      return this;
   }

   public void setWord(String word) {
      this.word = word;
   }

   @Override
   public String toString() {
      return this.word;
   }

   public int length() {
      return this.word.length();
   }

   public Word toPigLatin() {

      String input = word.toString();

      if(input == null) {
         return null;
      }

      String suffix = "ay";
      char[] chars;
      StringBuilder builder;
      int firstLetterIndex;
      int lastLetterIndex;


      builder = new StringBuilder(input.length() + 2);

      chars = input.toString().toCharArray();

      firstLetterIndex = findFirstLetter(chars);
      lastLetterIndex = findLastLetter(chars);

      for (int j = 0; j < chars.length; j++) {
         // test for no letter word
         if (firstLetterIndex == -1 && lastLetterIndex == -1) {
            return getWord();
         }
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

      setWord(builder.toString());

      return getWord();
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
