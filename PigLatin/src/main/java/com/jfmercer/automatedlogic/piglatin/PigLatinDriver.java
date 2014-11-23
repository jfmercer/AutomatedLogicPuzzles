package com.jfmercer.automatedlogic.piglatin;

/**
 * Description: PigLatin
 *
 * @author: John Mercer
 * @version: PigLatin
 */
public class PigLatinDriver {

   public static void main (String[] args) {

      String a = "The qui55ck brown fox jum6ps over the lazy dog.";
      String b = "Th7e quick brown fox ju4578mps over the lazy dog.";
      String c = "The qui43ck brown fox jumps over the la89zy dog.";
      String d = "The quick brown fox jumps over the lazy dog.";
      String e = "T9he quick br7own fox jumps o5ver the la3zy do6g.";
      String f = "???????";


      System.out.print(a + " SHOULD BE " + PigLatin.translator(null) + "\n");
      System.out.print(b + " SHOULD BE " + PigLatin.translator(b) + "\n");
      System.out.print(c + " SHOULD BE " + PigLatin.translator(c) + "\n");
      System.out.print(d + " SHOULD BE " + PigLatin.translator(d) + "\n");
      System.out.print(e + " SHOULD BE " + PigLatin.translator(e) + "\n");
      System.out.print(f + " SHOULD BE " + PigLatin.translator(f) + "\n");

   }

}
