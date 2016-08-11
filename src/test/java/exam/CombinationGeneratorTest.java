package exam;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

public class CombinationGeneratorTest {

    CombinationGenerator sut = new CombinationGenerator();

    @Test
    public void one() throws Exception {
        final List<String> actual = sut.calc(Collections.singletonList('a'));

        assertThat(actual, contains("a"));
    }

    @Test
    public void two() throws Exception {
        final List<String> actual = sut.calc(Arrays.asList('a', 'b'));

        assertThat(actual, contains("aa", "ab", "ba", "bb"));
    }

    @Test
    public void three() throws Exception {
        final List<String> actual = sut.calc(Arrays.asList('a', 'b', 'c'));

        assertThat(actual, contains("aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc",
                                    "baa", "bab", "bac", "bba", "bbb", "bbc", "bca", "bcb", "bcc",
                                    "caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc"));
    }
}
