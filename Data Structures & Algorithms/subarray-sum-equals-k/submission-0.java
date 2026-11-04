class Solution {
    public int subarraySum(int[] nums, int k) {
        //naive
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            int total = 0;

            for (int j = i; j < nums.length; j++) {

                total += nums[j];

                if (total == k) {
                    counter++;
                }
            }
        }

        return counter;
    }
}