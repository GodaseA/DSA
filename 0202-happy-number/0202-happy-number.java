class Solution {
   public HashSet<Integer> set = new HashSet<>();

    public int happy(int x) {
        if (x == 1) {
            return 1;
        }
        if(set.contains(x)){
            return 0;
        }else{
            set.add(x);
        }
        int res = 0;
        while (x >= 1) {
            res = res + (x % 10) * (x % 10);
            x = x / 10;
        }
        return happy(res);
    }

    public boolean isHappy(int n) {


 
        if (happy(n) == 1) {
            return true;
        }

        return false;
    }
}