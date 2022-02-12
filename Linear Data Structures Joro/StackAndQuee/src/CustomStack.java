public interface CustomStack<E> {
     int size();
     boolean isEmpty();
     void push(E element);
     E pop();
     E peek();
}
