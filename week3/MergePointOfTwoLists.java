
 https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem

 static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {


    SinglyLinkedListNode currentA = head1;
    SinglyLinkedListNode currentB = head2;


    while(currentA != currentB){
      
        if(currentA.next == null){
            currentA = head2;
        }else{
            currentA = currentA.next;
        }
    
        if(currentB.next == null){
            currentB = head1;
        }else{
            currentB = currentB.next;
        }
    }
    return currentB.data;
   }