// class Solution {
//     public int maxVowels(String s, int k) {
//         Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

//         int currVo = 0;

//         for (int i = 0; i < k; i++) {
//             if (vowels.contains(s.charAt(i))) {
//                 currVo++;
//             }
//         }

//         int maxVo = currVo;

//         for (int i = k; i < s.length(); i++) {
//             if (vowels.contains(s.charAt(i - k))) {
//                 currVo--;
//             }

//             if (vowels.contains(s.charAt(i))) {
//                 currVo++;
//             }

//             maxVo = Math.max(maxVo, currVo);

//             if (maxVo == k) {
//                 return k;
//             }
//         }

//         return maxVo;
//     }
// }



class Solution {
    public int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        int maxVo = 0;
        for(int i = 0 ; i < k ; i++){
            if(vowels.contains(s.charAt(i))){
                maxVo ++;
            }
        }

        int currVo = maxVo;
        int f = 0 ; 
        int l = k-1;

        while(l < s.length() -1){

            if(vowels.contains(s.charAt(f))){
                currVo --;
            }
            if(vowels.contains(s.charAt(l + 1))){
                currVo++;
            }

            if(currVo > maxVo){
                maxVo = currVo;
            }

            l++;
            f++;
        }

        return maxVo;
    }
}