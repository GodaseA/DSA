class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
    if(nums1.length>nums2.length){
        return findMedianSortedArrays(nums2, nums1);
    }
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while(low<=high){

            int cutB = (low + high)/2 ;
            int cutA = (m+n+1)/2-cutB;

            int L1 = (cutB == 0)? Integer.MIN_VALUE : nums1[cutB-1];
            int R1 = (cutB == m)? Integer.MAX_VALUE :  nums1[cutB];
            int L2 = (cutA == 0)? Integer.MIN_VALUE :  nums2[cutA-1];
            int R2 = (cutA == n)? Integer.MAX_VALUE :  nums2[cutA];

            if(L1 <= R2 && L2 <= R1){

                if((m+n)%2 == 0){
                    return (Math.max(L1,L2)+Math.min(R1,R2))/2.0;
                }else{
                    return Math.max(L1,L2);
                }
            }
            else if (L1 > R2) {
                high = cutB - 1;
            }
            else {
                low = cutB + 1;
            }
        }
        return 0.0 ;
    }
}