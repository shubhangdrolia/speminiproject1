import org.junit.*;

import static org.junit.Assert.*;



public class calculatorTest {
    private static final double DELTA = 1e-15;
    calculator calc = new calculator();

    @Test
    public void addTruepositive() {
        assertEquals( 4, calc.add(2,2), DELTA);
        assertEquals(10, calc.add(4,6), DELTA);
    }

    @Test
    public void addFalsepositive() {
        assertNotEquals(3, calc.add(2,2), DELTA);
        assertNotEquals(9, calc.add(4,6), DELTA);
    }

    @Test
    public void subTruepositive() {
        assertEquals(10, calc.sub(12,2), DELTA);
        assertEquals(8, calc.sub(14,6), DELTA);
    }
    @Test
    public void subFalsepositive() {
        assertNotEquals(3, calc.sub(6,2), DELTA);
        assertNotEquals(9, calc.sub(9,6), DELTA);
    }

    @Test
    public void mulTruepositive() {
        assertEquals(24, calc.mul(12,2), DELTA);
        assertEquals(84, calc.mul(14,6), DELTA);
    }
    @Test
    public void mulFalsepositive() {
        assertNotEquals(23, calc.mul(6,2), DELTA);
        assertNotEquals(79, calc.mul(9,6), DELTA);
    }

    @Test
    public void divTruepositive() {
        assertEquals(6, calc.div(12,2), DELTA);
        assertEquals(2, calc.div(12,6), DELTA);
    }
    @Test
    public void divFalsepositive() {
        assertNotEquals(23, calc.div(6,2), DELTA);
        assertNotEquals(79, calc.div(24,6), DELTA);
    }

    @Test
    public void factTruepositive() {
        assertEquals(720, calc.fact(6), DELTA);
        assertEquals(6, calc.fact(3), DELTA);
    }
    @Test
    public void factFalsepositive() {
        assertNotEquals(24, calc.fact(6), DELTA);
        assertNotEquals(120, calc.fact(7), DELTA);
    }

    @Test
    public void squTruepositive() {
        assertEquals(144, calc.squ(12), DELTA);
        assertEquals(225, calc.squ(15), DELTA);
    }
    @Test
    public void squFalsepositive() {
        assertNotEquals(23, calc.squ(6), DELTA);
        assertNotEquals(79, calc.squ(10), DELTA);
    }

    @Test
    public void squarerootTruepositive() {
        assertEquals(4, calc.squareroot(16), DELTA);
        assertEquals(5, calc.squareroot(25), DELTA);
    }
    @Test
    public void squarerootFalsepositive() {
        assertNotEquals(5, calc.squareroot(36), DELTA);
        assertNotEquals(9, calc.squareroot(100), DELTA);
    }

    @Test
    public void powerTruepositive() {
        assertEquals(216, calc.power(6,3), DELTA);
        assertEquals(144, calc.power(12,2), DELTA);
    }
    @Test
    public void powerFalsepositive() {
        assertNotEquals(23, calc.div(6,2), DELTA);
        assertNotEquals(79, calc.div(3,5), DELTA);
    }

    @Test
    public void logarithmTruepositive() {
        assertEquals(0, calc.logarithm(1), DELTA);
    }
    @Test
    public void logarithmFalsepositive() {
        assertNotEquals(23, calc.logarithm(6), DELTA);
        assertNotEquals(79, calc.logarithm(24), DELTA);
    }
}