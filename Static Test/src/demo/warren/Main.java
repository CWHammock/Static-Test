/**
 * 
 */
package demo.warren;

/**
 * @author charles
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticTest test1 = new StaticTest("Test1");
		System.out.println(test1.getNumInstances());
		StaticTest test2 = new StaticTest("Test2");
		System.out.println(test2.getNumInstances());

	}

}
