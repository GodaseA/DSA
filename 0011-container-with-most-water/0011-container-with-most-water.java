class Solution {
    public int maxArea(int[] height) {

        int maxWater = 0;

        int L = 0;
        int R = height.length-1;

        while(L < R){

            int h = Integer.min(height[L],height[R]);
            int area = (R - L)* h;
          if(area > maxWater)  {
            maxWater = area;
          };
          if(height[L] < height[R] ){
           L = L+1;
          }
          else{
             R = R -1;
          }
        }
        return maxWater;
    }
}