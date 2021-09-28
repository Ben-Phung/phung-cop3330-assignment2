package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24Test {

    @Test
    void isAnagram() {
        ex24 app = new ex24();
        assertEquals(true, ex24.isAnagram("tone", "note"));
        assertEquals(false, ex24.isAnagram("boat", "note"));
    }
}