// class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] arr = new int[nums.length];
        
//         for(int i = 0 ; i < nums.length ; i++){
//             arr[(i+k)%nums.length] = nums[i];
//         }
//         for(int i = 0 ; i < nums.length ; i++){
//             nums[i] = arr[i];
//         }
//      }
// }


class Solution {

    public void reverse(int[]arr , int a, int b){
        while(b>a){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            b--;
            a++;
        }

     }

    public void rotate(int[] nums, int k) {

         k=k%nums.length;


        reverse(nums , 0 , nums.length -1);
        reverse(nums, 0 , k-1);
        reverse(nums , k , nums.length -1);




     }
}