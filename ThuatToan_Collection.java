/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phan8_Set;
import java.util.Collections;
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class ThuatToan_Collection {
    public static void main(String[] args) {
        ArrayList<String> uni = new ArrayList<>();
        uni.add("TLU");
        uni.add("NEU");
        uni.add("PTIT");
        System.out.println("Unsorted uni list: "+uni);
        
        //sap xep
        Collections.sort(uni);
        System.out.println("Sorted uni list: "+uni);
        
        //dao thu tu
        Collections.reverse(uni);
        System.out.println("Reversed uni list: "+uni);
        
        //doi cho phan tu
        Collections.swap(uni, 0, 1);//0 va 1 la index
        System.out.println("uni list after swaping: "+uni);
        
        //binarySearch
        int index = Collections.binarySearch(uni, "TLU");
        System.out.println("Position of TLU is: "+index);
        
        //so lan xuat hien
        int count = Collections.frequency(uni, "PTIT");
        System.out.println("Count of PTIT: "+count);
        
        ArrayList<String> ver = new ArrayList<>();
        ver.add("FPT");
        ver.add("RMIT");
        ver.add("TLU");
        // disjoint() tra ve true khi 2 collecion k co phan tu chung
        System.out.println("uni and ver are disjoint ? "+Collections.disjoint(uni, ver));
        
        System.out.println("Min of ver: "+Collections.min(ver));
        System.out.println("Max of ver: "+Collections.max(ver));
    }
}
