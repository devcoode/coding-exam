package exam;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialCalculatorTest {

    FactorialCalculator sut = new FactorialCalculator();

    @Test
    public void n0() throws Exception {
        assertThat(sut.calc(0), is(1));
    }

    @Test
    public void n1() throws Exception {
        assertThat(sut.calc(1), is(1));
    }

    @Test
    public void n2() throws Exception {
        assertThat(sut.calc(2), is(2));
    }

    @Test
    public void n3() throws Exception {
        assertThat(sut.calc(3), is(6));
    }

    @Test
    public void n4() throws Exception {
        assertThat(sut.calc(4), is(24));
    }
}
