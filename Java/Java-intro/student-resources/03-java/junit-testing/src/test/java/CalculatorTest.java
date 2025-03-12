import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void add_ValidInput_CorrectAnswer(){
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}