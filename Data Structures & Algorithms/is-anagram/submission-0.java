class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        
        int[] freq_array = new int[26];

        for(int i=0; i < s.length(); i++){
            freq_array[s.charAt(i) - 'a']++;
            freq_array[t.charAt(i) - 'a']--;
        }

        for(int count : freq_array){
            if(count != 0){
                return false;
            }
        }

        return true;

    }
}
