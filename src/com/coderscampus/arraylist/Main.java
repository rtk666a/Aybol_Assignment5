package com.coderscampus.arraylist;

public class Main {
    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add("asdlfkj");
        arrayList.add("asdlfkj1");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj2");
        arrayList.add("asdlfkj11");
        arrayList.add("asdlfkj11");
        arrayList.add("asdlfkj11");
        arrayList.add("asdlfkj11");
        arrayList.add("asdlfkj19");
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}