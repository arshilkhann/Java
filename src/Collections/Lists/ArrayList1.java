package Collections.Lists;
// We cannot create an object of Interface in Java
// We had to create class object only


/*                          Collection Interface     //Parent Interface
 *                                     |
 *                             ------------------------------------------------------
 *                             |                                                    |
 *                           List // Child Interface             {Queue , Map , Set , etc} //Other Child Interface
 *                             | // implementations
 *                       1. ArrayList  |
 *                       2. LinkedList |
 *                                      } classes
 *                       3. Stack      |
 *                       4. Vector     |
 * */

import java.util.*;
public class ArrayList1 {
    public static void main(String[] args){
        List<Integer> list  = new ArrayList<>(); // ArrayList class has implemented List interface

        // ArrayList are Dynamic in size, it can change size ,not fixed like Arrays.

        // adding elements in list we used "list.add()"
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); //[10, 20, 30]

        //for getting size of array list we use list.size()
        System.out.println(list.size()); //3


        //for checking element is present in list we use list.contains(no to check)
        System.out.println(list.contains(30)); //true
        System.out.println(list.contains(100)); //false


        //for removing elemnt from list we use

        // list.remove(Object)-> for removing single instance of particular element from collection if it is present
        list.remove(Integer.valueOf(10));
        System.out.println(list); //remove 10  [20, 30]

        // list.remove(index)->for removing an element from collection through its index
        list.remove(1);
        System.out.println(list); //remove 30  [20]


        //list.removeAll()-> remove All list elements
        list.removeAll(list);
        System.out.println(list); //remove all elements []


        //More Collection Interface Methods

        // list.isEmpty(); -> returns true if empty otherwise false
        // list.containsAll( collection c ) -> returns true if the collection contains all element from the specified collection c
        // list.addAll(collection c) -> Adds all element from the specified collection c to the collection
        // list.removeAll(collection c) -> Removes all element from the collection that are also contains in specified collection c
        // list.retainAll(collection c) -> Remove all element from the collection that are not present in specified collection c
        // void clear() -> Remove all element from the collection
        // list.toArray() -> Returns an Array containing all elements in the collection
    }
}
