package Neetcode150.TwoPointers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LC15 {
    private List<List<Integer>> twoSum(int[] nums, int start, int target) {
        int l = start, r = nums.length - 1;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        while(l < r) {
            if(nums[l] + nums[r] == target) {
                result.add( new ArrayList<Integer>( Arrays.asList(l,r) ) );
                while(l < r && nums[l] == nums[l+1]) l++;
                while(l < r && nums[r] == nums[r-1]) r--;
                l++;
                r--;
            }
            else if(nums[l] + nums[r] > target) {
                r--;
            }
            else {
                l++;
            }
        }
        return result;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length - 2; i++) {

            if(i == 0 || nums[i] != nums[i-1]) {
                List<List<Integer>> duplets = twoSum( nums, i+1, 0 - nums[i] );

                for(List<Integer> d : duplets) {
                    result.add(new ArrayList<Integer>( Arrays.asList( nums[i], nums[d.get(0)], nums[d.get(1)] ) ) );
                }
            }

        }
        return result;
    }
}
