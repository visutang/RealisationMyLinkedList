package linked_list;
/*
 author Bohdan Hnatusiv
 14.10.2020
 */

import java.util.Iterator;
import java.util.LinkedList;

public class SportsMainLinkedList<E> extends MyLink<E> {

    public static void main(String[] args) {
        //create object sportsLinkedList
        LinkedList<Sports> sportsLinkedList = new LinkedList<>();

        //create objects  of class Sports
        Sports sport1 = new Sports("Jim");
        Sports sport2 = new Sports(" Crossfit");
        Sports sport3 = new Sports("Hockey");
        Sports sport4 = new Sports(" Run");
        Sports sport5 = new Sports("Football");
        Sports sport6 = new Sports("Run");

        // add objects of class Sports into sportsLinkedList, as  first and last elements
        sportsLinkedList.addFirst(sport1);
        sportsLinkedList.addLast(sport6);
        sportsLinkedList.addFirst(sport2);
        sportsLinkedList.addFirst(sport1);
        sportsLinkedList.addLast(sport2);
        sportsLinkedList.addLast(sport3);
        sportsLinkedList.addLast(sport4);
        sportsLinkedList.addLast(sport5);
        sportsLinkedList.addLast(sport6);
        sportsLinkedList.addLast(sport4);

        // output first and last elements, and size  the list
        System.out.println(" First element  of sportsLinkedList  is   " + sportsLinkedList.getFirst());
        System.out.println(" Last element  of sportsLinkedList  is   " + sportsLinkedList.getLast());
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());

