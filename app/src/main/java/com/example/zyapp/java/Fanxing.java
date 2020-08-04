package com.example.zyapp.java;

import java.util.ArrayList;

public class Fanxing {
    public void test(){
        ArrayList<? super String> arrayList = new ArrayList<>();
        arrayList.add("");


        ArrayList<? extends String> arrayList1 = new ArrayList<>();
        arrayList1.get(0);
    }
}
