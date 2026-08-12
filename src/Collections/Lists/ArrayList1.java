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

        // list.remove(Object)->for removing object
        list.remove(Integer.valueOf(10));
        System.out.println(list); //remove 10  [20, 30]

        // list.remove(index)->for removing particular element
        list.remove(1);
        System.out.println(list); //remove 30  [20]


        //list.removeAll()-> remove All list elements
        list.removeAll(list);
        System.out.println(list); //remove all elements []
    }
}
