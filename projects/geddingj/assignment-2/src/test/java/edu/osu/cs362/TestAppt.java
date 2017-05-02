package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.EmptyStackException;


public class TestAppt {

    @Test //Testing constructor for simple valid input
    public void test0() throws Throwable {
    	try{
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

    	}catch(Exception e){}
    }

    @Test //Testing setter function setStartHour
    public void test1() throws Throwable{
        try{
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
        }catch(Exception e){}
    }

    @Test //Testing setter function setStartMinute
    public void test2() throws Throwable{
        try{
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
        }catch(Exception e){}
    }

    @Test //Testing setter function setStartDay
    public void test3() throws Throwable{
        try{
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
        }catch(Exception e){}
    }

    @Test //Testing setter function setStartMonth
    public void test4() throws Throwable{
        try{
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
        }catch(Exception e){}
    }

    @Test //Testing setter function setStartYear
    public void test5() throws Throwable{
        try{
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
        }catch(Exception e){}
    }

    @Test //Testing setter function for null
    public void test6() throws Throwable{
        try{
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
        }catch(Exception e){}
    }
}