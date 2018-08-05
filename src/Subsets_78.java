import java.util.ArrayList;
import java.util.List;

/**
 * Created by daili on 2018/8/4.
 */
public class Subsets_78 {


    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        Subsets_78 subsets_78 = new Subsets_78();
        subsets_78.subsets(num);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        List<Integer> tempList = new ArrayList<>();
        dfs(res,tempList,nums,0);
//        for(List<Integer> ttList : res){
//            if(ttList.size() > 0){
//                for(int i=0;i<ttList.size();i++){
//                    System.out.print(ttList.get(i)+" ");
//                }
//                System.out.println();
//            }
//        }
        return res;
    }

    public void dfs(List<List<Integer>> res,List<Integer> tempList,int[] nums,int startIndex){
        for(int i=startIndex;i<nums.length;i++){
            tempList.add(nums[i]);
            res.add(new ArrayList<>(tempList));
            dfs(res,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
