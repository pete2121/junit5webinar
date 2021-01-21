package io.github.peteplako;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class OrderedTest {

   
    @Test
    @Order(2)
    void testStep1() {
    	System.out.println("Test 1");
    }

    @Test
    @Order(1)
    void testStep2() {
    	System.out.println("Test 2");
    }

}
