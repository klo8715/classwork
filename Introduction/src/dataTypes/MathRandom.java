package dataTypes;

import java.util.Random;

public class MathRandom 
{

	public static void main(String[] args) 
	{
		int[] results = new int[6];
		// same class
		// int[] results = {0,0,0,0,0,0};
		int totalRolls = 10000;
		for (int index = 0; index<totalRolls; index++)
		{
			int roll = rollFairDie();
			System.out.println("Roll #" + (index+1)+ "Die is " + rollUnFairDie());
			results[roll-1]++;
		}
		for (int i=0; i<6; i++)
		{
			int percentage = (int) (100*((double)results[i]/totalRolls));
			System.out.println((i+1)+ " was rolled " + percentage +"%.");
	
		}
	}
	
	public static int rollFairDie()
	{
		double rand = Math.random(); //between 0 and 1
		int roll = (int)(6*rand); // 0 to 5
		return roll +1; // 1 to 6
//		Random gen = new Random();
//		return gen.nextInt(6)+1;
//		Random gen = new Random();
//		return gen.nextInt(6);
	}
	public static int rollUnFairDie()
	{
//		Random gen = new Random();
//		return gen.nextInt(6)+1;
		double rand = Math.random(); //between 0 and 1
		int unfairRoll = (int)(6*rand)+1;
		if (unfairRoll == 2 || unfairRoll == 4)
		{
			unfairRoll = unfairRoll+2;
		}
		else
		{
			unfairRoll = unfairRoll ++;
		}
		return unfairRoll;
	}
}
