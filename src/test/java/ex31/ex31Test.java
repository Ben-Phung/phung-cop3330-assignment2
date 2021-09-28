package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex31Test {
    @Test
    void passwordValidator() {
        ex31 app = new ex31();
        assertEquals( 138, ex31.calcRate(22, 65, 55));
    }
}