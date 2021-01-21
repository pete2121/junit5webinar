package io.github.peteplako;

import org.junit.jupiter.api.RepeatedTest;

class SimpleRepeatedTest {

  

    @RepeatedTest(5)
    void test() {
    	System.out.println("Repeated");
    }

}
