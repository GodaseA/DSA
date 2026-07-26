class Solution {
    public String longestCommonPrefix(String[] strs) {
 int len = strs.length;
        String Pref = "";
       for(int i = 0 ; i < strs[0].length() ; i++){
         char ch = strs[0].charAt(i) ;
            for(String str : strs){
                if(i >= str.length() || ch != str.charAt(i)  ){
                    return Pref;
                }
            }
            Pref += ch;
       }
        return Pref;
    }
}