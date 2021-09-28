package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex27Test {
    @Test
    void validateInput() {
        ex27 app = new ex27();
        assertEquals( 1, ex27.validateInput("John", "Johnson", "55555", "TK-4321"));
    }
}