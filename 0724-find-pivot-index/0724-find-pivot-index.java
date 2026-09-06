class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
         if(nums.length == 0){
            return -1;
        }
        for(int i = nums.length - 2 ; i >=0 ; i--){
            nums[i] = nums[i] + nums[i+1];
        }


        for(int i = 0 ; i <nums.length-1 ; i++){
            if(i == nums.length-1 && nums[0]  == nums[i]){
                return i;
            }
            if(nums[0] - nums[i+1] == nums[i]){
                return i;
            }
        }

        if(nums[0]  == nums[nums.length-1]){
                return nums.length-1;
            }
        return -1;
    }
}