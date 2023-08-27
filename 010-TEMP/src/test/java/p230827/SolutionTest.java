package p230827;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    // momentAntFall(n, left, right) = expectedRounds

    //======================================================================
    @Test
    void momentAntFall_imageExample1() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(4, 1, 3));
    }

    @Test
    void momentAntFall_imageExample2() {
        Assertions.assertEquals(3, new Solution()
                .momentAntFall(4, 4, 1));
    }

    @Test
    void momentAntFall_imageExample3() {
        Assertions.assertEquals(1, new Solution()
                .momentAntFall(4, 4, 3));
    }

    @Test
    void momentAntFall_imageExample4() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(3, 3, 1));
    }

    //======================================================================
    // left < right
    @Test
    void momentAntFall_leftLessRight_1() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 8, 9));
    }

    //======================================================================
    // left > right
    @Test
    void momentAntFall_leftGreatRight_1() {
        Assertions.assertEquals(1, new Solution()
                .momentAntFall(10, 10, 9));
    }
    @Test
    void momentAntFall_leftGreatRight_2() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 10, 8));
    }
    @Test
    void momentAntFall_leftGreatRight_3() {
        Assertions.assertEquals(3, new Solution()
                .momentAntFall(3, 3, 0));
    }
    @Test
    void momentAntFall_leftGreatRight_4() {
        Assertions.assertEquals(1, new Solution()
                .momentAntFall(3, 1, 0));
    }
    @Test
    void momentAntFall_leftGreatRight_5() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(3, 2, 0));
    }





}