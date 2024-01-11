package Neetcode150.TwoPointers;

public class LC125 {
    public boolean isPalindrome(String s) {
        Integer l = 0, r = s.length() - 1;

        while(l <= r) {
            if(!Character.isLetterOrDigit(s.charAt(l)) ) {
                l++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r)) ) {
                r--;
            }
            else if( Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)) ) {
                return false;
            }
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
