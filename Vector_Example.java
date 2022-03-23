/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan5_Collections;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Dell
 */
public class Vector_Example {
    public static void main(String[] args) {
        Vector<String> bike = new Vector<>();
        
        bike.add("Honda");
        bike.add("Vespa");
        bike.add(2, "Yamaha");
        
        Vector<String> extra_bike = new Vector<>();
        extra_bike.add("SH");
        
        bike.addAll(extra_bike);
        
        bike.indexOf("SH");
        Iterator itr = bike.iterator();
        System.out.println("Bike Vector: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //bike.clear();
        
        bike.set(0, "Suzuki");
        System.out.println("Size of bike vector: "+bike.size());
        System.out.println("Bike Vector after transforming to String: "+bike.toString());
    }
}
