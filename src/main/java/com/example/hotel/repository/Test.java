package com.example.hotel.repository;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add(1,"2");
        arrayList.remove(2);
        for (String f:arrayList) {
            System.out.println(f);
        }
    }
}
