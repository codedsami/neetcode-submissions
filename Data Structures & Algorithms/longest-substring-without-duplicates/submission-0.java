class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqueChar = new HashSet<>();

        int leftPtr = 0;
        int maxLen = 0;

        for(int rightPtr = 0; rightPtr < s.length(); rightPtr++){
            while(uniqueChar.contains(s.charAt(rightPtr))){
                uniqueChar.remove(s.charAt(leftPtr));
                leftPtr++;
            }
            uniqueChar.add(s.charAt(rightPtr));
            maxLen = Math.max(maxLen, rightPtr - leftPtr + 1);
        }
        return maxLen;
    }
}
