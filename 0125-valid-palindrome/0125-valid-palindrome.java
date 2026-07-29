class Solution {

   

    public boolean isPalindrome(String c) {

        int f;
        int s;
        String a = c.replaceAll("[^a-zA-Z0-9]","")
                    .toLowerCase();

         int len = a.length();
         if(len == 0 || len == 1){
            return true;
         }
        if (len % 2 == 0 ){
                s = len/2;
                f = len/2- 1;
        }else{
                 s = len /2 +1;
                 f = len /2-1;
        }

        while (f >= 0 ){
            if(a.charAt(f) == a.charAt(s)){
                f--;
                s++;
            }else{
                return false;
            }
        }

    return true;

    }
}