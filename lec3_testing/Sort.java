package lec3_testing;

public class Sort {
    public static void sort(String[] strings) {
       sort(strings, 0);
    }
    private static  void sort (String[] strings, int start){
        if (start == strings.length){
            return;
        }
        int smallestIndex = findSmallest(strings, start);
        swap(strings, start, smallestIndex);
        sort(strings, start+1);
    }

    public static int findSmallest(String[] strings, int start) {
        int smallestIndex = start;
        for (int ix = start + 1; ix < strings.length; ix++) {
            if (strings[ix].compareToIgnoreCase(strings[smallestIndex]) < 0) {
                smallestIndex = ix;
            }
        }
        return smallestIndex;
    }

    public static void swap(String[] strings, int a, int b) {
        String temp = strings[a];
        strings[a] = strings[b];
        strings[b] = temp;
    }
}