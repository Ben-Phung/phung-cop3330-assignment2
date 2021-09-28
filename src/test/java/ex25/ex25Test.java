package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex25Test {
    @Test
    void passwordValidator() {
        ex25 app = new ex25();
        assertEquals( 1, ex25.passwordValidator("12345"));

    }
    @Test
    void passwordValidator1() {
        ex25 app = new ex25();
        assertEquals( 2, ex25.passwordValidator("abcdef"));

    }
    @Test
    void passwordValidator2() {
        ex25 app = new ex25();
        assertEquals( 3, ex25.passwordValidator("abc123xyz"));

    }
    @Test
    void passwordValidator3() {
        ex25 app = new ex25();
        assertEquals( 4, ex25.passwordValidator("1337h@xor!"));

    }
}
