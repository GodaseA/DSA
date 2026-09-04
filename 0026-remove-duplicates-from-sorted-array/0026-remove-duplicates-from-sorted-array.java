class Solution {

    // public void swap(int x, int y) {
    //     int temp = nums[x];
    //     nums[x] = nums[y];
    //     nums[y] = temp;
    // }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        int a = 0;

        while(a < nums.length){
            if(nums[k] == nums[a]){
                a++;
            }else{
              int temp = nums[k+1];
        nums[k+1] = nums[a];
        nums[a] = temp;
                k++;
                a++;
            }
         
        }        

        return k +1 ;
    }
}