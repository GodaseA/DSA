class Solution {
    public int singleNumber(int[] nums) {
    //     HashSet <Integer> set  = new HashSet<>();
    //     for(int num : nums){
    //         if(set.contains(num)){
    //             set.remove(num);
    //         }else{
    //              set.add(num);
    //         }
    //     }    
    // int ans = set.iterator().next();
    //     return ans;  



    int ans = 0;
    for(int num : nums){
        ans ^= num;
    }
    return ans;
    }
}