# 217. Contians Duplicate
## Problem Describtion
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

### Example 1:
Input: nums = [1,2,3,1]
Output: true
### Example 2:
Input: nums = [1,2,3,4]
\nOutput: false

### Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

### Constraints:
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## My Solution Approach
At first, I thought about using a HashMap to solve this problem. the elements of the array will be inserted into the HashMap, and then iterate through the values for each key. If a value is not equal to 1, the method returs false.

However, I noticed that checking the values after inserting them will take more time. Hence, this approached is can be optimized by only checking if an element exists in the HaspMap before inserting it. If it exists, then the method will return false.

### Code
The code for this solution is written below in Java(Solution1.java):
```
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
```
### Solution 1 Analysis
- The code had a **Runtime of 9ms**, and used **70 MB of Memory**.
- Time Complexity **O(n)**.
- Space Complexity **O(n)**.

### Remarks:
The same approach was implemented again but using a HashSet instead of a HashMap (Check Solution2.java) with the same time and space complexity. The code was accepted with a **Runtime of 5ms**, and used **50.8 MB of Memory**. I searched online and found [this article](https://www.geeksforgeeks.org/internal-working-of-sethashset-in-java/) which explains the internal work of a HashSet. I found that a HashSet is using a HashMap inside the class. Moreover, I was wondering why the second code ran in a less significant time at first. However, when running it again it had a **Runtime of 11ms** and had a closer memory usage to solution 1 as it seems that the runtime is not accurate enough. To sum up, there is no actual difference between the 2 solutions.
