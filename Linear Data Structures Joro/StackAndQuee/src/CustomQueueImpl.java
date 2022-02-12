import java.util.LinkedList;
import java.util.List;

public class CustomQueueImpl<E> implements CustomQueue {

    private List<E> queue = new LinkedList<>();
    private int size = 0;


    @Override
    public void add(Object element) {
        queue.add((E) element);
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object peek() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }

        return queue.get(0);
    }

    @Override
    public Object poll() {
        if (size == 0) {
            throw new IndexOutOfBoundsException();
        }
        size--;
        return queue.remove(0);
    }
}
