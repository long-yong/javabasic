package com;

import java.util.HashMap;
import java.util.Iterator;

public class Funs {

    public static void showArri(int[] arr) {
        int N=0; for(Object x:arr){ System.out.print(x+" "); if(N%10==9) System.out.println("\n"); N++; }
    }

    public static void showArrs(String[] arr) {
        int N=0; for(Object x:arr){ System.out.print(x+" "); if(N%10==9) System.out.println("\n"); N++; }
    }

    public static void showArrd(double[] arr) {
        int N=0; for(Object x:arr){ System.out.print(x+" "); if(N%10==9) System.out.println("\n"); N++; }
    }

    public static void showMap(HashMap<String,String> map){
        for(Object key:map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void showMapii(HashMap<Integer,Integer> map){
        int N=0;
        for(HashMap.Entry entry:map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.print(key + ":" + val +"  ");
            if(N%10==9) System.out.print("\n"); N++;
        }
    }

    public static void showMapis(HashMap<Integer,String> map){
        int N=0;
        for(HashMap.Entry entry:map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.print(key + ":" + val +"  ");
            if(N%10==9) System.out.print("\n"); N++;
        }
    }

    public static void showMapss(HashMap<String,String> map){
        int N=0;
        for(HashMap.Entry entry:map.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.print(key + ":" + val +"  ");
            if(N%10==9) System.out.print("\n"); N++;
        }
    }

}

