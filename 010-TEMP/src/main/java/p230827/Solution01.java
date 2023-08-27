package p230827;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Solution01 {

    public static void main(String[] args) {

        Solution01 s = new Solution01();

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println("example.image");
        System.out.println(s.momentAntFall(4, 1, 3)); // 2
        System.out.println(s.momentAntFall(4, 4, 1)); // 3
        System.out.println(s.momentAntFall(4, 4, 3)); // 1
        System.out.println(s.momentAntFall(3, 3, 1)); // 2

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println("left < right");
        System.out.println(s.momentAntFall(10, 8, 9)); // 2

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println("left > right");
        System.out.println(s.momentAntFall(10, 10, 9)); // 1
        System.out.println(s.momentAntFall(10, 10, 8)); // 2
        System.out.println(s.momentAntFall(3, 3, 0)); // 3
        System.out.println("–––");
        System.out.println(s.momentAntFall(3, 1, 0)); // 1
        System.out.println(s.momentAntFall(3, 2, 0)); // 2


        System.out.println("––––––––––––––––––––––––––––––");
    }


    public int momentAntFall(int n, int left, int right) {
        if (left < right) {
            return min(n - left, n - right) + 1;
        }
        return abs(left - right);
    }

}
