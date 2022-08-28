/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

// Omar Eldanasoury, github: omar-danasoury
class Solution {
    public static Node moveToFront(Node head) {
        // code here
        // if the list is empty
        if(head == null)
        return null;
        
        // if the list has only one element
        if(head.next == null)
        return head;
        
        // if the list has many elements
        // initialize firstLast, and secondLast
        Node firstLast = head, secondLast = null;
        
        // loop throught the list until firstLast references the last node\
        // and secondLast references the node before it
        while(firstLast.next != null){ // firstLast.next != null is chosen because
        // we want to end with firstLast to be exactly at the last node
            secondLast = firstLast;
            firstLast = firstLast.next;
        } 
        
        //once we reach our distination:
        // 1) set firstLast.next to reference head
        firstLast.next = head;
        
        // 2) set secondLast.next to be null (so it will become the last node)
        secondLast.next = null;
        
        // 3) set the head pointer to reference firstLast node
        head = firstLast;
        
        // at the end
        return head;
    }
}
