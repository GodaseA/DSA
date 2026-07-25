class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int siz = temperatures.length;
        int[] result = new int[siz];
        Stack<Integer> stack = new Stack<>();

        for(int i = siz - 1 ; i >= 0 ; i--){

            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i] ){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek()-i;
            }

            stack.push(i);
        }
        return result;
    }
}