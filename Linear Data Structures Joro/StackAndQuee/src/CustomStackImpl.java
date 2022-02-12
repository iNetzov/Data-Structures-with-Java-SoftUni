import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomStackImpl<E> implements CustomStack {

    private List<E> arrayList = new LinkedList<>();
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0){
            return true;
        }
        return false;
    }

    @Override
    public void push(Object element) {
        arrayList.add((E) element);
        size++;
    }

    @Override
    public Object pop() {
        if (size == 0){
            throw new IndexOutOfBoundsException();
        }
        E element = arrayList.get(size - 1);
        arrayList.remove(size-1);
        size--;
        return element;
    }

    @Override
    public Object peek() {
        if (size == 0){
            throw new IndexOutOfBoundsException();
        }
        E element = arrayList.get(size - 1);
        return element;
    }
}
