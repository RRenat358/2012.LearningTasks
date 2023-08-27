package p230827;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Solution {

    public int momentAntFall(int n, int left, int right) {
        if (left < right) {
            return min(n - left, n - right) + 1;
        }
        return abs(left - right);
    }

}
