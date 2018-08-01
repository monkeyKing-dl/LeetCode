/**
 * Created by daili on 2018/8/1.
 */
public class LongestPalindromicSubstring_5 {

    public static void main(String[] args) {
        System.out.println(dpSolution("aaaa"));
    }

    public static String solution(String s){
        if(s.length() == 0){
            return "";
        }
        int length = s.length();
        int maxRound = 0;
        int left = 0;
        int right = 0;
        int tempMaxRount = 0;
        String resultString = "";
        //中间夹了一个字母的
        for(int i=1;i<=length-2;i++){
             left = i-1;
             right = i+1;
             while (left>=0&&right<=length-1){
                 if(s.charAt(left) == s.charAt(right)){
                     left--;
                     right++;
                 }else {
                     break;
                 }

             }
            if((right-left)>2){
                tempMaxRount = right - left;
                if(tempMaxRount > maxRound){
                    maxRound = tempMaxRount;
                    resultString = s.substring(left+1,right);
                }
            }
        }

        //中间不加字母的
        for(double i=0.5;i<=length-1-0.5;i++){
            left = (int) (i-0.5);
            right = (int) (i+0.5);
            while (left>=0&&right<=length-1){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }else {
                    break;
                }

            }
            if((right-left)>2){
                tempMaxRount = right - left;
                if(tempMaxRount > maxRound){
                    maxRound = tempMaxRount;
                    resultString = s.substring(left+1,right);
                }
            }
        }
        if(resultString.length() == 0){
            resultString = s.substring(0,1);
        }
        return resultString;
    }

    public static String dpSolution(String s){
        int length = s.length();
        boolean [][] pal = new boolean[length][length];
        String resultString = "";
        int maxRount =0;
        int j = 0;
        for(int i=0;i<length;i++){
            j=i;
            while (j>=0){
                //如果s[i][j]是回文，那么s[i+1][j-1]也是回文，i-j<2是用来判断一个或者两个字符的，例如单独的a,aa都是回文
                if(s.charAt(i) == s.charAt(j) && (i-j<2 || pal[j+1][i-1])){
                    pal[j][i]=true;
                    int tempMax = i-j+1;
                    if(tempMax > maxRount){
                        resultString=s.substring(j,i+1);
                        maxRount = tempMax;
                        System.out.println(maxRount);
                    }

                }
                j--;
            }
        }
        return resultString;
    }
}
