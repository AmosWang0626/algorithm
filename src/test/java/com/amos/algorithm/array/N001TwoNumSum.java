package com.amos.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/5/10
 */
public class N001TwoNumSum {

    /**
     * 暴力解法：双层for循环
     * <p>
     * map解法：值为key，index为value，遍历一下
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int num : nums) {
            final int fin = target - num;
            if (map.containsKey(fin)) {
                System.out.printf("num1[%d](%d), num2[%d](%d)\n", num, map.get(num), fin, map.get(fin));
                break;
            }
        }
    }

}
