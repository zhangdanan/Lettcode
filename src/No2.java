/**
 * @author Yoga zhang
 * @Type No2.java
 * @date 2021/5/24 11:56
 */

//两数之和
public class No2 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("序号是："+"["+i+","+j+"]");
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums={3,2,5,4,5,7,9,4};
        twoSum(nums,6);

    }
}
