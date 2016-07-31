package exam;

public class FactorialCalculator {

    public int calc(final int n) {
        return n == 0 ? 1 : n * calc(n - 1);
    }
}
