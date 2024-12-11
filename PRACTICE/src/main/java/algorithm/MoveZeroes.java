package algorithm;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("----------------");
        int[] nums2 = {0, 0, 0, 1, 0, 3, 12};
        moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;

        while (right < n) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
    }
}
