    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode temp = new DoublyLinkedListNode(data);
        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode prev = null;

        if(head == null)
        {
            head = temp;
            return head;
        }

        while(curr != null && curr.data < temp.data)
        {
            prev = curr;
            curr = curr.next;
        }

        if(prev == null)
        {
            temp.next = curr;
            temp.prev = null;
            head = temp;
        }

        else 
        {
            prev.next = temp;
            temp.next = curr;
            temp.prev = prev;

        }


    return head;    
    } 