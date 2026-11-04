class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        for(int i = 0; i<nums.length; i++){
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }

        for(int i=0; i<prefixSum.length -1 ; i++){
            int leftSum = prefixSum[i];
            int rightSum = prefixSum[prefixSum.length-1] - prefixSum[i+1];

            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }
}