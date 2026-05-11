import java.util.*;

public class removeDuplicates{
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}