/*
 * This file was automatically generated by EvoSuite
 * Sat May 13 21:57:31 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true)
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 11, 0, "%Y-%M%z", "%Y-%M%z");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t11/11/0 at 12:0am ,%Y-%M%z, %Y-%M%z\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, (-2794), "@Ir+/+_>>9rvou", "@Ir+/+_>>9rvou");
      boolean boolean0 = appt0.getValid();
      assertTrue(boolean0);
      assertEquals("@Ir+/+_>>9rvou", appt0.getDescription());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartDay());
      assertEquals("@Ir+/+_>>9rvou", appt0.getTitle());
      assertEquals(11, appt0.getStartHour());
      assertEquals(-2794, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      appt0.getTitle();
      assertEquals(2000, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 1319, 1319, (-774), 0, "$d.o~gtDT2WQYfaM", "$d.o~gtDT2WQYfaM");
      int int0 = appt0.getStartYear();
      assertEquals(0, appt0.getStartHour());
      assertEquals("$d.o~gtDT2WQYfaM", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(-774, appt0.getStartMonth());
      assertEquals("$d.o~gtDT2WQYfaM", appt0.getTitle());
      assertEquals(1319, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(1319, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, (-23), 0, 0, (-23), "d", (String) null);
      int int0 = appt0.getStartYear();
      assertEquals(-23, appt0.getStartMinute());
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertEquals((-23), int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals("d", appt0.getTitle());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      assertEquals(0, appt0.getStartMonth());
      
      appt0.setStartMonth(2000);
      int int0 = appt0.getStartMonth();
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), 0, ":", (String) null);
      int int0 = appt0.getStartMonth();
      assertEquals(-1, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals((-1), int0);
      assertEquals(-1, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(":", appt0.getTitle());
      assertEquals("", appt0.getDescription());
      assertEquals(-1, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      assertEquals(0, appt0.getStartMinute());
      
      appt0.setStartMinute(2000);
      int int0 = appt0.getStartMinute();
      assertEquals(2000, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(37, (-1781), (-547), 814, 0, " at ", "");
      int int0 = appt0.getStartMinute();
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(814, appt0.getStartMonth());
      assertEquals((-1781), int0);
      assertEquals(37, appt0.getStartHour());
      assertEquals(-547, appt0.getStartDay());
      assertEquals(" at ", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(37, (-1781), (-547), 814, 0, " at ", "");
      int int0 = appt0.getStartHour();
      assertEquals("", appt0.getDescription());
      assertEquals(" at ", appt0.getTitle());
      assertEquals(37, int0);
      assertEquals(-547, appt0.getStartDay());
      assertEquals(-1781, appt0.getStartMinute());
      assertEquals(814, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt((-2794), (-2794), (-2794), 23, (-2794), "XJA{fP", "XJA{fP");
      int int0 = appt0.getStartHour();
      assertFalse(appt0.getValid());
      assertEquals("XJA{fP", appt0.getTitle());
      assertEquals(-2794, appt0.getStartYear());
      assertEquals(-2794, appt0.getStartMinute());
      assertEquals(-2794, appt0.getStartDay());
      assertEquals("XJA{fP", appt0.getDescription());
      assertEquals((-2794), int0);
      assertEquals(23, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(328, 0, 0, 328, 0, "5z\"Mv@vzLTR4.eEX ", "5z\"Mv@vzLTR4.eEX ");
      int int0 = appt0.getStartDay();
      assertEquals(328, appt0.getStartMonth());
      assertEquals("5z\"Mv@vzLTR4.eEX ", appt0.getTitle());
      assertEquals(328, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("5z\"Mv@vzLTR4.eEX ", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(2709, 2709, (-1), 104, (-175), "#xB6*u", "#xB6*u");
      int int0 = appt0.getStartDay();
      assertEquals(2709, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals((-1), int0);
      assertEquals("#xB6*u", appt0.getTitle());
      assertEquals("#xB6*u", appt0.getDescription());
      assertEquals(-175, appt0.getStartYear());
      assertEquals(104, appt0.getStartMonth());
      assertEquals(2709, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-2286), (-1262), 2, 0, 2, "", "");
      appt0.getDescription();
      assertEquals(-2286, appt0.getStartHour());
      assertEquals(2, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-1262, appt0.getStartMinute());
      assertEquals(2, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 0, 0, "R_H", "R_H");
      appt0.setDescription(", ");
      assertEquals(", ", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(11, 59, 11, 11, 11, (String) null, (String) null);
      appt0.setTitle("");
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartDay());
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartHour());
      assertEquals(59, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(1, 491, 0, 1657, 1, (String) null, (String) null);
      appt0.setTitle((String) null);
      assertEquals(0, appt0.getStartDay());
      assertEquals(491, appt0.getStartMinute());
      assertEquals(1657, appt0.getStartMonth());
      assertEquals(1, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 11, 0, "%Y-%M%z", "%Y-%M%z");
      appt0.setStartHour(1112);
      assertEquals(1112, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-674), (-674), (-674), "e)k+6eYZS(r4/w6`uX2", "e)k+6eYZS(r4/w6`uX2");
      String string0 = appt0.getTitle();
      assertEquals(-674, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("e)k+6eYZS(r4/w6`uX2", string0);
      assertFalse(appt0.getValid());
      assertEquals(-674, appt0.getStartDay());
      assertEquals(-674, appt0.getStartMonth());
      assertEquals("e)k+6eYZS(r4/w6`uX2", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-565), 1, 1767, (-565), 1917, "nuLUR(+JC3 ", "nuLUR(+JC3 ");
      int int0 = appt0.getStartDay();
      assertFalse(appt0.getValid());
      assertEquals(1767, int0);
      assertEquals(-565, appt0.getStartMonth());
      assertEquals("nuLUR(+JC3 ", appt0.getTitle());
      assertEquals(1917, appt0.getStartYear());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(-565, appt0.getStartHour());
      assertEquals("nuLUR(+JC3 ", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-961), (-961), (-961), 0, 0, ".a'L&)5R", ".a'L&)5R");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartYear());
      assertEquals(-961, appt0.getStartMinute());
      assertEquals(-961, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals(".a'L&)5R", appt0.getTitle());
      assertEquals(-961, appt0.getStartDay());
      assertEquals(".a'L&)5R", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(2000, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      int int0 = appt0.getStartYear();
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(2000, int0);
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, (-2794), "@Ir+/+_>>9rvou", "@Ir+/+_>>9rvou");
      String string0 = appt0.getDescription();
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartMonth());
      assertEquals("@Ir+/+_>>9rvou", appt0.getTitle());
      assertEquals(11, appt0.getStartHour());
      assertEquals(-2794, appt0.getStartYear());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartDay());
      assertEquals("@Ir+/+_>>9rvou", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 0, 0, "R_H", "R_H");
      int int0 = appt0.getStartMonth();
      assertEquals("R_H", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, int0);
      assertEquals(11, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals("R_H", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, "89G`<:<ny", "89G`<:<ny");
      String string0 = appt0.toString();
      assertEquals("\t12/12/12 at 12:12pm ,89G`<:<ny, 89G`<:<ny\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 0, 0, "R_H", "R_H");
      String string0 = appt0.toString();
      assertNull(string0);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(11, appt0.getStartDay());
      assertEquals("R_H", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals("R_H", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(11, 59, 11, 11, 11, (String) null, (String) null);
      appt0.setStartMonth(31);
      assertEquals(31, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 2079, 0, 0, "I$d(F(`@R)>7", "I$d(F(`@R)>7");
      assertEquals(2079, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("I$d(F(`@R)>7", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals("I$d(F(`@R)>7", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 2000, "", "");
      int int0 = appt0.getStartMinute();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(2000, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt((-588), 0, 2011, 0, 0, "!'o~Hq8", (String) null);
      assertEquals("", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals("!'o~Hq8", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(2011, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-588, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 0, 0, "R_H", "R_H");
      assertEquals(0, appt0.getStartYear());
      
      appt0.setStartYear(11);
      assertEquals("R_H", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 11, 0, 0, "R_H", "R_H");
      appt0.setStartDay(31);
      assertEquals(31, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(1468, 1468, 1468, 3036, (-899), "org.apache.xerces.jaxp.datatype.DurationImpl", "am");
      appt0.setStartHour(23);
      assertEquals(23, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, (-2794), "@Ir+/+_>>9rvou", "@Ir+/+_>>9rvou");
      String string0 = appt0.toString();
      assertEquals("\t11/11/-2794 at 11:11am ,@Ir+/+_>>9rvou, @Ir+/+_>>9rvou\n", string0);
      assertNotNull(string0);
  }
    @Test //Testing constructor for simple valid input
    public void test0() throws Throwable {
        int startHour = 1;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );

        assertEquals(1, test.getStartHour());
        assertEquals(1, test.getStartDay());
        assertEquals(1, test.getStartMonth());
        assertEquals(1, test.getStartMinute());
        assertEquals(1, test.getStartYear());
        assertEquals("It's one", test.getTitle());
        assertEquals("Lot of one's", test.getDescription());
        assertTrue(test.getValid());
    }

    @Test //Testing setter function setStartHour
    public void test1() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );

        //Testing for valid/under/over
        test.setStartHour(1);
        assertTrue(test.getValid());
        test.setStartHour(-1);
        assertFalse(test.getValid());
        test.setStartHour(33);
        assertFalse(test.getValid());

        test.setStartHour(1);
        assertTrue(test.getValid());
    }

    @Test //Testing setter function setStartMinute
    public void test2() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );
        test.setStartMinute(1);
        assertTrue(test.getValid());
        test.setStartMinute(-1);
        assertFalse(test.getValid());
        test.setStartMinute(60);
        assertFalse(test.getValid());

        test.setStartMinute(1);
        assertTrue(test.getValid());
    }

    @Test //Testing setter function setStartDay
    public void test3() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );
        test.setStartDay(1);
        assertTrue(test.getValid());
        test.setStartDay(-1);
        assertFalse(test.getValid());
        test.setStartDay(32);
        assertFalse(test.getValid());

        test.setStartDay(1);
        assertTrue(test.getValid());
    }

    @Test //Testing setter function setStartMonth
    public void test4() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );
        test.setStartMonth(1);
        assertTrue(test.getValid());
        test.setStartMonth(-1);
        assertFalse(test.getValid());
        test.setStartMonth(13);
        assertFalse(test.getValid());

        test.setStartMonth(1);
        assertTrue(test.getValid());
    }

    @Test //Testing setter function setStartYear
    public void test5() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );
        test.setStartYear(1000);
        assertEquals(1000, test.getStartYear());
    }

    @Test //Testing setter function for null
    public void test6() throws Throwable{
        int startHour = 2;
        int startMinute = 1;
        int startDay = 1;
        int startMonth = 1;
        int startYear = 1;
        String setTitle = "It's one";
        String setDesc = "Lot of one's";

        Appt test = new Appt(
                startHour,
                startMinute,
                startDay,
                startMonth,
                startYear,
                setTitle,
                setDesc
        );

        //testing for null values
        test.setTitle(null);
        assertEquals("", test.getTitle());

        test.setDescription(null);
        assertEquals("", test.getDescription());
    }
}
