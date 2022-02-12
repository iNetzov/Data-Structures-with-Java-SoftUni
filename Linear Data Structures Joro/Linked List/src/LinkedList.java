public class LinkedList<E> {
    private E value;
    private Node<E> head;
    private Node<E> tail;
    private int size;


    public Node<E> getHead() {
        return head;
    }

    public void add(E element) {
        Node<E> newNode = new Node<>(element, null, tail);
        if (head == null) {
            head = newNode;
        }
        if (tail != null) {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;

    }

    public void remove(Node<E> node) {
        if (head == node){
            head = node.getNext();
        }
        if (tail == node){
            tail = node.getPrevious();
        }

        if (node.getPrevious() != null) {
            Node<E> previous = node.getPrevious();
            previous.setNext(node.getNext());
        }
        if (node.getNext() != null) {
            Node<E> next = node.getNext();
            next.setPrevious(node.getPrevious());
        }
        size--;
    }

    public int getSize() {
        return size;
    }
}
