class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int a = 0;

        while(a < nums.length){
            if(nums[k] == nums[a]){
                a++;
            }else{
                 nums[k+1] = nums[a];
                 k++;
                a++;
            }
        }       
        return k +1 ;
    }
}