class Solution {
    public int maxProduct(int[] nums) {

        int currentMax = nums[0];
        int currentMin = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int tempMax = currentMax;
            int tempMin = currentMin;

            currentMax = Math.max(
                nums[i],
                Math.max(nums[i] * tempMax, nums[i] * tempMin)
            );

            currentMin = Math.min(
                nums[i],
                Math.min(nums[i] * tempMax, nums[i] * tempMin)
            );

            answer = Math.max(answer, currentMax);
        }

        return answer;
    }
}