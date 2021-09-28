package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex29Test {
    @Test
    void calcYears() {
        ex29 app = new ex29();
        assertEquals( 18, ex29.calcYears(4));

    }
}