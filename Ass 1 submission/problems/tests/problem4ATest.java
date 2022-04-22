import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class problem4ATest {

    @Test
    void weightIsEven1() {

        problem4A solver = new problem4A();
        assertEquals(true,solver.checkweight(4));

    }
    @Test
    void weightIsEven2() {

        problem4A solver = new problem4A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkweight(10000);
        });
    }
    @Test
    void weightIsEven3() {

        problem4A solver = new problem4A();
        assertEquals(true,solver.checkweight(50));

    }
    @Test
    void weightIsTwo() {

        problem4A solver = new problem4A();
        assertEquals(false,solver.checkweight(2));

    }
    @Test
    void weightIsOdd1() {

        problem4A solver = new problem4A();
        assertEquals(false,solver.checkweight(3));

    }
    @Test
    void weightIsOdd2() {
        problem4A solver = new problem4A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkweight(2341);
        });

    }
    @Test
    void weightIsOdd3() {

        problem4A solver = new problem4A();
        assertEquals(false,solver.checkweight(1));

    }
    @Test
    void weightIsNegative() {

        problem4A solver = new problem4A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkweight(-5);
        });

    }



    @Test
    void weightIsZero() {

        problem4A solver = new problem4A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkweight(0);
        });

    }



    @Test
    void weightIshundredandone() {

        problem4A solver = new problem4A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkweight(101);
        });

        }

}
