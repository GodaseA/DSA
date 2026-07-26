// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//  int len = strs.length;
//         String Pref = "";
//        for(int i = 0 ; i < strs[0].length() ; i++){
//          char ch = strs[0].charAt(i) ;
//             for(String str : strs){
//                 if(i >= str.length() || ch != str.charAt(i)  ){
//                     return Pref;
//                 }
//             }
//             Pref += ch;
//        }
//         return Pref;
//     }
// }


class Solution{
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String pref = "";
        int min = Math.min( strs[0].length(),strs[strs.length -1].length());
        for(int i = 0 ; i < min ; i++){
            if( strs[0].charAt(i) != strs[strs.length -1].charAt(i)){
                return pref;
            }
            pref += strs[0].charAt(i);
        }
        return pref;
    }
}