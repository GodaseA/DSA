class Solution {
    public static int numberOfSubarrays(int[] nums, int k) {
        return subsUpTo(nums , k) - subsUpTo(nums , k-1);
    }


    private static int subsUpTo(int[] nums , int k){
        //  for(int i = 0 ; i < nums.length ; i ++){
           
        // }



        int l = 0;
        int r = 0;
        int subs = 0;
        int sum = 0;

        while(r < nums.length){
             if(nums[r]%2 == 0){
                nums[r] = 0;
            }else{
                nums[r] = 1;
            }

            sum += nums[r];

            while(sum > k){
                sum -= nums[l];
                l++;
            }
 
            subs += r-l+1;
            r++;
        }

        return subs;
    }
}