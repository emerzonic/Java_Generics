package com.emerson;

public class WithGenericsMethod <T>{


    //A generic method that accepts multiple list types
    public void printMyList(T[] list) {
        for (T i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }
}
