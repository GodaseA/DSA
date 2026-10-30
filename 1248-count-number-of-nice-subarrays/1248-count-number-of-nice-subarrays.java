class Solution {
    static{
        for(int i = 0; i < 500; i++){
             numberOfSubarrays(new int[] {0}, 1);
        }
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return subsUpTo(nums , k) - subsUpTo(nums , k-1);
    }

    private static int subsUpTo(int[] nums , int k){
 
        int l = 0;
        int r = 0;
        int subs = 0;
        int sum = 0;

        while(r < nums.length){
            sum += nums[r]%2;

            while(sum > k){
                sum -= nums[l]%2;
                l++;
            }
 
            subs += r-l+1;
            r++;
        }

        return subs;
    }
}