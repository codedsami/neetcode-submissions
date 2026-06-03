class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      // create an array with k elements
      int[] result = new int[k];

      // create an map to count frequency
      HashMap<Integer, Integer> freq = new HashMap<>();

      for(int num: nums){
        //if exists, incement count
        freq.merge(num, 1, Integer::sum);
      }

      
      // Create a Max-Heap PriorityQueue based on the map's values (counts)
      // (b.getValue() - a.getValue()) places the highest count at the head
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
          (a, b) -> freq.get(b) - freq.get(a)
      );

      //add all the entries from map
      maxHeap.addAll(freq.keySet());

      for(int i = 0; i<k ; i++){
        result[i] = maxHeap.poll();
      }

      return result;


    }
}
