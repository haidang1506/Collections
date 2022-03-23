/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan5_Collections;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Dell
 */
public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<>();
        
        car.add("BMW");
        car.add("Mercedes");
        
        //them phan tu bang ListIterator
        ListIterator li = car.listIterator();
        li.add("Audi");
        
        System.out.println("Initial LinkedList: ");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        //truy cap nguoc
        System.out.println("Reversed LinkedList: ");
        while(li.hasPrevious()){
            System.out.println(li.previousIndex()+" - "+li.previous());
        }
        
        //li.set();
        //li.remove();
        
        //-------------------------------
        //Cac chuc nang Deque va Queue
        car.addFirst("Toyota");
        car.addLast("Tesla");
        System.out.println("Car LinkedList Updated: "+car);
        System.out.println("First Element: "+car.getFirst());
        System.out.println("Last Element: "+car.getLast());
        
        //poll tra ve va loai bo phan tu dau tien
        String str = car.poll();
        System.out.println("Removed Element: "+str);
    }
}
