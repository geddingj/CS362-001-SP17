package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

public class TestTimeTable {
    @Test //testing timetable
    public void test0() throws Throwable {
        try{
            //Construct Functions
            TimeTable test = new TimeTable();
            GregorianCalendar greg = new GregorianCalendar(1,1,1);
            GregorianCalendar orian = new GregorianCalendar(2, 2, 2);
            Appt temp1 = new Appt(1,1,1,1,1,"ya","nah");
            Appt temp2 = new Appt(2,2,2,2,2,"ya","nah");
            LinkedList<Appt> lin = new LinkedList<Appt>();

            //Attempt adding to a LinkedList
            lin.add(temp1);
            lin.add(temp2);

            //Create a new linked list for CalDay to determine difference
            LinkedList<CalDay> cal = new LinkedList<CalDay>();
            cal = test.getApptRange(lin, greg, orian);

            //Assert that the given Appts are valid
            assertTrue(temp1.getValid());
            assertTrue(temp2.getValid());

            //Assert the difference between Appts is correct
            assertEquals(394, cal.size());

            //Assert that temp1 and temp2 are the first and second/last values
            assertEquals(temp1, lin.getFirst());
            assertEquals(temp2, lin.getLast());

        }catch(Exception e){}
    }

    @Test //test for testing -- most test cases that were performed here have been moved
    public void test1() throws Throwable {
        try{
            //Construct functions
            TimeTable test = new TimeTable();
            GregorianCalendar greg = new GregorianCalendar(2,2,2);
            GregorianCalendar orian = new GregorianCalendar(1, 1, 1);
            Appt temp1 = new Appt(1,1,1,1,1,"ya","nah");
            Appt temp2 = new Appt(2,2,2,2,2,"ya","nah");
            LinkedList<Appt> lin = new LinkedList<Appt>();

            lin.add(temp1);
            lin.add(temp2);

            LinkedList<CalDay> cal = new LinkedList<CalDay>();
            cal = test.getApptRange(lin, greg, orian);
        }catch(Exception e){}
    }

    @Test //testing removal
    public void test2() throws Throwable {
        try{
            //Constructing functions
            TimeTable test = new TimeTable();
            Appt temp1 = new Appt(1,1,1,1,1,"ya","nah");
            Appt temp2 = new Appt(25,1,1,1,1,"ya","nah");
            LinkedList<Appt> lin = new LinkedList<Appt>();

            //Ensure that temp1 is valid and temp2 is not
            assertTrue(temp1.getValid());
            assertFalse(temp2.getValid());

            //Test deleting a bad domain
            test.deleteAppt(null, temp1);

            //Ensure correct addition to LinkedList
            lin.add(temp1);
            assertEquals(temp1, lin.getFirst());

            //Test deleting previous value, a non-existent bad value, a previously deleted value, and a non-existent value.
            test.deleteAppt(lin, temp1);
            test.deleteAppt(lin, temp2);
            test.deleteAppt(lin, temp1);
            test.deleteAppt(lin, null);


        }catch(Exception e){}
    }
}
