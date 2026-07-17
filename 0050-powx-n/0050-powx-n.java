class Solution {

    public double myPowNum(double y, long m) {
        if (m == 0) {
            return 1;
        }
        double half = myPowNum(y, m / 2);
        if (m % 2 == 1) {
            return half * half * y;
        }
        return half * half;
    }


    public double myPow(double x, int n) {
        long N = n;
        if (n < 0) {
            return 1 / myPowNum(x, -N);
        } else {
            return myPowNum(x, N);
        }

    }
}