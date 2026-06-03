class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //will keep the number and its index in a hashmap
        //then i will check if the complement of the number exists, 
        //if does, return index of complement and current index aka i

        for(int i = 0; i < nums.length; i++){
            int complement  = target - nums[i];

            //now the logic to check if complement exist
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            //this part is written before the if statement above
            // if complement does not exist, add the number in the map
            map.put(nums[i], i);
        }

        return new int[]{}; 
    }
}
