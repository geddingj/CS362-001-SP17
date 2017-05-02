package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.EmptyStackException;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

public class TestCalDay {
    @Test //testing default constructor
    public void test0() throws Throwable {
        try{
            CalDay test = new CalDay();
            assertFalse(test.isValid());

        }catch(Exception e){}
    }

    @Test //testing calendar
    public void test1() throws Throwable {
        try{
            GregorianCalendar temp = new GregorianCalendar(1,1,1);
            CalDay test = new CalDay(temp);

            assertEquals(1, test.year);
            assertEquals(1, test.month);
            assertEquals(1, test.day);

            assertEquals(1, test.getDay());
            assertEquals(1, test.getMonth());
            assertEquals(1, test.getYear());

        }catch(Exception e){}
    }

    @Test //testing addAppt
    public void test2() throws Throwable {
        try{
            GregorianCalendar temp = new GregorianCalendar(1,1,1);
            Appt temp1 = new Appt(1,1,1,1,1,"Yes","No");
            Appt temp2 = new Appt(1,1,1,1,1,"Yes","No");
            Appt rotten = new Appt(-1,-1,-1,-1,-1,"","");
            CalDay test = new CalDay(temp);
            StringBuilder sb = new StringBuilder();

            assertTrue(test.isValid());
            assertEquals(0, test.getSizeAppts());

            test.addAppt(temp1);
            assertNotEquals(0, test.getSizeAppts());
            test.addAppt(temp2);
            assertNotEquals(1, test.getSizeAppts());

            assertTrue(temp1.getValid());
            assertTrue(temp2.getValid());

            assertEquals(temp1, test.getAppts().getFirst());
            assertEquals(temp2, test.getAppts().getLast());
            assertTrue(test.isValid());

            if (test.isValid()) {
                String todayDate = (test.getMonth()) + "/" + test.getDay() + "/" + test.getYear();
                sb.append("\t --- " + todayDate + " --- \n");
                sb.append(" --- -------- Appointments ------------ --- \n");
                Iterator<Appt> itr = test.appts.iterator();
                while(itr.hasNext()) {
                    Object element = itr.next();

                    sb.append(element + " ");
                }
                sb.append("\n");
            }

            assertEquals(sb.toString(), test.toString());

            test.addAppt(rotten);
            assertEquals(2, test.getSizeAppts());

            CalDay newTest = new CalDay(temp);
            newTest.addAppt(rotten);

            assertFalse(rotten.getValid());

            test.appts = null;
            test.valid = false;
            assertNull(test.iterator());

            test.valid = false;
            assertEquals("", test.toString());

        }catch(Exception e){}
    }

    @Test //testing iterator
    public void test3() throws Throwable {
        try{
            GregorianCalendar temp = new GregorianCalendar(1,1,1);
            Appt temp1 = new Appt(1,1,1,1,1,"Yes","No");
            Appt temp2 = new Appt(1,1,1,1,1,"Yes","No");
            Appt temp3 = new Appt(2,2,2,2,2,"","");
            Appt temp4 = new Appt(3,3,3,3,3,"","");
            CalDay test = new CalDay();
            CalDay throwaway = new CalDay();

            test.addAppt(temp1);
            test.addAppt(temp3);
            test.addAppt(temp4);

            Iterator<?> tempTest = test.iterator();

            assertEquals(temp1, tempTest.next());
            assertEquals(temp3, tempTest.next());
            assertEquals(temp4, tempTest.next());
            assertNull(throwaway);

            test.valid = true;
            test.getAppts().iterator();

            Appt rotten = new Appt(-1,-1,-1,-1,-1,"","");
            throwaway.addAppt(rotten);
            assertFalse(rotten.getValid());

            tempTest = throwaway.iterator();
            assertNull(tempTest);

            test.valid = true;

        }catch(Exception e){}
    }

    @Test //testing set appts
    public void test4() throws Throwable {
        try{
            GregorianCalendar temp = new GregorianCalendar(1,1,1);
            Appt temp1 = new Appt(1,1,1,1,1,"Yes","No");
            Appt temp2 = new Appt(1,1,1,1,1,"Yes","No");
            Appt rotten = new Appt(-1,-1,-1,-1,-1,"","");
            CalDay test = new CalDay();

            assertEquals(0, test.getSizeAppts());

            test.addAppt(temp1);
            test.addAppt(temp2);
            test.addAppt(rotten);

            assertEquals(2, test.getSizeAppts());

        }catch(Exception e){}
    }
}
