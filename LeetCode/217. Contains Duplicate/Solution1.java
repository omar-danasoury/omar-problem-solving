import java.util.HashMap;
/* 
* Omar Eldanasoury
* Runtime: 9 ms
* Memory Usage: 70 MB
*
* time complexity of the solution: O(n)
* space complexity of the solution: O(n)
*/
class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // loop through the elements and add them to a hash table
        for(int x : nums){
            // if at any given moment the value exits in the map, return true
            if(map.containsKey(x))
                return true;
            
            map.put(x, 1);
        }
        
        return false;
        
    }
  
}
