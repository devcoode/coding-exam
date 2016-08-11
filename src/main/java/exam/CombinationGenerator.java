package exam;

import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator {

    public List<String> calc(final List<Character> chars) {
        final int len = chars.size();
        final int patterns = (int) Math.pow(len, len);

        final List<String> results = new ArrayList<>(patterns);

        for (int i = 0; i < patterns; i++) {
            results.add(numToString(i, chars));
        }

        return results;
    }

    private static String numToString(final int num, final List<Character> chars) {
        final int radix = chars.size();

        final StringBuilder sb = new StringBuilder(radix);
        final char filler = chars.get(0);

        int val = num;
        while (val > 0) {
            final int mod = val % radix;
            sb.insert(0, chars.get(mod));
            val = val / radix;
        }

        return fill(sb, filler, radix);
    }

    private static String fill(final StringBuilder sb, final char filler, final int expectedLength) {
        final int needToFill = expectedLength - sb.length();

        for (int i = 0; i < needToFill; i++) {
            sb.insert(0, filler);
        }

        return sb.toString();
    }
}
