class Solution {
    public boolean isPerfectSquare(int num) {

        if(num == 1 ){
            return true;
        }
        int s = 1;
        int e = num / 2;
        while(s <= e){
           int m = s + (e-s)/2;

            if(num/m == m && num%m ==0){
                return true ;
            }
             if(num/m > m){
                s = m + 1 ;
            }else{
                e = m - 1 ;
            }
        }
        return false;
    }
}



