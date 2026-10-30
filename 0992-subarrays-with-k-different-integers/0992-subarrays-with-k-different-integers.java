class Solution {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return subsUpTo(nums , k) - subsUpTo(nums , k-1);
    }
    public static int subsUpTo(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap <>();
 
        int l = 0;
        int r = 0;
        int subs = 0;
        int dist = 0;

        while(r < nums.length){
            map.put(nums[r] , map.getOrDefault(nums[r] , 0) +1);
         


            while(map.size() > k){
                map.put(nums[l] , map.getOrDefault(nums[l] , 0) -1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            subs += r-l+1;
            r++;
        }

        return subs;
    }
}