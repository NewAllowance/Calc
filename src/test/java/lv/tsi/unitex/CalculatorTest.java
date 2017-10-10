package lv.tsi.unitex;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3, 1), 0.0001);
        assertEquals(40, calc.add(35, 5), 0.0001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(6, calc.sub(8, 2), 0.0001);
        assertEquals(20, calc.sub(50, 30), 0.0001);

    }

    @Test
    public void mul() throws Exception {
        assertEquals(81, calc.mul(9, 9), 0.0001);
        assertEquals(27, calc.mul(3, 9), 0.0001);
    }

    @Test
    public void div() throws Exception {
        assertEquals(5, calc.div(15, 3), 0.0001);
        assertEquals(10, calc.div(100, 10), 0.0001);
    }

    //@Test (expected = ArithmeticException.class) //3. matematicheskaja proverka, togda ne budet oshibki. class - prosto peredaetsja klass
    public void divByZero() throws Exception {
    assertEquals(Double.POSITIVE_INFINITY, calc.div(5, 0), 0.001);
//    public void divByZero() throws Exception { //1.sozdan novyj klass
//        calc.div(5, 0); //2. vydast oshibku
    }

}