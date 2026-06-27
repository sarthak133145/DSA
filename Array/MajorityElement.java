package Array;
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] arr) {

        int n = arr.length;
        int ele = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == ele) {
                count++;
            } else if (count == 0) {
                ele = arr[i];
                count = 1;
            } else {
                count--;
            }
        }

        int countEle = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                countEle++;
            }
        }

        if (countEle > n / 2) {
            return ele;
        }

        return -1;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int result = sol.majorityElement(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Majority Element: " + result);
    }
}