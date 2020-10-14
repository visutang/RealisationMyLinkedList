package linked_list;
/*
 author Bohdan Hnatusiv
 14.10.2020
 */
import java.util.*;
import java.util.function.Consumer;

public class MyLink<E> extends LinkedList<E> {

    //   create  fields for  pointers of node to  and size
    int size = 0;
    private Node<E> first;
    private Node<E> last;

    // create method add  first element into MyLink
    public void addFirst(E e) {
        Node fst = first;
        Node newNode = new Node<E>(null, (Node<E>) e, fst);
        first = newNode;
        if (fst == null)
            last = newNode;
        else
            fst.prev = newNode;
        size++;
        modCount++;
    }

    // create method add  last element into MyLink
    public void addLast(E e) {
        Node<E> lst = last;
        Node<E> newNode = new Node<E>(lst, (Node<E>) e, null);
        last = newNode;
        if (lst == null)
            first = newNode;
        else
            ((Node<E>) lst).next = newNode;
        size++;
        modCount++;
    }

    //insert the  element at the front of  MyLink
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    //insert the  element at the last of  MyLink
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    //create methods unlink for use in method remove
    //for unlinkFirst(assert fst == first && fst != null)
    private E unlinkFirst(Node<E> fst) {
        E element = fst.item;
        Node<E> next = fst.next;
        fst.item = null;
        fst.next = null;
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }

    // for unlinkLast (  lst == last && lst != null 0
    private E unlinkLast(Node<E> lst) {
        E element = lst.item;
        Node<E> prev = lst.prev;
        lst.item = null;
        lst.prev = null;
        last = prev;
        if (prev == null)
            first = null;
        else
            prev.next = null;
        size--;
        modCount++;
        return element;
    }

    // for  everything item of the list
    E unlink(Node<E> any) {
        E element = any.item;
        Node<E> next = any.next;
        Node<E> prev = any.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            any.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            any.next = null;
        }

        any.item = null;
        size--;
        modCount++;
        return element;
    }

    //  method  for remove and return the first element
    public E removeFirst() {
        Node<E> fst = first;
        if (fst == null)
            throw new NoSuchElementException();
        return unlinkFirst(fst);

    }

    //  method  for remove and return the last element
    public E removeLast() {
        Node<E> lst = last;
        if (lst == null)
            throw new NoSuchElementException();
        return unlinkLast(lst);
    }

    // methods for retrieve and remove  first element
    public E pollFirst() {
        Node<E> fst = first;
        return (fst == null) ? null : unlinkFirst(fst);
    }

    // methods for retrieve and remove  last element
    public E pollLast() {
        Node<E> lst = last;
        return (lst == null) ? null : unlinkLast(lst);
    }

    // method for get  first element
    public E getFirst() {
        Node<E> fst = first;
        if (fst == null)
            throw new NoSuchElementException();
        return fst.item;
    }

    // method for get  last element
    public E getLast() {
        Node<E> lst = last;
        if (lst == null)
            throw new NoSuchElementException();
        return lst.item;
    }

    // method for  retrieve, but does not remove, the first element
    public E peekFirst() {
        Node<E> fst = first;
        return (fst == null) ? null : fst.item;
    }

    // method for  retrieve, but does not remove, the last element
    public E peekLast() {
        Node<E> lst = last;
        return (lst == null) ? null : lst.item;
    }

    //  method for retrieve and remove the head (first element)
    public E remove() {
        return removeFirst();
    }

    // method for to remove the first occurrence of the specified element
    public boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            for (Node<E> any= first; any != null; any = any.next) {
                if (any.item == null) {
                    unlink(any);
                    return true;
                }
            }
        } else {
            for (Node<E> any = first; any != null; any = any.next) {
                if (obj.equals(any.item)) {
                    unlink(any);
                    return true;
                }
            }
        }
        return false;
    }

    // method for to remove the last occurrence of the specified element
    public boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            for (Node<E> any = last; any != null; any = any.prev) {
                if (any.item == null) {
                    unlink(any);
                    return true;
                }
            }
        } else {
            for (Node<E> any = last; any != null; any = any.prev) {
                if (obj.equals(any.item)) {
                    unlink(any);
                    return true;
                }
            }
        }
        return false;
    }

    //method to add the specified element to last element the  list
    public boolean offer(E e) {
        addLast(e);
        return true;
    }

    // method  to retrieve and to  remove the head (first element)
    public E poll() {
        Node<E> fst = first;
        return (fst == null) ? null : unlinkFirst(fst);
    }

    // method to  retrieve, but do not remove,  first element
    public E element() {

        return getFirst();
    }

    //method to  retrieve, but do not remove,  first element
    public E peek() {
        Node<E> fst = first;
        return (fst == null) ? null : fst.item;
    }

    //method to push  element into the stack
    public void push(E e) {

        addFirst(e);
    }

    //method to pop an element from the stack
    public E pop() {
        return removeFirst();
    }

    //method  to return the number of elements in this list
    public int size() {

        return size;
    }


    //    method for return the (non-null) Node at the specified element index
    // use in class ListItr implements ListIterator<E>
    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> any = first;
            for (int i = 0; i < index; i++)
                any = any.next;
            return any;
        } else {
            Node<E> any = last;
            for (int i = size - 1; i > index; i--)
                any = any.prev;
            return any;
        }
    }


    //  method  to insert element e before non-null Node successful.
    void linkBefore(E e, Node<E> success) {
        // if declare success != null;
        Node<E> pred = success.prev;
        Node<E> newNode = new Node<E>(pred, (Node<E>) e, success);
        success.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    //method to  return a list-iterator of the elements in this list
    public ListIterator<E> listIterator(int index) {
        get(index);
        return new ListItr(index);
    }

    //create class ListItr  and implements ListIterator
    private class ListItr implements ListIterator<E> {
        Node<E> lastReturned;
        Node<E> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        ListItr(int index) {
            // if declare isPositionIndex(index);
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public E next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public E previous() {
            checkForComodification();
            if (!hasPrevious())
                throw new NoSuchElementException();

            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            checkForComodification();
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount++;
        }

        public void set(E e) {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();
            lastReturned.item = e;
        }

        public void add(E e) {
            checkForComodification();
            lastReturned = null;
            if (next == null)
                addLast(e);
            else
                linkBefore(e, next);
            nextIndex++;
            expectedModCount++;
        }

        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            while (modCount == expectedModCount && nextIndex < size) {
                action.accept(next.item);
                lastReturned = next;
                next = next.next;
                nextIndex++;
            }
            checkForComodification();
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

       //create class DescendingIterator  and implements Iterator
    private class DescendingIterator implements Iterator<E> {
        ListItr itr = new ListItr(size());

        public boolean hasNext() {
            return itr.hasPrevious();
        }

        public E next() {
            return itr.previous();
        }

        public void remove() {
            itr.remove();
        }
    }

    // to  create method    descendingIterator()
    public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }


}



