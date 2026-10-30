class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        for(int i = 1; i <= nums.length; i++){
            set.add(i);
        }

        for(int num: nums){
            set.remove(num);
        }

        for(int num : set){
            list.add(num);
        }

        return list;
    }
}