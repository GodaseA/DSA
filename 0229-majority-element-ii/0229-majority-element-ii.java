class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List <Integer> list = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int co1 = 0;
        int co2 = 0;

        for (int i = 0; i < nums.length; i++) {

    if (nums[i] == c1) {
        co1++;
    }
    else if (nums[i] == c2) {
        co2++;
    }
    else if (co1 == 0) {
        c1 = nums[i];
        co1 = 1;
    }
    else if (co2 == 0) {
        c2 = nums[i];
        co2 = 1;
    }
    else {
        co1--;
        co2--;
    }
}

        int fco1 = 0;
        int fco2 = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == c1){
                fco1 += 1;
            }
            if(nums[i] == c2){
                fco2 += 1;
            }
        }

        

        if(fco1 > nums.length/3 && c1 != c2){
            list.add(c1);
        }
        if(fco2 > nums.length/3 ){
            list.add(c2);
        }

        return list;
    }
}