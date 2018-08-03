import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by daili on 2018/8/3.
 */
public class Permutations_46 {
    static List<List<Integer>> totalList = new ArrayList<>();
    public static void main(String[] args) {
        Permutations_46 permutations_46 = new Permutations_46();
        int[] nums = new int[]{1,2,3,4};
        permutations_46.solution2(nums);
    }

    //递归 a[n]排列组合就是 每一个做一次第一个元素和剩下的n-1个元素的a[n-1]的全排列
    public List<List<Integer>> solution(int[] nums){
        perm(nums,nums.length,0);
        return totalList;
    }

    public void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void printarrays(int nums[]){
        List<Integer> tempList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           tempList.add(nums[i]);
        }
        totalList.add(tempList);
    }

    public void perm(int nums[],int n,int start){
        if(start == n-1){
            printarrays(nums);
        }

        for(int j=start;j<n;j++) {
            swap(nums, j, start);
            perm(nums, n, start + 1);
            swap(nums, j, start);
        }

    }



    //linkedlist的pollfist起了关键作用了
    //逻辑很简单  假设是 1，2，3，4 那么 从 1开始，读取2，然后分别插入到0位置和1位置，成为1，2和2，1；然后对于3同样如此，对1，2和2，1分别执行插入1到3的每一个位置
    public List<List<Integer>> solution2(int[] num){
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for (int n : num) {
            int size = res.size();
            for (; size > 0; size--) {
                List<Integer> r = res.pollFirst();
                for (int i = 0; i <= r.size(); i++) {
                    List<Integer> t = new ArrayList<Integer>(r);
                    t.add(i, n);
                    res.add(t);
                }
            }
        }
        return res;
    }
}
