import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class problem69ATest {

    @Test
    void test1() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertEquals(true,solver.checkVectors(2));

    }
    @Test
    void test2() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertEquals(false,solver.checkVectors(3));

    }
    @Test
    void test3() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertEquals(true,solver.checkVectors(3));

    }
    @Test
    void test4() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertEquals(false,solver.checkVectors(3));

    }
    @Test
    void test5() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertEquals(false,solver.checkVectors(1));

    }

    @Test
    void test7() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkVectors(0);
        });

    }
    @Test
    void test8() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkVectors(-4);
        });

    }

    @Test
    void test9() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkVectors(101);
        });

    }
    @Test
    void test10() throws FileNotFoundException {
        problem69A solver = new problem69A();
        assertThrows(IllegalArgumentException.class , () -> {
            solver.checkVectors(1);
        });

    }

}