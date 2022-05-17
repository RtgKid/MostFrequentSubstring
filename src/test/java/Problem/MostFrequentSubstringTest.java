package Problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentSubstringTest {

    @Test
    public void test1() {
        String s = "inenginering";
        int k = 2;
        String expectedResult = "in";

        String result = MostFrequentSubstring.getMostFrequentSubstring(s, k);

        assertEquals(expectedResult, result);
    }
}
