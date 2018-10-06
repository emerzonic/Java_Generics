package com.emerson;

public class WithGenericsMethod <T> {

    public <T> void printMyList(T[] list) {
        for (T i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }
}
