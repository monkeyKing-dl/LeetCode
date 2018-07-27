import java.util.*;

/**
 * Created by daili on 2018/7/27.
 */
public class TwoSum {
    public static void main(String[] args) {
            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;
            int result[] = betterTwoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int minusResult = target - nums[i];
            if(map.get(minusResult) != null ){
                result[0]=i;
                result[1]=map.get(minusResult);
                if(i!= result[1]) {
                    break;
                }
            }
        }
        return result;
    }


    public static int[] betterTwoSum(int[] numbers,int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
