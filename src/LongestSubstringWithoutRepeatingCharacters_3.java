import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by daili on 2018/7/29.
 */


public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static void main(String[] args) {
        String s = "abcadda";
        System.out.println(solutionSlidingWindowOptimized(s));
    }

    //暴力算法
    public static int solution(String s){
        Set<Character> set = new HashSet<>();
        int maxNum = 0;
        int tempNum = 0;
        for(int i=0;i<s.length();i++){
            tempNum=0;
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    tempNum++;
                }else {

                    set.clear();
                    break;
                }
            }
            maxNum = maxNum > tempNum?maxNum : tempNum;
        }
        return maxNum;
    }

    //sliding window
    //一个字符串不一样，那么他的子字符串也肯定不一样
    //s[i,j]这个substring肯定包含s[i-1,j]这个string，然后继续往右边遍历，看能不能组成更长的字符串
    public static int solutionSlidingWindow(String s){
        Set<Character> characterSet = new HashSet<>();
        int left =0;
        int right = 0;
        int length = s.length();
        int maxNum=0;
        while (left<length && right < length){
            if(!characterSet.contains(s.charAt(right))){
                characterSet.add(s.charAt(right));
                right++;
                maxNum =maxNum > characterSet.size() ? maxNum : characterSet.size();
            }else {
                characterSet.remove(s.charAt(left));
                left++;
            }
        }
        return maxNum;
    }

    //这是优化的滑动窗口算法，当前监测到下一个字母之前已经有过，那么可以直接把i提升到目前最大子字符串的出现的相同的字母的位置，减少中间的判断
    public static int solutionSlidingWindowOptimized(String s){
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
    }
}
