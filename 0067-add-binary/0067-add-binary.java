class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int f = a.length() - 1;
        int s = b.length() - 1;
        int carry = 0 ;

        while(f >= 0 || s >= 0 || carry == 1){
            int sum = carry ;

            if(f >= 0){
                sum += a.charAt(f) - '0';
                f--;
            }
             if(s >= 0){
                sum += b.charAt(s) - '0';
                s--;
            }
            result.append(sum % 2);
            carry = sum/2;
        }

        return result.reverse().toString();

    }
}