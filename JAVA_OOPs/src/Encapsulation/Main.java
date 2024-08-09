package Encapsulation;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        privateImplementation pi=new privateImplementation(69,"Ashwini");
//        pi.name//this will give error as we know name member is private so to access it we will use getters and setters
        System.out.println(pi.getName());

        System.out.println(pi instanceof privateImplementation);
        System.out.println(pi instanceof Object);
        System.out.println(pi.getClass());
    }
}
