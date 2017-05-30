package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setStartHour", "setStartMinute", "setStartDay", "setStartMonth", "setStartYear", "setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=13;
				 int startMinute=30;
				 int startDay=10;
				 int startMonth=4;
				 int startYear=2017;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);

					if(methodName.equals("setStartHour")){
						Integer newVal = ValuesGenerator.getRandomIntBetween(random, -10, 30);
						appt.setStartHour(newVal);
					}

					if(methodName.equals("setStartMinute")){
						Integer newVal = ValuesGenerator.getRandomIntBetween(random, -10, 90);
						appt.setStartMinute(newVal);

						newVal = ValuesGenerator.getRandomIntBetween(random, -30, 120);
						appt.setStartMinute(newVal);
					}

					if(methodName.equals("setStartDay")){
						Integer newVal = ValuesGenerator.getRandomIntBetween(random, -10, 50);
						appt.setStartDay(newVal);
					}

					if(methodName.equals("setStartMonth")){
						Integer newVal = ValuesGenerator.getRandomIntBetween(random, -10, 20);
						appt.setStartMonth(newVal);
					}

					if(methodName.equals("setStartYear")){
						Integer newVal = ValuesGenerator.getRandomIntBetween(random, -10, 20);
						appt.setStartYear(newVal);
					}

					if (methodName.equals("setTitle")){
						String newTitle=(String) ValuesGenerator.getString(random);
						appt.setTitle(newTitle);
					}

					if (methodName.equals("setDescription")){
						String newDesc = (String) ValuesGenerator.getString(random);
						appt.setDescription(newDesc);

						String newVal = (String) ValuesGenerator.getString(random);
						appt.setDescription(newVal);
					}
					
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
	 
	 
		 System.out.println("Done testing...");
	 }


	
}
