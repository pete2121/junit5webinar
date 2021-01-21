
package io.github.peteplako;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.MethodName.class)
class NameOrderedTest {


    @Test
    void btestStep() {
    	System.out.println("test b");
    }

    @Test
    void atestStep() {
    	System.out.println("test a");
    }

}
