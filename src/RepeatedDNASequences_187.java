import java.util.ArrayList;
import java.util.List;

/**
 * Created by daili on 2018/9/23.
 */
public class RepeatedDNASequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int stringLength = s.length();
        List<String> resultList = new ArrayList<>();
        for(int i=0;i<=stringLength-10;i++){
            String tempString =s.substring(i,i+10);
            if(s.indexOf(tempString,i+10)>0){
                resultList.add(tempString);
            }
        }
        return resultList;
    }
}
