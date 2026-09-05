class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = s + (e-s)/2;
            if(target == nums[m]){
                return m ;
            }
             if(target > nums[m]){
                s = m + 1;
            }
             if(target < nums[m]){
                e = m - 1;
            }
        }

        // if(nums[m] < target){
        //     return m+1;
        // }
        // if(nums[m] > target && m == 0){
        //     return 0;
        // }

        return s;

    }
}