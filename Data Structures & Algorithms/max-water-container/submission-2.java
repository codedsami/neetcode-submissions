class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int n = heights.length;

        int left = 0;
        int right = n-1;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            int width = right - left;
            int water = minHeight * width;
            maxWater = Math.max(water, maxWater);

            if(minHeight == heights[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
