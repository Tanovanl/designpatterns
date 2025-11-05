package behavioural.iterator;

public interface Iterator<T> {
    boolean moveNext();
    T current();
    void reset();
}
