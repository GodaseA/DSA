 
class Solution {

    public String[] convert(int[] nums) {
        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = String.valueOf(nums[i]);
        }

        return result;
    }

    public String largestNumber(int[] nums) {

        String[] arr = convert(nums);
  Arrays.sort(arr, (a, b) -> {
            return (b + a).compareTo(a + b);
        });
  String res = "";
    int st = 0;
    while(st<arr.length)
    {
        res += arr[st];
        st++;
    }

    if(res.charAt(0) == '0'){
        return "0";
    }

    return res;

    }

  
}