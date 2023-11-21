package Neetcode150;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int suffixProd = 1;
        for(int i = nums.length -1; i >= 0; i--) {
            result[i] = result[i] * suffixProd;
            suffixProd = suffixProd * nums[i];
        }

        return result;
    }
}
