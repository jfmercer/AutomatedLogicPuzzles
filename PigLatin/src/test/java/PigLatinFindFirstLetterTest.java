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

public class PigLatinFindFirstLetterTest {
   PigLatin pl = new PigLatin();
   Method method;

   public PigLatinFindFirstLetterTest() {
      try {
         this.method = PigLatin.class.getDeclaredMethod("findFirstLetter", char[].class);
         this.method.setAccessible(true);
      } catch (NoSuchMethodException ex) {
         ex.printStackTrace();
      }
   }

   @Test
   public void plainWordsTest() {

      char[] a = "??apple".toCharArray();

      try {
         assertEquals(2, method.invoke(pl, a));
      }
      catch (IllegalAccessException ex) {
         ex.printStackTrace();
      }
      catch (InvocationTargetException ex) {
         ex.printStackTrace();
      }
   }
}
