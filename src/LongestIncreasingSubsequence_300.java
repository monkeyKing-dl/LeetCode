/**
 * Created by daili on 2018/9/24.
 */
public class LongestIncreasingSubsequence_300 {
    public static int lengthOfLIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int maxLength = 1;
        int start = 0;
        int end = 0;
        int lenth = nums.length;
        while (start<(lenth-1)||end<(lenth-1)){
            if(start == end) {
                end++;
            }
            if(nums[end]>nums[end-1]){
                maxLength = Math.max(maxLength,end-start+1);
                if(end<lenth-1) {
                    end++;
                }else {
                    start++;
                }
            }else {
                start++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] numArrays = new int[]{4,10,4,3,8,9};
        System.out.println(lengthOfLIS(numArrays));
    }
}
