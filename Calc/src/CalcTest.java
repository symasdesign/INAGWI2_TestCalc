import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		// arrange
		Calc calc = new Calc();
		
		// act
		int res = calc.add(5 , 7);
		
		// assert
		Assert.assertEquals(12, res);
		
		// test
		
		// test2
	}

}
