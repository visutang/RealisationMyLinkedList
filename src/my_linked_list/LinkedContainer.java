package my_linked_list;
/*
 author Bohdan Hnatusiv
 10.10.2020
 */
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

// create  your own class( by analogy class LinkedList
public class LinkedContainer<E> implements Linked<E>,Iterable<E>,DescendingIterator<E>{

    // begin  create fields for firstNode and lastNode
    // null<- prevElement[firstNode(el =null)]nextElement->        <-prevElement[lastNode(el= null)]nextElement-> null
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    //   create constructor for firstNod and lastNode
    public LinkedContainer() {
        lastNode = new Node<E>(null, firstNode, null);
       firstNode = new Node<E>(null, null, lastNode);
    }

     //create realisation few methods
    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;// for storage
        prev.setCurrentElement(e);//
        lastNode = new Node<E>(null,prev,null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode; // for storage
        next.setCurrentElement(e);
        firstNode = new Node<E>(null,null,next);
        next.setPrevElement(firstNode);
        size++;

    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i=0; i< counter; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    //create method return current.getNextElement
    private Node<E> getNextElement( Node<E>  target){
        return target.getNextElement();
    }

    @NotNull
    @Override
    //realisation method iterator() wish help anonymous class
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter =0;

            @Override
            public boolean hasNext() {

                return counter <size   ;
            }

            @Override
            public E next() {

                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    //realisation method descendingIterator() wish help anonymous class
    //but revers
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter =size-1;
            @Override
            public boolean hasNext() {
                return  counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }

    // create  build-in class (by analogy class Node (java-documents))
    public class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        //create constructor and Getters and Setters
        public Node(E currentElement, Node<E> prevElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }


        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }
    }
}
