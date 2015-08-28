
/**
 *  This class is a generic queue for saving beans and bean stats setup objects.
 * Source: http://eddmann.com/posts/implementing-a-queue-in-java-using-arrays-and-linked-lists/
 */

public class Queue<T> {
    private int total;
    private Node first, last;

    /**
     * This class is for node objects, it contains an element and a reference to the next node.
     */
    private class Node {
        private T ele;
        private Node next;
    }

    /**
     * A constructor for the queue class.
     */
    public Queue() {
    }

    /**
     * Adds elements to the queue. Creates a current node, makes a new last node, and ads an element to it.
     */
    public Queue<T> enqueue(T ele) {
        Node current = last;
        last = new Node();
        last.ele = ele;
        if (total++ == 0) first = last;
        else current.next = last;

        return this;
    }

    /**
     * Removes an element from the queue. Check if queue is empty, gets the first element, moves the first element,
     * returns the element.
     */
    public T dequeue() {
        if (total == 0) throw new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        if (--total == 0) last = null;

        return ele;
    }

    /**
     * Checks if queue is empty.
     *
     */
    public boolean isEmpty() {
        return first == null;
    }
}
