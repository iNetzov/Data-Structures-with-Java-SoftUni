public interface CustomQueue<E> {
    void add(E element);
    int size();
    E peek();
    E poll();
}
