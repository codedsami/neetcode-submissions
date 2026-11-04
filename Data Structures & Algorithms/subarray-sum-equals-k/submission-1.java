class Solution {
    public int subarraySum(int[] nums, int k) {
        //map
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //Because a subarray starting at index 0 might already have a sum equal to k.

        int currentPrefix = 0;
        int counter = 0;

        for(int i=0; i < nums.length; i++){
            currentPrefix = currentPrefix + nums[i];
            int target = currentPrefix - k;

            if(map.containsKey(target)){
                counter += map.get(target);
            }

            map.put(currentPrefix, map.getOrDefault(currentPrefix, 0) + 1);
        }

        return counter;

        
    }
}