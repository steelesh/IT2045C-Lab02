import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("000001", "Eleanor", "Williams", "Mrs.", 1997, 20.50, 41860);
        sw2 = new SalaryWorker("000002", "Anna", "Jones", "Ms.", 2004, 30, 52000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, sw2.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("805.00", sw1.displayWeeklyPay(50));
    }
}