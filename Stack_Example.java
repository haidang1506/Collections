/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan5_Collections;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Dell
 */
public class Stack_Example {
    //Last In First Out
    //Nen su dung ArrayDeque
    public static void main(String[] args) {
        Stack<String> candy = new Stack<>();
        
        candy.push("chocolate");
        candy.push("mango");
        candy.push("orange");
        
        Iterator itr = candy.iterator();
        System.out.println("Candy Stack:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        String c = candy.pop();
        System.out.println("Removed element: "+c); //output: orange
        
        //Index of element on top of stack
        System.out.println("Element at top of stack: "+candy.peek());
        
        //Search index
        System.out.println("Position of chocolate is: "+candy.search("chocolate"));
        
        System.out.println("Is Candy stack empty ? "+candy.empty());
    }
}
