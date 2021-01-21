package io.github.peteplako;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;


class RepetitionInfoInRepeatedTest {

    @RepeatedTest(5)
    void test(RepetitionInfo repetitionInfo) {
    	System.out.println("Repeated test " + repetitionInfo.getCurrentRepetition()+ " of " + repetitionInfo.getTotalRepetitions());
    }
}
