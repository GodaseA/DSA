class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] solution = new int[nums.length];

        solution[0] = 1 ;
        int product = 1 ;
        for(int i = 1 ; i< nums.length ; i++){
            product = product * nums[i-1];
           solution[i] = product;
        }

        int pro = 1;
        for(int j = nums.length -1 ; j >= 0 ; j--){

            solution[j] *= pro; 
            pro = pro * nums[j];
           
        }
   
        return solution;

    }
}