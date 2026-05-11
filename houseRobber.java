public class houseRobber{
    public static int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for(int num : nums) {
            int take = prev2 + num;
            int skip = prev1;
            int curr = Math.max(take, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}