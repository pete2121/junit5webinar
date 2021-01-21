package io.github.peteplako;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AssumptionsTest {

	MyApp myApp;

    @BeforeEach
    void setup() {
    	myApp = new MyApp("[Test with assumptions]");
    }

    @Test
    void assumeTrueTest() {
        assumeTrue(myApp.getId() != null);
        System.out.println("This test is skipped");
    }

    @Test
    void assumeFalseTest() {
        assumeFalse(myApp.getId() != null);
        System.out.println("This test is executed");
    }

}
