//package lec6_lists3;

/**
 * ArrayBasics
 *
 * @author Josh Hug
 */

public class ArrayBasics2 {
    /**
     * ArrayBasics
     */

    public static void main(String[] args) {
        int[][] pascalsTriangle;  // juse a reference, does not point to anything
        pascalsTriangle = new int[4][];
        // an array of reference, each points to an integer array, or null
        int[] rowZero = pascalsTriangle[0];

        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};
        int[] rowTwo = pascalsTriangle[2];
        rowTwo[1] = -5;

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

        int[][] pascalAgain = new int[][]{{1}, {1, 1},
                {1, 2, 1}, {1, 3, 3, 1}};
    }
} 