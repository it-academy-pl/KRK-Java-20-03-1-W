package pl.itacademy.junit;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void sum_returnsSumOfArguments() {
        Number result = Util.sum(1, 2, 3, 4);
        Number expected = 10.0;
        MatcherAssert.assertThat(result, equalTo(expected));
    }

    @Test
    public void max_returnsMaximumNumber() {
        Number max = Util.max(5, 6);
        assertEquals(6, max);
    }

    @Test
    public void max_withIntegerAndDouble_returnsMaximumNumber() {
        Number max = Util.max(5.5, 6);
        assertEquals(6, max);
    }

    @Test
    public void isPositive_positiveNumber_returnsTrue() {
        boolean result = Util.isPositive(1);
        assertTrue(result);
    }

    @Test
    public void isPositive_negativeNumber_returnsFalse() {
        boolean result = Util.isPositive(-1);
        assertFalse(result);
    }

    @Test
    public void multiply_withTwoInteger_multipliesTwoIntegers() {
        int result = Util.multiply(2, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void divide_whenDivideByZero_throwsArithmeticException_withMessageDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> Util.divide(10, 0));
        assertThat(exception.getMessage()).contains("Divide by zero");
    }

}