// class Solution {

//     public String[] convert(int[] nums) {
//         String[] result = new String[nums.length];

//         for (int i = 0; i < nums.length; i++) {
//             result[i] = String.valueOf(nums[i]);
//         }

//         return result;
//     }

//     public String largestNumber(int[] nums) {

//         String[] arr = convert(nums);

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - 1 - i; j++) {
//                 int a = 0;
//                 int lenA = arr[j].length();
//                 int lenB = arr[j + 1].length();
//                 int min = Math.min(lenA, lenB);

//                 while (a <= min) {

//                     if(a==min){
//                     if (((lenA > lenB) && (arr[j].charAt(a) < arr[j].charAt(0))) ||
//                             ((lenA < lenB) && (arr[j + 1].charAt(a) > arr[j + 1].charAt(0)))) {

//                         String temp = arr[j];
//                         arr[j] = arr[j + 1];
//                         arr[j + 1] = temp;

//                         break;
//                     }
//                     }else{
//                     if (arr[j].charAt(a) == arr[j + 1].charAt(a)) {
//                         a++;
//                         continue;
//                     }

//                     if (arr[j].charAt(a) < arr[j + 1].charAt(a)) {
//                         String temp = arr[j];
//                         arr[j] = arr[j + 1];
//                         arr[j + 1] = temp;
//                         break;
//                     }
//                     }
//                 }
//             }
//         }

//         String res = "";
//         int st = 0;
//         while (st < arr.length) {
//             res += arr[st];
//             st++;
//         }

//         return res;
//     }
// }

class Solution {

    public String[] convert(int[] nums) {
        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = String.valueOf(nums[i]);
        }

        return result;
    }

    public String largestNumber(int[] nums) {

        String[] arr = convert(nums);


        


        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length -1 - i; j++) {
                if ((arr[j] + arr[j + 1])
                        .compareTo(arr[j + 1] + arr[j]) < 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
            }
        }
  String res = "";
    int st = 0;
    while(st<arr.length)
    {
        res += arr[st];
        st++;
    }

    if(res.charAt(0) == '0'){
        return "0";
    }

    return res;

    }

  
}