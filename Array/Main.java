package Array;
import java.util.*;

class Solution {
    public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = sol.maxSubArray(arr);

        System.out.println("Max Subarray Sum: " + result);
    }
}