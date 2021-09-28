package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex28Test {
    @Test
    void calcSum() {
        ex28 app = new ex28();
        assertEquals( 1, ex28.calcSum(1));


    }
    @Test
            void calcSum1(){
        assertEquals( 2, ex28.calcSum(2));
    }

}