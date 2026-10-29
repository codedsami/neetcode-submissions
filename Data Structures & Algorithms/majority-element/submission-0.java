class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frq = new HashMap<>();

        for(int num : nums){
            frq.put(num, frq.getOrDefault(num, 0) + 1);

            if(frq.get(num) > nums.length/2){
                return num;
            }
        }

        return -1;
    }
}