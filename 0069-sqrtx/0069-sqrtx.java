class Solution {
    public int mySqrt(int x) {

        if(x == 0){
            return 0;
        }
        if(x== 1){
            return 1;
        }
        int s = 0;
        int e = x;
        int m;
        while(s <= e){
            m = s + (e-s)/2;
            if(x / m == m){
                return m ;
            }
             if(x/m > m){
                s = m +1 ;
            }
             if(x/m < m){
                e = m -1;
            }
        }
        return s -1;

    }
}