/**
 * Created by daili on 2018/8/19.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String containsString = "";
        int minStringIndex = 0;
        String minString = strs[0];
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() < minString.length()){
                minStringIndex = i;
                minString = strs[i];
            }
        }
        if(minString.length() == 0){
            return "";
        }
        int start = 0;
        int end = 1;
        for( end=1;end <=minString.length();end++){
            String tempString = minString.substring(start,end);
            boolean contains = true;
            for(int i=0;i<strs.length;i++){
                if(i == minStringIndex){
                    continue;
                }
                if(!strs[i].startsWith(tempString)){
                    contains = false;
                    break;
                }
            }
            if(contains){
                if(containsString.length() < tempString.length()) {
                    containsString = tempString;
                }
            }else {
                break;
            }
        }
        return containsString;
    }

    public static void main(String[] args) {
        LongestCommonPrefix_14 longestCommonPrefix_14 = new LongestCommonPrefix_14();
        String[] arrays = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix_14.longestCommonPrefix(arrays));
    }
}
