/**
 * Created by daili on 2018/9/23.
 */
public class MinimumSizeSubarraySum_209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int answer = 0;
        //这次取几个数
        for(int i=1;i<=length;i++){
            int sum ;
            //从第几个数开始
            for(int j=0;j<=length-i;j++){
                sum = 0;
                //将第几个数开始取的数，加起来
                for(int k=0;k<=i-1;k++){
                    sum = sum+nums[j+k];
                }
                if(sum >= s){
                    answer = i;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int s = 11;
        int []nums = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(s,nums));
    }
}
