package exam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FibonacciCalculatorTest {

    FibonacciCalculator sut = new FibonacciCalculator();

    // F(0) = 0
    @Test
    public void n0() throws Exception {
        assertThat(sut.calc(0), is(0));
    }

    // F(1) = 1
    @Test
    public void n1() throws Exception {
        assertThat(sut.calc(1), is(1));
    }

    // F(n + 2) = F(n) + F(n+1) (n ≧ 0)
    @Test
    public void n10() throws Exception {
        assertThat(sut.calc(10), is(55));
    }
}
