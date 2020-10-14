package my_linked_list;
/*
 author Bohdan Hnatusiv
 10.10.2020
 */
public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size() ;
    E getElementByIndex(int counter);

}
