/* 
* Omar Eldanasoury
* Runtime: 5 ms
* Memory Usage: 50.8 MB
*
* time complexity of the solution: O(n)
* space complexity of the solution: O(n)
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        // loop through the elements and add them to a HashSet
        for(int x : nums)
            // if at any given moment the value exits in the Set [set.add() returns false], return true
            if(!set.add(x))
                return true;
     
        return false;
    }
}
