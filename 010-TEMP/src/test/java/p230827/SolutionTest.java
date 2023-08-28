package p230827;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    // momentAntFall(n, left, right) = expectedRounds

    //   ←   →
    // □ ■ □ ■ □ □ □ □ □ □ □
    // 0 ◀ 2 ▶ 4 5 6 7 8 9 10
    // 0 1 2 3 4 5 6 7 8 9 10

    //======================================================================

    @DisplayName(" 0 ◀ 2 ▶ 4 ")
    @Test
    void momentAntFall_imageExample1() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(4, 1, 3));
    }

    @DisplayName(" 0 ▶ 2 3 ◀ ")
    @Test
    void momentAntFall_imageExample2() {
        Assertions.assertEquals(3, new Solution()
                .momentAntFall(4, 4, 1));
    }

    @DisplayName(" 0 1 2 ▶ ◀ ")
    @Test
    void momentAntFall_imageExample3() {
        Assertions.assertEquals(1, new Solution()
                .momentAntFall(4, 4, 3));
    }

    @DisplayName(" 0 ▶ 2 ◀ ")
    @Test
    void momentAntFall_imageExample4() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(3, 3, 1));
    }

    //======================================================================
    // left < right

    @DisplayName(" 0 ◀ ▶ 3 4 5 6 7 8 9 10 ")
    @Test
    void momentAntFall_leftLessRight_12() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 1, 2));
    }

    @DisplayName(" 0 1 2 3 4 ◀ ▶ 7 8 9 10 ")
    @Test
    void momentAntFall_leftLessRight_56() {
        Assertions.assertEquals(5, new Solution()
                .momentAntFall(10, 5, 6));
    }

    @DisplayName(" 0 1 2 3 4 5 6 7 ◀ ▶ 10 ")
    @Test
    void momentAntFall_leftLessRight_89() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 8, 9));
    }

    //======================================================================
    // left > right

    @DisplayName(" 0 ▶ ◀ 3 4 5 6 7 8 9 10 ")
    @Test
    void momentAntFall_leftGreatRight_31() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 3, 1));
    }

    @DisplayName(" 0 1 2 3 4 ▶ ◀ 7 8 9 10 ")
    @Test
    void momentAntFall_leftGreatRight_65() {
        Assertions.assertEquals(5, new Solution()
                .momentAntFall(10, 6, 5));
    }

    @DisplayName(" 0 1 2 3 4 5 6 7 ▶ ◀ 10 ")
    @Test
    void momentAntFall_leftGreatRight_1() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 9, 8));
    }



    //======================================================================
    // ?не нужны, это дубли?

    @DisplayName(" 0 1 2 3 4 5 6 7 ▶ 9 ◀ ")
    @Test
    void momentAntFall_leftGreatRight_2() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(10, 10, 8));
    }

    @DisplayName(" ▶ 1 2 ◀ ")
    @Test
    void momentAntFall_leftGreatRight_3() {
        Assertions.assertEquals(3, new Solution()
                .momentAntFall(3, 3, 0));
    }

    @DisplayName(" ▶ ◀ 2 3 ")
    @Test
    void momentAntFall_leftGreatRight_4() {
        Assertions.assertEquals(1, new Solution()
                .momentAntFall(3, 1, 0));
    }

    @DisplayName(" ▶ 1 ◀ 3 ")
    @Test
    void momentAntFall_leftGreatRight_5() {
        Assertions.assertEquals(2, new Solution()
                .momentAntFall(3, 2, 0));
    }


}