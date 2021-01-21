package io.github.peteplako;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("This is a Test Scenario")
class DisplayNameTest {

    @Test
    @DisplayName("This is the First Test Case")
    void testWithDisplayNameContainingSpaces() {
        // TODO
    }

    @Test
    @DisplayName("This is the second Test Case!")
    void testWithDisplayNameContainingSpecialCharacters() {
        // TODO
    }

    @Test
    @DisplayName("This is the third test case #")
    void testWithDisplayNameContainingSpecialCharactersToo() {
        // TODO
    }

}