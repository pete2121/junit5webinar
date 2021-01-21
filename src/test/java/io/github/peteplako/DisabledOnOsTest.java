package io.github.peteplako;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;


class DisabledOnOsTest {


    @DisabledOnOs(LINUX)
    @Test
    void notLinuxTest() {
    	System.out.println("Disabled on Linux");
    }

    @DisabledOnOs(WINDOWS)
    @Test
    void notWinTest() {
    	System.out.println("Disabled on Windows");
    }

    @DisabledOnOs(MAC)
    @Test
    void notMacTest() {
    	System.out.println("Disabled on Mac");
    }

}
