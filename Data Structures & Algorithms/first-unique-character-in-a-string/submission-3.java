class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!count.containsKey(c)) {
                count.put(c, i);
            } else {
                count.put(c, n); //not unique anymore
            }
        }

        int res = n;
        for (int index : count.values()) { //save us from going thru the word again
            res = Math.min(res, index);
        }

        return res == n ? -1 : res;
        //O(n) -time
        //O(1) == 26 spaces
    }
}