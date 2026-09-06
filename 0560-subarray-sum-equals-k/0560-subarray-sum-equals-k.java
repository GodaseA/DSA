// class Solution {
//     public int subarraySum(int[] nums, int k) {

//         for(int i = 0 ; i < nums.length ; i++){
//             if(i == 0){
//                 nums[i] = nums[i];
//             }else{
//                 nums[i] = nums[i] + nums[i-1];
//             }
//         }
//          int count = 0;
//          for(int j = 0 ; j < nums.length ; j++){
//              if(nums[j] == k){
//                     count++;
//                 }
//             for(int l = j + 1 ; l < nums.length ; l++){
//                 if(nums[l] - nums[j]  == k){
//                     count++;
//                 }
//             }
//          }
//          return count;
//     }
// }



class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap <Integer , Integer > map = new HashMap<>();
        map.put(0,1);
        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                nums[i] = nums[i];
                count = count + map.getOrDefault(nums[i] - k , 0);
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            }else{
                nums[i] = nums[i] + nums[i-1];
                count = count + map.getOrDefault(nums[i] - k , 0);
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            }

        }

        //   if(k == 0 && nums[0] != 0){
        //         count = -1;
        //     }
        //  for(int j = 0 ; j < nums.length ; j++){
           
        //     count = count + map.getOrDefault(nums[j] - k , 0);
 
        //  }
         return count;
    }
}