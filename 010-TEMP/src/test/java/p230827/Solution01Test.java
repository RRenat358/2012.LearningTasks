package p230827;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution01Test {

    // momentAntFall(n, left, right) = expectedRounds

    @Test
    void momentAntFall_imageExample1() {
        Assertions.assertEquals(2, new Solution01()
                .momentAntFall(4, 1, 3));
    }

    @Test
    void momentAntFall_imageExample2() {
        Assertions.assertEquals(3, new Solution01()
                .momentAntFall(4, 4, 1));
    }

    @Test
    void momentAntFall_imageExample3() {
        Assertions.assertEquals(1, new Solution01()
                .momentAntFall(4, 4, 3));
    }

    @Test
    void momentAntFall_imageExample4() {
        Assertions.assertEquals(2, new Solution01()
                .momentAntFall(3, 3, 1));
    }






}