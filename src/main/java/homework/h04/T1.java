package homework.h04;

//base
// https://leetcode.com/problems/hamming-distance/
public class T1 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;

        while (xor != 0) {
            distance += xor & 1;
            xor >>= 1;
        }

        return distance;
    }
}
