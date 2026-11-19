package homework.h12;

// advanced
// https://leetcode.com/problems/relative-sort-array/
import java.util.Arrays;

public class T2 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }

        for (int val = 0; val < count.length; val++) {
            while (count[val] > 0) {
                result[index++] = val;
                count[val]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        T2 solver = new T2();
        int[] res1 = solver.relativeSortArray(
                new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[] {2, 1, 4, 3, 9, 6});
        System.out.println(Arrays.toString(res1));
        // [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19]

        int[] res2 = solver.relativeSortArray(
                new int[] {28, 6, 22, 8, 44, 17},
                new int[] {22, 28, 8, 6});
        System.out.println(Arrays.toString(res2));
        // [22, 28, 8, 6, 17, 44]
    }
}
