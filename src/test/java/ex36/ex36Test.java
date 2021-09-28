package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ex36Test {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    @Test
    void average() {
        ex36 app = new ex36();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals( 400.0, ex36.average(numbers));
    }
    @Test
    void max() {
        ex36 app = new ex36();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals( 1000, ex36.max(numbers));
    }
    @Test
    void min() {
        ex36 app = new ex36();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);
        assertEquals( 100, ex36.min(numbers));
    }

}