class Solution {
    public int reverseBits(int n) {
        String binary = "";
        int res = 0;
        while (n > 0) {
            binary =  binary + (n % 2);
            n = n / 2;
        }
        int i = binary.length();
        while(i < 32){
            binary = binary + 0 ;
            i++;
        }
        for (int j = 0; j < binary.length(); j++) {
            res = res * 2 + (binary.charAt(j) - '0');
        }
        return res ;
    }
}