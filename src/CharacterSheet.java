import java.util.Scanner;

import die.Dice;

public class CharacterSheet {

	public static void main(String[] args) throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many sided die do you want to roll?  ");
		int sidedDie = scanner.nextInt();
		System.out.println("What is the minimum roll number?  ");
		int minRoll = scanner.nextInt();
		System.out.println("How many times do you want to roll?  ");
		int numberOfRolls = scanner.nextInt();
		System.out.println("Take best?");
		int takeBest = scanner.nextInt();
		System.out.println("How many times do you want to do this?");
		int numberOfIterations = scanner.nextInt();
		int[] characterStats = new int[6];

		for (int i = 0; i < numberOfIterations; i++)
		{
			characterStats[i] = Dice.rollDie(sidedDie, minRoll, sidedDie, numberOfRolls, takeBest);	
		}

		int count = 1;
		
		for (int element : characterStats)
		{
			System.out.println("Stat " + count + " is " + element);
			count++;
		}


		scanner.close();
	}
}
