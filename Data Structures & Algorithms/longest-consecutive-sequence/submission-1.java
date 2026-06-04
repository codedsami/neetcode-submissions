class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       // add all elements in set for quick lookup
       for(int num : nums){
        set.add(num);
       }

        int maxSeq = 0;
       
       //iterate through the array and only consider counting if num-1 does not exist
       for(int num : set) {
            // only start counting from beginning of sequence
            if(!set.contains(num - 1)) {
                int current = num;
                int currSeq = 1;

                while(set.contains(current + 1)) {
                    current++;
                    currSeq++;
                }

                maxSeq = Math.max(maxSeq, currSeq);
            }
        }

       return maxSeq;




    }
}
