import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by daili on 2018/9/22.
 */
public class LargestNumber_179 {
    public String largestNumber(int[] nums) {
        List<String> stringList = Arrays.stream(nums).boxed().map(e->e.toString()).collect(Collectors.toList());
        stringList = stringList.stream().sorted((o1, o2) -> {
            String o11 = o1+o2;
            String o22 = o2+o1;
            return o11.compareTo(o22);
//            if(o1.equals(o2)){
//                return 0;
//            }
//            int length1 = o1.length();
//            int length2 = o2.length();
//            int minLength = Math.min(length1,length2);
//            for(int i=0;i<minLength;i++){
//                if(o1.toCharArray()[i]>o2.toCharArray()[i]){
//                    return 1;
//                }else if(o1.toCharArray()[i]<o2.toCharArray()[i]){
//                    return -1;
//                }else {
//                    //i++;
//                }
//            }
//            if(minLength == length1){
////                if(o2.toCharArray()[minLength]>o2.toCharArray()[minLength-1]){
////                    return -1;
////                }else if( o2.toCharArray()[minLength]<o2.toCharArray()[minLength-1]){
////                        return 1;
////                    }else {
////                    return 0;
////                }
//                String o2Remain = o2.substring(minLength,length2);
//                StringBuilder o1Add = new StringBuilder();
//                while (o1Add.length() < o2Remain.length()){
//                    o1Add.append(o1);
//                }
//                return Integer.valueOf(o1Add.toString().substring(o2Remain.length())) >= Integer.valueOf(o2Remain) ? 1:-1;
//            }else if(minLength == length2){
////                if(o1.toCharArray()[minLength]>o1.toCharArray()[minLength-1]){
////                    return 1;
////                }else if( o1.toCharArray()[minLength]<o1.toCharArray()[minLength-1]){
////                    return -1;
////                }else {
////                    return 0;
////                }
//                String o1Remain = o1.substring(minLength,length1);
//                StringBuilder o2Add = new StringBuilder();
//                while (o2Add.length() < o1Remain.length()){
//                    o2Add.append(o2);
//                }
//                return Integer.valueOf(o1Remain) >= Integer.valueOf(o2Add.toString().substring(o1Remain.length())) ? 1:-1;
//            }
//            return 0;
        }).collect(Collectors.toList());
        String answerString =stringList.stream().sorted(Comparator.reverseOrder()).reduce("",String::concat);
        return answerString;
    }

    public static void main(String[] args) {
        int []array = new int[]{121,12};
        LargestNumber_179 largestNumber179 = new LargestNumber_179();
        System.out.println(largestNumber179.largestNumber(array));
    }
}
