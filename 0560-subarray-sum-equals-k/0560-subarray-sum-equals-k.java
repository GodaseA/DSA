class Solution {
    public int subarraySum(int[] nums, int k) {

        for(int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                nums[i] = nums[i];
            }else{
                nums[i] = nums[i] + nums[i-1];
            }
        }

         int count = 0;
         for(int j = 0 ; j < nums.length ; j++){
             if(nums[j] == k){
                    count++;
                }
            for(int l = j + 1 ; l < nums.length ; l++){
                if(nums[l] - nums[j]  == k){
                    count++;
                }
            }
         }
         return count;
    }
}