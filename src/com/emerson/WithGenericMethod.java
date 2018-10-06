package com.emerson;

public class WithGenericMethod {


    //A generic method that accepts multiple list types
    public <T> void printMyList(T[] list) {
        for (T i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }
}
