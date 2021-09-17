package Easy;

/**
 * @Auther Eternal
 * @Date 2021/9/17
 * 两数之和
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] newNums = twoSum(nums, target);
        for (int num : newNums) {
            System.out.println(num);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++ ) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }

        return null;
    }
}
