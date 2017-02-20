package die;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Dice {

	public static int rollDie(int numberSidedDie, int minRoll, int maxRoll, int numberOfRolls, int takeBest) throws InterruptedException
	{
		Random randomNumber = new Random(System.currentTimeMillis());
		int dieRollTotal = 0;
		if (takeBest > numberOfRolls)
			takeBest = numberOfRolls;
		
		Integer[] rollArray = new Integer[numberOfRolls];
		
		for (int i = 0; i < numberOfRolls; i++)
		{
			
			int dieRoll = randomNumber.nextInt(numberSidedDie) + 1;
		
			if (dieRoll < minRoll)
			{
				dieRoll = minRoll;
			}
			else if (dieRoll > maxRoll)
			{
				dieRoll = maxRoll;
			}
			
			//System.out.println("The dice roll is:  " + dieRoll);
			rollArray[i] = dieRoll;			
			Thread.sleep(25);
		}
		
		Arrays.sort(rollArray, Collections.reverseOrder());
		
		for (int i = 0; i < takeBest; i++)
		{
			dieRollTotal += rollArray[i];
			
		}
		
		
		return dieRollTotal;
		
	}

	
}
