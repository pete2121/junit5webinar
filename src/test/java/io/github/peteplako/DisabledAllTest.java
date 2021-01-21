package io.github.peteplako;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


@Disabled("All tests in this class are skipped")
class DisabledAllTest {

    

    @Test
    void skippedTestOne() {
    	 System.out.println("This test is NOT executed");
    }

    @Test
    void skippedTestTwo() {
    	 System.out.println("This test is NOT executed");
    }

}
