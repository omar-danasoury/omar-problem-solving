# Move Last Element to Front of a Linked List
## Problem Description
You are given the head of a Linked List. You have to move the last element to the front of the Linked List and return the list.
### Example 1:
```
Input:
N = 5
List = {2,5,6,2,1}
Output:
{1,2,5,6,2}
Explanation:
In the given linked list, the last element is 1,
after moving the last element to the front the
linked list will be {1,2,5,6,2}.
 ```

### Example 2:
```
Input:
N = 1
List = {2}
Output:
{2}
Explanation:
Here 2 is the only element so, the linked list
will remain the same.
```

### Your Task:
You don't need to read input or print anything. Your task is to complete the function moveToFront() which takes the address of the head of the linked list and returns the modified linked list.
- Expected Time Complexity: O(N)
- Expected Auxiliary Space: O(1)

### Constraints:
- 1 <= N <= 105
- 0 <= Elements of List <= 109
Sum of N over all test cases doesn't exceeds 106

## My Solution
### The Algorithm
First, if the linked list is empty, `null` will be returned. Second, if the linked list has only one element, `head` will be returned.
Finally, if the linked list has more than one element, then:
- `firstLast` node will be initialized and point to `head`.
- `secondLast` will be initialized, and point to `null`.
- while `firstLast.next != null`, move `firstLast` and `secondLast` so at the end of the loop: `firstLast` will point to the last node, and `secondLast` will point to the node before it.
- After that, `firstLast.next` should reference `head`.
- Then, `secondLast.next` should reference `null` - so it becomes the last node in the linked list.
- Finally, the `head` variable should reference now `firstLast` - so `firstLast` become the first node in the linked list. 
