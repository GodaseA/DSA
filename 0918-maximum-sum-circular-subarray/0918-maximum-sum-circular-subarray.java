class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int curMax = nums[0];
        int globleMax = nums[0];
        int total = nums[0];
        int curMin = nums[0];
        int globleMin = nums[0];


        for ( int i = 1 ; i < nums.length ; i++){

            curMax = Math.max(nums[i] , curMax + nums[i]);
            globleMax = Math.max(globleMax , curMax );

            curMin = Math.min(nums[i] , curMin + nums[i]);
            globleMin = Math.min(globleMin , curMin );

            total += nums[i]; 
        }


        if( globleMax < 0){
            return globleMax;
        }
        return Math.max(globleMax , total - globleMin);
        
    }
}