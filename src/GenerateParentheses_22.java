import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by daili on 2018/9/18.
 */
public class GenerateParentheses_22 {
    public List<String> generateParenthesis(int n) {
        String firstString = "()";
        List<String> reusltList = new ArrayList<>();
        if(n == 1){
            List<String> list = new ArrayList<>();
            list.add(firstString);
            return list;
        }else {
            reusltList = generate(generateParenthesis(n-1));
        }
        return reusltList;
    }

    public List<String> generate(List<String> stringList){
        List<String> resultList = new ArrayList<>();
        for(String tempString : stringList){
            int length = tempString.length();
            for(int i=0;i<=length;i++) {
                StringBuilder sb = new StringBuilder(tempString);
                sb.insert(i,"()");
                resultList.add(sb.toString());
            }

        }
        resultList = resultList.stream().distinct().collect(Collectors.toList());
        return resultList;
    }

    public static void main(String[] args) {
        GenerateParentheses_22 generateParentheses22 = new GenerateParentheses_22();
        List<String> resultList = generateParentheses22.generateParenthesis(3);
        resultList.stream().forEach(e-> System.out.println(e));
    }
}
