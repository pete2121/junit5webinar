package io.github.peteplako;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

@Execution(CONCURRENT)
class ParallelExecutionTest {

	@Test
	void test01() {
		System.out.println("test01");
	}

	@Test
	void test02() {
		System.out.println("test02");
	}

	@Test
	void test03() {
		System.out.println("test03");
	}

}
