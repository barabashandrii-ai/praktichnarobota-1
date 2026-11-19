package homework.h12;

// base
// https://leetcode.com/problems/height-checker/
import java.util.Arrays;

public class T1 {

    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int mismatches = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatches++;
            }
        }
        return mismatches;
    }

    public static void main(String[] args) {
        T1 solver = new T1();
        System.out.println(solver.heightChecker(new int[] {1, 1, 4, 2, 1, 3})); // 3
        System.out.println(solver.heightChecker(new int[] {5, 1, 2, 3, 4})); // 5
        System.out.println(solver.heightChecker(new int[] {1, 2, 3, 4, 5})); // 0
    }
}
