package uk.ac.qub.eeecs.dave;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		assert 1==2;
	}

	private void assertEquals(int add, int i) {
	}

	////
	////
	@Test
	void testSub() {
		Calculator c = new Calculator();
		assertEquals(c.sub(10,1), 9);
	}
}