        //Inserts the  element at the  and last  of  the list .
        // output first and last elements, and size  the list
        sportsLinkedList.offerFirst(sport2);
        sportsLinkedList.offerLast(sport3);
        System.out.println(" First element  of sportsLinkedList  is   " + sportsLinkedList.getFirst());
        System.out.println(" Last element  of sportsLinkedList  is   " + sportsLinkedList.getLast());
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());


        // output all elements of sportsLinkedList with  use class Iteration and it's methods
        System.out.println(" All elements  of sportsLinkedList  with  help  Iterator : ");
        Iterator sportsIterator = sportsLinkedList.iterator();
        while (sportsIterator.hasNext()) {
            System.out.print(sportsIterator.next() + " ; ");
        }
        System.out.println();
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());

        // use methods  removeFirst() and removeLast(), and test size , and new fist
        //element , and new last element
        sportsLinkedList.removeFirst();
        sportsLinkedList.removeLast();
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());
        System.out.println(" First element  of sportsLinkedList  is   " + sportsLinkedList.getFirst());
        System.out.println(" Last element  of sportsLinkedList  is   " + sportsLinkedList.getLast());

        // use   methods for retrieve and remove  first element and last element ,and  test size ,
        // and new fist element , and new last element
        System.out.println(" First element  of sportsLinkedList  is   " + sportsLinkedList.pollFirst());
        System.out.println(" Last element  of sportsLinkedList  is   " + sportsLinkedList.pollLast());
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());
        System.out.println("  New  first element  of sportsLinkedList  is   " + sportsLinkedList.getFirst());
        System.out.println("New  last element  of sportsLinkedList  is   " + sportsLinkedList.getLast());

        //  use methods for  retrieve, but does not remove, the first element and  last element,
        //and and  test size ,and get fist element , and get last element
        System.out.println(" First element  of sportsLinkedList  is   " + sportsLinkedList.peekFirst());
        System.out.println(" Last element  of sportsLinkedList  is   " + sportsLinkedList.peekLast());
        System.out.println("Size of  sportsLinkedList   =  " + sportsLinkedList.size());
        System.out.println("  New  first element  of sportsLinkedList  is   " + sportsLinkedList.getFirst());
        System.out.println("New  last element  of sportsLinkedList  is   " + sportsLinkedList.getLast());

        //   use  methods for to remove the first occurrence of the specified element and
        // last occurrence of the specified element,and test size ,and output all elements of sportsLinkedList with
        // use class Iteration and it's methods
        System.out.println("Size of  sportsLinkedList before removeFirstOccurrence  and removeLastOccurrence " +
                "  =  " + sportsLinkedList.size());
        System.out.println(" All elements  of  sportsLinkedList before removeFirstOccurrence  " +
                "and removeLastOccurrence  : ");
        Iterator sportsIterator1 = sportsLinkedList.iterator();
        while (sportsIterator1.hasNext()) {
            System.out.print(sportsIterator1.next() + " ;  ");
        }
        System.out.println();
        sportsLinkedList.removeFirstOccurrence(sport2);
        sportsLinkedList.removeLastOccurrence(sport4);
        System.out.println("Size of  sportsLinkedList  after removeFirstOccurrence  " +
                "and removeLastOccurrence =  "
                + sportsLinkedList.size());
        System.out.println(" All elements of  sportsLinkedList after removeFirstOccurrence " +
                " and removeLastOccurrence  : ");
        Iterator sportsIterator2 = sportsLinkedList.iterator();
        while (sportsIterator2.hasNext()) {
            System.out.print(sportsIterator2.next() + "|;|");
        }
        System.out.println();

        // use method add of the specified element at last list, and test size ,and output all
        // elements of sportsLinkedList
        sportsLinkedList.offer(sport3);
        System.out.println("Size of  sportsLinkedList after .offer()  =  " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .offer() : ");
        Iterator sportsIterator3 = sportsLinkedList.iterator();
        while (sportsIterator3.hasNext()) {
            System.out.print(sportsIterator3.next() + " ;/ ");
        }
        System.out.println();

        // use method for  retrieve and remove the head (first element) and output all
        //  elements of sportsLinkedList
        System.out.println(" Retriever and remover  first element  of " +
                "the list. It  is  :  " + sportsLinkedList.remove());
        System.out.println("Size of  sportsLinkedList after .remove() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .remove() : ");
        Iterator sportsIterator4 = sportsLinkedList.iterator();
        while (sportsIterator4.hasNext()) {
            System.out.print(sportsIterator4.next() + " /;/ ");
        }
        System.out.println();

        // use  method  .poll()  for to  retrieve and to  remove first element and output all
        //  elements of sportsLinkedList
        System.out.println(" Retriever and remover  first element  of " +
                "the list. It  is  :  " + sportsLinkedList.poll());
        System.out.println("Size of  sportsLinkedList after .poll() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .poll() : ");
        Iterator sportsIterator5 = sportsLinkedList.iterator();
        while (sportsIterator5.hasNext()) {
            System.out.print(sportsIterator5.next() + " /;/ ");
        }
        System.out.println();

        // use method ( .element()) to  retrieve, but do not remove,  first element and output all
        //  elements of sportsLinkedList
        System.out.println(" Retriever   first element  of the list. It  is  :  " + sportsLinkedList.element());
        System.out.println("Size of  sportsLinkedList after .element() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .element() : ");
        Iterator sportsIterator6 = sportsLinkedList.iterator();
        while (sportsIterator6.hasNext()) {
            System.out.print(sportsIterator6.next() + " ; ");
        }
        System.out.println();

        //  use method ( .peek()) to  retrieve, but do not remove,  first element and output all
        //  elements of sportsLinkedList
        System.out.println(" Retriever   first element ( use method  .peek()) of the list. It  is  :  "
                + sportsLinkedList.peek());
        System.out.println("Size of  sportsLinkedList after .peek() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .peek() : ");
        Iterator sportsIterator7 = sportsLinkedList.iterator();
        while (sportsIterator7.hasNext()) {
            System.out.print(sportsIterator7.next() + " ;|| ");
        }
        System.out.println();

        //use method ( .push(E e()) to push  element into the stack and output all elements of the list
        sportsLinkedList.push(sport1);
        System.out.println("Size of  sportsLinkedList after .push() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .push(sport1) : ");
        Iterator sportsIterator8 = sportsLinkedList.iterator();
        while (sportsIterator8.hasNext()) {
            System.out.print(sportsIterator8.next() + " ; ");
        }
        System.out.println();

        // use method (.pop()) to  retrieve and remove first element from the stack of this
        // list( equivalent .removeFirst()), and output all elements of the list
        System.out.println("Retrieve and remover first element  of the stack  is  :  " + sportsLinkedList.pop());
        System.out.println("Size of  sportsLinkedList after .pop() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .pop() : ");
        Iterator sportsIterator9 = sportsLinkedList.iterator();
        while (sportsIterator9.hasNext()) {
            System.out.print(sportsIterator9.next() + "  ; ");
        }
        System.out.println();

        // use  method    . descendingIterator()(class DescendingIterator implements Iterator<E>)
        // for to  revers  all elements the
        System.out.println("Size of  sportsLinkedList after .descendingIterator() =    " + sportsLinkedList.size());
        System.out.println(" All elements  of sportsLinkedList after .descendingIterator() : ");
        Iterator descendingIterator = sportsLinkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ; ");
        }
        System.out.println();
    }
}
