import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest {

    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Steve", "Bradley", "Mr.", 1960, 19.50);
        w2 = new Worker ("000002", "Wendy", "Bradley", "Ms.", 1975, 10.50);
        w3 = new Worker ("000003", "Liam", "Miller", "Mr.", 1998, 31.75);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(195.0, w1.calculateWeeklyPay(10.0));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("780.00", w1.displayWeeklyPay(40));
    }
}