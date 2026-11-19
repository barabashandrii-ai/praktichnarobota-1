package homework.h11;

// base
// https://leetcode.com/problems/missing-number/
public class T1 {
  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;
    for (int num : nums) {
      actualSum += num;
    }
    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    int[] testArray = {3, 0, 1};
    System.out.println("Missing number: " + missingNumber(testArray));
  }
}
