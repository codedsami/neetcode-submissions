class Solution {
    public int[] productExceptSelf(int[] nums) {
        //This is the naive approach with runtime of O(n^2)
        int[] ans = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            int multiple = 1;
            for(int j=0; j<nums.length; j++){
                if (i==j){
                    continue;
                }
                multiple *= nums[j];
            }
            ans[i] = multiple;
        }
        return ans;
    }
}  
