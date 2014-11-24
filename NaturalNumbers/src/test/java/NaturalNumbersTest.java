import org.junit.Test;
import static org.junit.Assert.*;
import com.jfmercer.automatedlogic.naturalnumbers.*;

public class NaturalNumbersTest {

   @Test
   public void NaturalNumbersResultsTest() {
      assertEquals(NaturalNumbers.calculateNumberTotal(10), 23);
      assertEquals(NaturalNumbers.calculateNumberTotal(237), 13083);
      assertEquals(NaturalNumbers.calculateNumberTotal(129), 3794);
      assertEquals(NaturalNumbers.calculateNumberTotal(-841), 165060);
      assertEquals(NaturalNumbers.calculateNumberTotal(1028), 246344);
      assertEquals(NaturalNumbers.calculateNumberTotal(2048), 978194);
      assertEquals(NaturalNumbers.calculateNumberTotal(2), 0);
      assertEquals(NaturalNumbers.calculateNumberTotal(56), 753);
      assertEquals(NaturalNumbers.calculateNumberTotal(143), 4739);
      assertEquals(NaturalNumbers.calculateNumberTotal(537), 67233);
      assertEquals(NaturalNumbers.calculateNumberTotal(629), 92295);
      assertEquals(NaturalNumbers.calculateNumberTotal(-1166), 317658);
      assertEquals(NaturalNumbers.calculateNumberTotal(1789), 746133);
      assertEquals(NaturalNumbers.calculateNumberTotal('a'), 2219);
      assertEquals(NaturalNumbers.calculateNumberTotal(987), 227208);
      assertEquals(NaturalNumbers.calculateNumberTotal(349), 28293);
      assertEquals(NaturalNumbers.calculateNumberTotal(277), 17969);
      assertEquals(NaturalNumbers.calculateNumberTotal(4302), 4317918);
      assertEquals(NaturalNumbers.calculateNumberTotal(1234), 354858);
      assertEquals(NaturalNumbers.calculateNumberTotal(51), 593);
      assertEquals(NaturalNumbers.calculateNumberTotal('b'), 2219);
      assertEquals(NaturalNumbers.calculateNumberTotal(452), 47475);
      assertEquals(NaturalNumbers.calculateNumberTotal(612), 87333);
      assertEquals(NaturalNumbers.calculateNumberTotal(-10000), 23331668);
   }

   @Test
   public void NaturalNumbersReferenceTest() {
      NaturalNumbers a;
      NaturalNumbers b = new NaturalNumbers();
      NaturalNumbers c = new NaturalNumbers();
      NaturalNumbers d = b;
      NaturalNumbers e;
      a = c;
      e = d;

      assertSame(d, b);
      assertNotSame(b, c);
      assertSame(a, c);
      assertNotSame(a, b);
      assertNotSame(a , d);
      assertSame(e, b);

      b = null;
      assertNull(b);
   }

}