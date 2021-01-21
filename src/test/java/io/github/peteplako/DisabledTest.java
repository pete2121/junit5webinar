package io.github.peteplako;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledTest {

	@Test
	void test() {
		System.out.println("This test is executed");
	}

	@Disabled
	@Test
	void skippedTest() {
		System.out.println("This test is NOT executed");
	}

}
