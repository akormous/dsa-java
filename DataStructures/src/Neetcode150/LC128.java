package Neetcode150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class LC128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int maxLen = 1;
        for(int n : nums) {
            if(!set.contains(n-1)) {
                int count = 1;
                while(set.contains(n+1)) {
                    count++;
                    set.remove(n);
                    n++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
