package exam;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StackQueueTest {

    StackQueue<Integer> sut = new StackQueue<>();

    @Test
    public void test() throws Exception {
        sut.put(1);
        sut.put(2);
        sut.put(3);

        assertThat(sut.get(), is(1));
        assertThat(sut.get(), is(2));

        sut.put(4);

        assertThat(sut.get(), is(3));
        assertThat(sut.get(), is(4));
        assertThat(sut.get(), is(nullValue()));
    }
}
