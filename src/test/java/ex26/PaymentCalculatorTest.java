package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator app = new PaymentCalculator();
        assertEquals( 70, PaymentCalculator.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}