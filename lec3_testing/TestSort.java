package lec3_testing;
import  org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {
    /**
     * Test the Sort.sort method.
     */
    @Test
    public void testSort() {
        String[] input = {"g", "f", "e", "d", "c", "b", "a"};
        String[] expected = {"a", "b", "c", "d", "e", "f", "g"};
        Sort.sort(input);

        assertArrayEquals(expected, input);

        String[] input2 = {"a"};
        String[] expected2 = {"a"};
        assertArrayEquals(expected2, input2);
       /* for (int ix = 0; ix < input.length; ix++){
            if (!input[ix].equals(expected[ix])) {
                System.out.println("Mismatch in position " + ix + ", expected: " + expected[ix] + ", but got " + input[ix]);
                return;
            }
        }*/


    }

    @Test
    public void testFindSmallest() {
        String[] input = {"I", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 1);
        assertEquals(expected, actual);
        String[] input2 = {"I", "have", "an", "egg"};
        int expected2 = 3;
        int actual2 = Sort.findSmallest(input2, 3);

        assertEquals(expected2, actual2);
    }
}