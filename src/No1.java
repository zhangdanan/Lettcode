import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Authorz; sloth
 * @Description:数组中重复的数字
 * @Data:Create in 15:53 2020/6/11
 * @Modificd By;
 */


public class No1 {
    public static int findRepeatNumber(int[] nums){
        Set<Integer> set=new HashSet<Integer>();
        int repeat=-1;
        for (int num:nums){
            if(!set.add(num)){
                repeat=num;
                System.out.println(repeat);
                break;
            }
        }
        return repeat;
    }

    public static void main(String[] args) {
        int data[]={2,1,3,4,2};
        findRepeatNumber(data);
    }

}

