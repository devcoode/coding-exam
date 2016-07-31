package exam;

public class FibonacciCalculator {

    public int calc(final int n) {
        return (n == 0 || n == 1) ? n : calc(n - 2) + calc(n - 1);
    }
}
