package io.github.peteplako;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("non-functional")
class TaggingFiltering {


    @Test
    @Tag("performance")
    @Tag("load")
    void testOne() {
    	 System.out.println("RUN Non-Functional Test 1 (Performance/Load)");
    }

    @Test
    @Tag("performance")
    @Tag("stress")
    void testTwo() {
    	 System.out.println("RUN Non-Functional Test 2 (Performance/Stress)");
    }

    @Test
    @Tag("security")
    void testThree() {
    	 System.out.println("RUN Non-Functional Test 3 (Security)");
    }

}
