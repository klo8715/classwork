/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *
 */
public class ProceduralExample {
	public static void main (String[]args)
	{
		String[] names= { "Jillian","Jordan","Jason"};
		String[] years= { "senior","freshmen","junior"};
		System.out.println("My name is "+ names[0] + " and I am a " + years[0] + ".");
		System.out.println("My name is "+ names[1] + " and I am a " + years[1] + ".");
		System.out.println("My name is "+ names[2] + " and I am a " + years[2] + ".");
	}
	public static int pickCard()
	{
		double rand = Math.random(); //between 0 and 1
		int roll = (int)(6*rand); // 0 to 5
		return roll +1;
	}
}
