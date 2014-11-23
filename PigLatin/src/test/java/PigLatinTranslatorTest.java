import org.junit.Test;
import static org.junit.Assert.*;
import com.jfmercer.automatedlogic.piglatin.*;

/**
 * Description: PigLatin
 *
 * This is a JUnit test for the PigLatin translator method.
 *
 * @author: John Mercer
 * @version: 1.0
 */


public class PigLatinTranslatorTest
{

   @Test // leading numbers
   public void leadingNumbersTest() {

      String a = "The 11quick brown fox jumps over the lazy dog";
      String b = "The quick 22brown fox jumps over the lazy dog";
      String c = "The 9quick brown 33fox jumps over the lazy dog";
      String d = "The quick 8brown fox jumps 44over the lazy dog";
      String e = "The 6quick brown fox jumps over the 55lazy dog";

      assertEquals(PigLatin.translator(a), "heTay 11uickqay rownbay oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "heTay uickqay 22rownbay oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(c), "heTay 9uickqay rownbay 33oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(d), "heTay uickqay 8rownbay oxfay umpsjay 44veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(e), "heTay 6uickqay rownbay oxfay umpsjay veroay hetay 55azylay ogday");
   }

   @Test
   public void middleNumbersTest() {
      String a = "The qui55ck brown fox jum6ps over the lazy dog";
      String b = "Th7e quick brown fox ju4578mps over the lazy dog";
      String c = "The qui43ck brown fox jumps over the la89zy dog";
      String d = "The quick brown fox jumps over the lazy dog";
      String e = "T9he quick br7own fox jumps o5ver the la3zy do6g";

      assertEquals(PigLatin.translator(a), "heTay ui55ckqay rownbay oxfay um6psjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "h7eTay uickqay rownbay oxfay u4578mpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(c), "heTay ui43ckqay rownbay oxfay umpsjay veroay hetay a89zylay ogday");
      assertEquals(PigLatin.translator(d), "heTay uickqay rownbay oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(e), "9heTay uickqay r7ownbay oxfay umpsjay 5veroay hetay a3zylay o6gday");
   }

   @Test
   public void trailingNumbersTest() {
      String a = "The quick34 brown fox jumps over123 the lazy dog2";
      String b = "The34 quick brown809 fox jumps57 over the4 lazy5 dog6";
      String c = "The1 quick2 brown3 fox4 jumps5 over6 the7 lazy8 dog9";
      String d = "The3243 quick223 brown23432 fox jumps2342 over the234 lazy dog";
      String e = "The456 quick brown890 fox jumps over11 the lazy43 dog";

      assertEquals(PigLatin.translator(a), "heTay uickqay34 rownbay oxfay umpsjay veroay123 hetay azylay ogday2");
      assertEquals(PigLatin.translator(b), "heTay34 uickqay rownbay809 oxfay umpsjay57 veroay hetay4 azylay5 ogday6");
      assertEquals(PigLatin.translator(c), "heTay1 uickqay2 rownbay3 oxfay4 umpsjay5 veroay6 hetay7 azylay8 ogday9");
      assertEquals(PigLatin.translator(d), "heTay3243 uickqay223 rownbay23432 oxfay umpsjay2342 veroay hetay234 azylay ogday");
      assertEquals(PigLatin.translator(e), "heTay456 uickqay rownbay890 oxfay umpsjay veroay11 hetay azylay43 ogday");
   }

   @Test
   public void leadingSymbolsTest() {
      String a = "!!The ##quick ^%$brown fox jumps over the lazy dog";
      String b = "The ()&^quick brown #$@fox jumps over the lazy dog";
      String c = "The quick brown fox jumps $over %the ^lazy &dog";
      String d = "!The @@quick ###brown $$$$fox jumps over the lazy dog";
      String e = "The quick brown %fox ^^jumps &&over ***the ((lazy )dog";

      assertEquals(PigLatin.translator(a), "!!heTay ##uickqay ^%$rownbay oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "heTay ()&^uickqay rownbay #$@oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(c), "heTay uickqay rownbay oxfay umpsjay $veroay %hetay ^azylay &ogday");
      assertEquals(PigLatin.translator(d), "!heTay @@uickqay ###rownbay $$$$oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(e), "heTay uickqay rownbay %oxfay ^^umpsjay &&veroay ***hetay ((azylay )ogday");
   }

   @Test
   public void middleSymbolsTest() {
      String a = "The qu$#ick brown fox j&^umps ov*(er the lazy dog";
      String b = "T!he qui#ck bro&wn fo(x jumps ove))r the lazy dog";
      String c = "Th!@#e quick brown fox ju$%^mps over the lazy dog";
      String d = "The qui!)&ck brown f%@(ox jumps over the lazy d%@$og";
      String e = "Th@@e q!!uick b$$rown fo%%x ju&&mps o^ver t(he la)zy d%$og";

      assertEquals(PigLatin.translator(a), "heTay u$#ickqay rownbay oxfay &^umpsjay v*(eroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "!heTay ui#ckqay ro&wnbay o(xfay umpsjay ve))roay hetay azylay ogday");
      assertEquals(PigLatin.translator(c), "h!@#eTay uickqay rownbay oxfay u$%^mpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(d), "heTay ui!)&ckqay rownbay %@(oxfay umpsjay veroay hetay azylay %@$ogday");
      assertEquals(PigLatin.translator(e), "h@@eTay !!uickqay $$rownbay o%%xfay u&&mpsjay ^veroay (hetay a)zylay %$ogday");
   }

   @Test
   public void trailingSymbolsTest() {
      String a = "The quick brown fox jumps over the lazy dog!?!?!?!";
      String b = "The quick brown#$ fox jumps%^ over the lazy dog!!!!!";
      String c = "The!@# quick brown fox jumps over the&% lazy dog.@";
      String d = "The@# quick brown fox jumps#$% over the^&* lazy dog.";
      String e = "The quick!@# brown@#$ fox(*& jumps over the lazy dog.";

      assertEquals(PigLatin.translator(a), "heTay uickqay rownbay oxfay umpsjay veroay hetay azylay ogday!?!?!?!");
      assertEquals(PigLatin.translator(b), "heTay uickqay rownbay#$ oxfay umpsjay%^ veroay hetay azylay ogday!!!!!");
      assertEquals(PigLatin.translator(c), "heTay!@# uickqay rownbay oxfay umpsjay veroay hetay&% azylay ogday.@");
      assertEquals(PigLatin.translator(d), "heTay@# uickqay rownbay oxfay umpsjay#$% veroay hetay^&* azylay ogday.");
      assertEquals(PigLatin.translator(e), "heTay uickqay!@# rownbay@#$ oxfay(*& umpsjay veroay hetay azylay ogday.");
   }

   @Test
   public void leadingMixedTest() {
      String a = "#11The 23@#quick brown &^*2*fox jumps over the lazy dog";
      String b = "The @4#quick $%44^brown fox *&8^jumps over the @#34$lazy $%99^dog";
      String c = "1!The quick 2@brown fox 3#jumps 4$over 5%the 8*lazy 9(dog";
      String d = "23$The quick ^%56brown fox jumps 87^^over the lazy dog";
      String e = "The $35quick brown ^11fox jumps 23%^over the lazy %3$9dog";

      assertEquals(PigLatin.translator(a), "#11heTay 23@#uickqay rownbay &^*2*oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "heTay @4#uickqay $%44^rownbay oxfay *&8^umpsjay veroay hetay @#34$azylay $%99^ogday");
      assertEquals(PigLatin.translator(c), "1!heTay uickqay 2@rownbay oxfay 3#umpsjay 4$veroay 5%hetay 8*azylay 9(ogday");
      assertEquals(PigLatin.translator(d), "23$heTay uickqay ^%56rownbay oxfay umpsjay 87^^veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(e), "heTay $35uickqay rownbay ^11oxfay umpsjay 23%^veroay hetay azylay %3$9ogday");
   }

   @Test
   public void middleMixedTest() {
      String a = "The qui2#ck brown fox ju$#mps over the lazy dog";
      String b = "The quick bro!3@wn fox jumps ov*8(er the lazy dog";
      String c = "The qui2#2ck brown fox jumps over the lazy dog";
      String d = "The quick bro##55!!wn fox jumps over th22!@e lazy dog";
      String e = "The qui%5^47ck brown fox ju99##00!!mps over the la!38zy dog";

      assertEquals(PigLatin.translator(a), "heTay ui2#ckqay rownbay oxfay u$#mpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(b), "heTay uickqay ro!3@wnbay oxfay umpsjay v*8(eroay hetay azylay ogday");
      assertEquals(PigLatin.translator(c), "heTay ui2#2ckqay rownbay oxfay umpsjay veroay hetay azylay ogday");
      assertEquals(PigLatin.translator(d), "heTay uickqay ro##55!!wnbay oxfay umpsjay veroay h22!@etay azylay ogday");
      assertEquals(PigLatin.translator(e), "heTay ui%5^47ckqay rownbay oxfay u99##00!!mpsjay veroay hetay a!38zylay ogday");
   }

   @Test
   public void trailingMixedTest() {
      String a = "The quick brown fox jumps over the lazy dog!?!?!";
      String b = "The quick brown$2 fox jumps3$ over the lazy dog.....";
      String c = "The2# quick brown4$4 fox jumps7*3 over the%5 lazy dog.";
      String d = "The quick8* brown fox2@ jumps over the44$$ lazy dog.";
      String e = "The3$$ quick$%3 brown fox jumps45%% over the@#4^^ lazy dog.";

      assertEquals(PigLatin.translator(a), "heTay uickqay rownbay oxfay umpsjay veroay hetay azylay ogday!?!?!");
      assertEquals(PigLatin.translator(b), "heTay uickqay rownbay$2 oxfay umpsjay3$ veroay hetay azylay ogday.....");
      assertEquals(PigLatin.translator(c), "heTay2# uickqay rownbay4$4 oxfay umpsjay7*3 veroay hetay%5 azylay ogday.");
      assertEquals(PigLatin.translator(d), "heTay uickqay8* rownbay oxfay2@ umpsjay veroay hetay44$$ azylay ogday.");
      assertEquals(PigLatin.translator(e), "heTay3$$ uickqay$%3 rownbay oxfay umpsjay45%% veroay hetay@#4^^ azylay ogday.");
   }

   @Test
   public void nullPointerTest() {
      String a = "null";
      String b = null;
      String c = "The null brown fox jumps over the lazy dog.";
      String d = "The quick " + null + " brown fox jumps over the lazy dog.";
      String e = b;

      assertEquals(PigLatin.translator(a), "ullnay");
      assertEquals(PigLatin.translator(b), null);
      assertEquals(PigLatin.translator(c), "heTay ullnay rownbay oxfay umpsjay veroay hetay azylay ogday.");
      assertEquals(PigLatin.translator(d), "heTay uickqay ullnay rownbay oxfay umpsjay veroay hetay azylay ogday.");
      assertEquals(PigLatin.translator(e), null);
   }


//   @Test
//   public void anythingGoesTest() {
//      String a = "The quick brown fox jumps over the lazy dog.";
//      String b = "The quick brown fox jumps over the lazy dog.";
//      String c = "The quick brown fox jumps over the lazy dog.";
//      String d = "The quick brown fox jumps over the lazy dog.";
//      String e = "The quick brown fox jumps over the lazy dog.";
//
//      assertEquals(PigLatin.translator(a), "");
//      assertEquals(PigLatin.translator(b), "");
//      assertEquals(PigLatin.translator(c), "");
//      assertEquals(PigLatin.translator(d), "");
//      assertEquals(PigLatin.translator(e), "");
//   }
}
