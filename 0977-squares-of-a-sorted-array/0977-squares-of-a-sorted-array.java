class Solution {

    void swap(int[] arr,int x , int y){
        int t = arr[x];
        arr[x] = arr[y];
        arr[y] =t;
    }
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int a = 0 ;
        int b = nums.length -1 ;
        int k = nums.length -1 ;
        while(a<=b){
            if(Math.abs(nums[a]) >= Math.abs(nums[b])){
               res[k] = nums[a]*nums[a];
               k--;
               a++;
            }else{
                res[k] = nums[b]*nums[b];
                k--;
                b--;
            }

        }

        return res;
    }
}