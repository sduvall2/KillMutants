import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Killer {

	static Mutant mutant;

	@BeforeClass
	public static void getMutant(){
		mutant = MutantMaker.getMutant();
	}
	
	@Test
	public void testFirstExample() {
		String[] words = {"a", "at", "and"};
		assertEquals("and", mutant.thirdShortest(words));
	}


}
