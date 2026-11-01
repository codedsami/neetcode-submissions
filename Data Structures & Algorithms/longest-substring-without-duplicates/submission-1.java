class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> LastSeen = new HashMap<>();

        int leftPtr = 0;
        int maxLen = 0;

        for(int rightPtr = 0; rightPtr < s.length(); rightPtr++){

            char c = s.charAt(rightPtr);

            if(LastSeen.containsKey(c) && LastSeen.get(c) >= leftPtr){
                leftPtr = LastSeen.get(c) + 1;
            }

            LastSeen.put(c, rightPtr);

            maxLen = Math.max(maxLen, rightPtr - leftPtr + 1);
        }
        return maxLen;
    }
}
