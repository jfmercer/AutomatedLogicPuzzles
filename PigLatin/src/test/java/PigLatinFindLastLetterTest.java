import org.junit.Test;
import static org.junit.Assert.*;
import com.jfmercer.automatedlogic.piglatin.*;
import java.lang.reflect.*;

/**
 * Description: PigLatin
 *
 * This is a JUnit test for the PigLatin findFirstLetter method.
 *
 * @author: John Mercer
 * @version: 1.0
 */

public class PigLatinFindLastLetterTest {
   Word word = new Word("word");
   Method method;

   public PigLatinFindLastLetterTest() {
      try {
         this.method = Word.class.getDeclaredMethod("findLastLetter", char[].class);
         this.method.setAccessible(true);
      } catch (NoSuchMethodException ex) {
         ex.printStackTrace();
      }
   }

   @Test
   public void plainWordsTest() {

      char[] a = "apple".toCharArray();
      char[] b = "butter".toCharArray();
      char[] c = "cracker".toCharArray();
      char[] d = "dumpling".toCharArray();
      char[] e = "egg".toCharArray();


      try {
         assertEquals(4, method.invoke(word, a));
         assertEquals(5, method.invoke(word, b));
         assertEquals(6, method.invoke(word, c));
         assertEquals(7, method.invoke(word, d));
         assertEquals(2, method.invoke(word, e));
      }
      catch (IllegalAccessException ex) {
         ex.printStackTrace();
      }
      catch (InvocationTargetException ex) {
         ex.printStackTrace();
      }
   }

   @Test
   public void strangeWordsTest() {

      char[] a = "apple@#$".toCharArray();
      char[] b = "butter2()4".toCharArray();
      char[] c = "cracker@".toCharArray();
      char[] d = "dumpling2()4".toCharArray();
      char[] e = "egg&7%9(5)".toCharArray();


      try {
         assertEquals(4, method.invoke(word, a));
         assertEquals(5, method.invoke(word, b));
         assertEquals(6, method.invoke(word, c));
         assertEquals(7, method.invoke(word, d));
         assertEquals(2, method.invoke(word, e));
      }
      catch (IllegalAccessException ex) {
         ex.printStackTrace();
      }
      catch (InvocationTargetException ex) {
         ex.printStackTrace();
      }
   }

   @Test
   public void noWordsTest() {

      char[] a = "@#$234".toCharArray();
      char[] b = "2()45%7".toCharArray();
      char[] c = "@90#$&".toCharArray();
      char[] d = "78%^90(&".toCharArray();
      char[] e = "&7%9(#$&*5".toCharArray();


      try {
         assertEquals(-1, method.invoke(word, a));
         assertEquals(-1, method.invoke(word, b));
         assertEquals(-1, method.invoke(word, c));
         assertEquals(-1, method.invoke(word, d));
         assertEquals(-1, method.invoke(word, e));
      }
      catch (IllegalAccessException ex) {
         ex.printStackTrace();
      }
      catch (InvocationTargetException ex) {
         ex.printStackTrace();
      }
   }
}
