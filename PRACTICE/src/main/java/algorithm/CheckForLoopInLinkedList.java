package algorithm;

public class CheckForLoopInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;  // create a loop

        System.out.println("Cycle detected: " + hasCycle(head));  // Will output: Cycle detected: true
    }

    public static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;            // move by one step
            fastPointer = fastPointer.next.next;       // move by two steps

            if (slowPointer == fastPointer) {          // If the pointers meet, there is a cycle
                return true;
            }
        }
        return false;  // If you reach the end of the list, there is no loop
    }
}

class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
