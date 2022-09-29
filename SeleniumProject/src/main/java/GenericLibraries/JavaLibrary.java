package GenericLibraries;

import java.util.Random;

/**
 * This class will contain generic methods related to Java
 * @author Shilpa
 *
 */
public class JavaLibrary {
	/**
	 * This method will return the random number for every execution
	 * @return
	 */
public int getRandomNumber()
{
	Random ran= new Random();
	return ran.nextInt(500);
}

}
