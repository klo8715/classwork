/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *This class is to design the ProceduralExample. It embodies an Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior ("Jillian","programmer");
		Student jordan = new Student ("Jordan");
		Student jason = new Student ("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();

	}

}
