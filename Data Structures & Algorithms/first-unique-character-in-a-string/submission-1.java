class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0){return -1;}
        if(s.length() == 1){return 0;}

        HashMap<Character, Integer> frq = new HashMap<>();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            frq.put(ch, frq.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(frq.get(ch) == 1){
                return i;
            }
        }

        return -1;
        //O(n)
        //O(n)
    }
}