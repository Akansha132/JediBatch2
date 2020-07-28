https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem 



   static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

         DoublyLinkedListNode temp = head.next;
         head.next = head.prev;
         head.prev = temp;
         if(temp == null)
             return head;
         return reverse(temp);
    }


   
