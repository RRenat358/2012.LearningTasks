package p230827;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Solution {

    public int momentAntFall(int n, int left, int right) {

        if (left < right) {
            return min(left, n - right) + 1;
        }


        if (left > right) {

//            left = n - left + (left - right);
//            right = right + (left - right);

//            left = n - left + (left - right);
//            right = right + (left - right);

            return min(n - left, right) + (left - right);
        }


        return 0;


    }




}
