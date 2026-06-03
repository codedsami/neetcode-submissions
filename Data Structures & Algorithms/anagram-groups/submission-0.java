class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> wordToList = new HashMap<>();

        for(String actualWord : strs){
            //sort each word
            char[] charArr = actualWord.toCharArray();
            Arrays.sort(charArr);

            //convert the sorted word to a string now, to put it in the Map as a key
            String keyWord = new String(charArr);

            //if the sorted key does not exist, add it
            wordToList.putIfAbsent(keyWord, new ArrayList<>());
            
            //now add the actual word in the list correspponding to the keyword
            wordToList.get(keyWord).add(actualWord);
        }

        //now return the arrayList thats the values of the map
        return new ArrayList<>(wordToList.values());
    }
}
