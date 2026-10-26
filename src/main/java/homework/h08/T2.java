package homework.h07;

import java.util.Collections;
import java.util.List;

// base
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
public class T2 {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
