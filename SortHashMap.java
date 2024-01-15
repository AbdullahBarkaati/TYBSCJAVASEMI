package com.example.demo.tySlips.Slip11;

//Write a program to sort HashMap by keys and display the details before sorting and after sorting.
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class SortHashMap
{
    public static void main(String args[])
    {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(22, "Javeriya");
        hm.put(17, "Hadiya");
        hm.put(15, "Afeefa");
        hm.put(9, "Aaisha");

        Iterator <Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while(it.hasNext())
        {
            int key=it.next();
            System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
        System.out.println("\n");

        System.out.println("After Sorting");
        TreeMap<Integer,String> tm=new  TreeMap<> (hm);
        Iterator itr=tm.keySet().iterator();
        while(itr.hasNext())
        {
            int key=(int)itr.next();
            System.out.println("Roll no:  "+key+"     name:   "+hm.get(key));
        }
    }
}