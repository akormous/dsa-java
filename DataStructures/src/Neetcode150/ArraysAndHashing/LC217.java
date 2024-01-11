package Neetcode150.ArraysAndHashing;

import java.util.HashSet;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
