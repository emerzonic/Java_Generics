package com.emerson;

public class WithGenericsMethod {


    //A generic method that accepts multiple list types
    public <T> void printMyList(T[] list) {
        for (T i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }
}
