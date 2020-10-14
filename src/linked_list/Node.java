package linked_list;

/*
 author Bohdan Hnatusiv
 14.10.2020
 */
public class Node<E> {
    public Node prev;
    public Node<E> next;
    public E item;
    private Node<E> e;


    public Node(Node<E> e, Node<E> prev, Node<E> next) {
        this.e = e;
        this.prev = prev;
        this.next = next;
    }


    public Node<E> getE() {
        return e;
    }

    public void setE(Node<E> e) {
        this.e = e;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}

