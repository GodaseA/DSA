class Solution {

    int rev = 0;
    public int reverce(int x) {
        if (x < 1) {
            return 0;
        }
        ;
        rev = rev * 10 + (x % 10);
        reverce(x / 10);
         return rev;
    }

    public boolean isPalindrome(int y) {

        if (y < 0) {
            return false;
        }

       

        if (y ==  reverce(y)) {
            return true;
        } else {
            return false;
        }

    }
}