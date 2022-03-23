/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan7_Map;

import java.util.TreeMap;

/**
 *
 * @author Dell
 */
public class TreeMap_Example {
    public static void main(String[] args) {
        TreeMap<Integer, String> words = new TreeMap<>();
        
        words.put(1, "television");
        words.put(2, "lamp");
        words.put(3, "table");
        words.put(4, "chair");
        words.put(5, "eletricity");
        
        System.out.println("entrySet(): "+words.entrySet());
        System.out.println("keySet(): "+words.keySet());
        System.out.println("values(): "+words.values());
        
        //Cac ham tu interface NavigableMap
        System.out.println("First Key: "+words.firstKey());
        System.out.println("First Entry: "+words.firstEntry());
        System.out.println("Last Key: "+words.lastKey());
        System.out.println("Last Entry: "+words.lastEntry());
        System.out.println("Floor Key: "+words.floorKey(3));
        
        System.out.println("Low Key: "+words.lowerKey(3));//tra ve key lon nhat trong cac key nho hon
        System.out.println("Higher Key: "+words.higherKey(3));//tra ve key nho nhat trong cac key lon hon
        System.out.println("Ceiling Key: "+words.ceilingKey(3));
        
        System.out.println("Using headMap() method: "+words.headMap(4));
        System.out.println("Using headMap() method with boolean value: "+words.headMap(4, true));
        
        System.out.println("Using tailMap() method: "+words.tailMap(3));
        System.out.println("Using tailMap() method with boolean value: "+words.tailMap(3, true));
        
        System.out.println("Using subMap() method: "+words.subMap(2, 4));
        System.out.println("Using subMap() method with boolean value: "+words.subMap(2, true, 4, true));
    }
}
