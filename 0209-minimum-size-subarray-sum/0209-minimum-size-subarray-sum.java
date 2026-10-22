class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l = 0;
        int len = 0;
        int sum = 0;
        for(int r = 0 ; r < nums.length ; r++){
            sum += nums[r];

          while(sum >= target){
            if(len > r-l+1 || len == 0){
                len = r-l+1;
            }
            sum -= nums[l];
            l++;
          }

        }
        return len;

    }
}








// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
        
//         int l = 0;
//         int r = 0;
//         int len = 0;
//         int sum = 0;
//         while(r <= nums.length){
//             if(sum < target){
//                 if(r == nums.length){
//                     return len;
//                 }
//                sum += nums[r];
//                r++;
//             }else{
//                 if(len > r-l || len == 0){
//                     len = r-l;
//                 }
//                 sum -= nums[l];
//                  l++ ;
//             }

//         }
//         return len;

//     }
// }