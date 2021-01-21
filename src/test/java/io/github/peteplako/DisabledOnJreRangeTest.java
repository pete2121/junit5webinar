package io.github.peteplako;

import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_9;
import static org.junit.jupiter.api.condition.JRE.JAVA_10;
import static org.junit.jupiter.api.condition.JRE.JAVA_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;

class DisabledOnJreRangeTest {

	@Test
	@EnabledOnJre(JAVA_8)
	void onlyOnJava8() {
		System.out.println("This test is executed only for JRE 8");
	}

	@Test
	@EnabledOnJre({ JAVA_9, JAVA_10 })
	void onJava9Or10() {
		System.out.println("This test is executed only for JRE 9 OR 10 ");
	}

	@Test
	@EnabledForJreRange(min = JAVA_9, max = JAVA_11)
	void fromJava9to11() {
		System.out.println("This test is executed only for JRE 9 TO 11");
	}

	@Test
	@DisabledOnJre(JAVA_9)
	void notOnJava9() {
		System.out.println("This test is executed only for JRE != 9");
	}

	@Test
	@DisabledForJreRange(min = JAVA_9, max = JAVA_11)
	void notFromJava9to11() {
		System.out.println("This test is executed only for JRE != 9 to 11");
	}

}
