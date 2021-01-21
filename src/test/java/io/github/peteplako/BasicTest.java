package io.github.peteplako;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BasicTest {


    MyApp myApp;

    @BeforeEach
    void setup() {
    	myApp = new MyApp("[Basic test]");
    	myApp.initId();
    }

    @Test
    void sumTest() {
        // exercise
        int sum = myApp.sum(1, 2, 3);
        // verify
        Assertions.assertTrue(sum == 3, "Assertion for the SUM");
    }

    @AfterEach
    void teardown() {
    	myApp.close();
    }

}
