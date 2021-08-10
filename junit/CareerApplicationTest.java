import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Darren, 31 Jul 2021 11:15:04 am
 */

/**
 * @author Darren
 *
 */
public class CareerApplicationTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ArrayList<Career_Information> careerList = new ArrayList<Career_Information>();
		Career_Information careerInfo = new Career_Information(1, "JH");
		careerList.add(careerInfo);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
