package Neetcode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(Integer n : nums) {
           freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // bucket sort
        List<Integer>[] bucket = new List[nums.length + 1];

        for(Integer key : freq.keySet()) {
            Integer frequency = freq.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[freq.get(key)].add(key);
        }

        int[] result = new int[k];
        int j = 0;
        // get first k
        for(int i = bucket.length - 1; i >= 0 && j < k; i--) {
            if(bucket[i] != null) {
                for(int n : bucket[i]) {
                    if(j == k) break;
                    result[j] = n;
                    j++;
                }
            }
        }
        return result;
    }
}
