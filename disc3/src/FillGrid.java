public class FillGrid {
    public static void main(String[] args) {
        int[] LL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0};
        int[] UR = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[][] S = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };
        display(S);
        fillGrid(LL, UR, S);
        display(S);

    }

    public static void display(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println("");
        }
    }

    public static void fillGrid(int[] LL, int[] UR, int[][] S) {
        int N = S.length;
        int kL, kR;
        kL = kR = 0;

        for (int i = 0; i < N; i += 1) {
            int j;
            for (j = 0; j < i; j++, kL++) {
                S[i][j] = LL[kL];
            }
            S[i][i] = 0;
            for (j = i + 1; j < N; j++, kR++) {
                S[i][j] = UR[kR];
                display(S);
            }

        }
    }
}

