package my_linked_list;
/*
 author Bohdan Hnatusiv
 10.10.2020
 */

import java.util.Iterator;

public class MainLinkedContainer {
    public static void main(String[] args) {

        // create object stringLinked
        LinkedContainer<String> stringLinked = new LinkedContainer<>();

        // output size of stringLinked, add elements and output size
        System.out.println("Size of stringLinked  =   " + stringLinked.size());
        stringLinked.addLast(" NightWish");
        stringLinked.addLast("Scorpion");
        stringLinked.addFirst("Queen");
        stringLinked.addLast(" Genenis ");
        stringLinked.addFirst("Metalica");
        System.out.println("Size of stringLinked  =   " + stringLinked.size());

        //output All element with  use operator foreach
        System.out.println("All elements of stringLinked  : ");
        for (String str : stringLinked) {
            System.out.print(str + "  ;  ");
        }
        System.out.println();

        //output All element with  use class Iterator
        System.out.println("All elements of stringLinked(  with use method descendingIterator() : ");
        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ; ");

        }
        System.out.println();

         // use method for output elements by index
        System.out.println("Element with index " + 0 + "  is  " + stringLinked.getElementByIndex(0));
        System.out.println("Element with index " + 1 + "  is  " + stringLinked.getElementByIndex(1));
        System.out.println("Element with index " + 2 + "  is  " + stringLinked.getElementByIndex(2));
        System.out.println("Element with index " + 3 + "  is  " + stringLinked.getElementByIndex(3));
        System.out.println("Element with index " + 4 + "  is  " + stringLinked.getElementByIndex(4));

        System.out.println("Size of stringLinked  =   " + stringLinked.size());

        System.out.println();

        // create object statesLinkedContainer
        LinkedContainer<States> statesLinkedContainer = new LinkedContainer<>();


        // create objects of class States
        States state1 = new States("Ukraine");
        States state2 = new States("USA");
        States state3 = new States("Poland");
        States state4 = new States("German");
        States state5 = new States("Ukraine");

        // output size of statesLinkedContained, add elements and output size
        System.out.println("Size of statesLinkedContainer  =   " + statesLinkedContainer.size());
        statesLinkedContainer.addLast(state2);
        statesLinkedContainer.addFirst(state4);
        statesLinkedContainer.addFirst(state1);
        statesLinkedContainer.addFirst(state3);
        statesLinkedContainer.addLast(state5);
        statesLinkedContainer.addFirst(state2);
        System.out.println("Size of statesLinkedContainer  =   " + statesLinkedContainer.size());

        //output All element with  use operator foreach
        System.out.println("All elements of statesLinkedContainer  : ");
        for (States state : statesLinkedContainer) {
            System.out.print(state  + "  ; ");
        }
        System.out.println();

        //output All element with  use class Iterator
        System.out.println("All elements of stringLinked(  with use method descendingIterator() : ");
        Iterator iterator1 = statesLinkedContainer.descendingIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()  +  "  ;  " );

        }
        System.out.println();

        // use method for output elements by index
        System.out.println("Element with index " + 0 + "  is  " +statesLinkedContainer.getElementByIndex(0));
        System.out.println("Element with index " + 1 + "  is  " +statesLinkedContainer.getElementByIndex(1));
        System.out.println("Element with index " + 2 + "  is  " +statesLinkedContainer.getElementByIndex(2));
        System.out.println("Element with index " + 3 + "  is  " +statesLinkedContainer.getElementByIndex(3));
        System.out.println("Element with index " + 4 + "  is  " +statesLinkedContainer.getElementByIndex(4));
        System.out.println("Element with index " + 5 + "  is  " +statesLinkedContainer.getElementByIndex(5));
    }
}