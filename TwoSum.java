import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {// iterate through array of nums
            for (int j = i + 1; j < nums.length; j++) {// will check num[i] + num[j] equal target until it finds a match
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        TwoSum sumInstance = new TwoSum();// Make an Instance of the class to access the non static memebers (twoSum())
        int[] nums1 = new int[] { 2, 7, 11, 15 };
        int[] arrReturn = sumInstance.twoSum(nums1, 9);

        System.out.println(Arrays.toString(arrReturn));// prints out the index of the elements that add up to the target
    }
}