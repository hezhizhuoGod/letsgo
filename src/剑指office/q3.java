package 剑指office;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//给一个数组查找任意一个重复数字
public class q3 {
    public int findRepeatNumber(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;


    }
}
