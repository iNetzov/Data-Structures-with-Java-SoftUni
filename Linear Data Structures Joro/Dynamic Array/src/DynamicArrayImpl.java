import java.util.NoSuchElementException;

public class DynamicArrayImpl<E>{

    private Object[] elements = new Object[1];
    private int size = 0;


    boolean add(E element) {
        elements[size] = element;
        size++;
        growArray();
        return true;
    }

    E get(int index) {
      checkIndex(index);
      return (E) elements[index];
    }

    E set(int index, E element) {
        checkIndex(index);
        elements[index] = element;
        return element;
    }

    E remove(int index) {
        checkIndex(index);
       E removedElement = (E)elements[index];
        for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    int size() {
        return this.size;
    }



    private void checkIndex(int index){
        if (index >= size && index < 0 ){
            throw new IndexOutOfBoundsException();
        }

    }

    private void growArray(){
        if (size >= elements.length){
            Object[] newElements = new Object[size * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            this.elements = newElements;
        }
    }

}
