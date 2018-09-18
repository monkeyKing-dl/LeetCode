import java.util.ArrayList;
import java.util.List;

/**
 * Created by daili on 2018/8/21.
 */
public class LetterCombinationsofaPhoneNumber_17 {
    public static List<String> letterCombinations(String digits) {
        String[] telephoneNumArrays = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","txyz"};
        List<String> resultList = new ArrayList<>();
        if(digits.length() == 0){
            return resultList;
        }
        resultList.add("");
        for(char tempChar : digits.toCharArray()){
            int index = tempChar-'2';
            String tempString = telephoneNumArrays[index];
            List<String> tempResultList = new ArrayList<>();
            for(String tempAppendString : resultList){
                for(char tempLoopChar : tempString.toCharArray()){
                    StringBuilder sb = new StringBuilder();
                    sb.append(tempAppendString).append(tempLoopChar);
                    tempResultList.add(sb.toString());
                }
            }
            resultList = tempResultList;
        }
        return resultList;
    }

    public static void main(String[] args) {
        String tempString = "23";
        letterCombinations(tempString);
    }
}
