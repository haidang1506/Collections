/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan5_Collections;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Dell
 */
public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("horse");
        
        System.out.println("Animals: "+animals);
        System.out.println("Size: " + animals.size());
        
        //sap xep theo thu tu tu dien
        Collections.sort(animals);
        System.out.println("Sorted ArrayList: " + animals);
        
        //get element from animal list
        String str = animals.get(0);
        System.out.println("Value of index 0 is: "+str);
        
        //change the element
        animals.set(1, "cow");
        System.out.println("Modified ArrayList: "+animals);
        
        //remove by value
        animals.remove("horse");
        System.out.println("List after removing: "+animals);
        
        //animals.remove(0);  remove by index
        //animals.removeAll(); == clear();
        
        
    }
}
