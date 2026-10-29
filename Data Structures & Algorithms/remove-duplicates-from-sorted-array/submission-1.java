class Solution {
    public int removeDuplicates(int[] nums) {
        //going thru the array only once
        //two pointer, one is the counter
        // the other is pointing to currElement
        int counter = 1;
        int currElement = nums[0];

        for (int i = 1 ; i < nums.length; i++){
            if (nums[i] != currElement){
                nums[counter] = nums[i];
                counter++;
                currElement = nums[i];
            }
        }

        return counter;
    }
}