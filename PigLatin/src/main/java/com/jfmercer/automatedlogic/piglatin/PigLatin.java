package com.jfmercer.automatedlogic.piglatin;

import java.util.ArrayList;

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

      ArrayList<Word> wordList = new ArrayList<Word>();
      StringBuilder builder = new StringBuilder();
      String[] words;

      if(input == null) {
         return null;
      }

      words = input.split(" ");

      for (String word : words) {
         wordList.add(new Word (word));
      }

      for(int i = 0; i < wordList.size() - 1; i++) {
         builder.append(wordList.get(i).toPigLatin().toString());
         builder.append(' ');
      }

      builder.deleteCharAt(builder.toString().length() - 1);

      return builder.toString();
   }
}
