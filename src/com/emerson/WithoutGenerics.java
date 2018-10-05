package com.emerson;

public class WithoutGenerics {

    public void printMyList(Integer[] list) {
        for (Integer i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }


    public void printMyList(Character[] list) {
        for (Character i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }


    public void printMyList(String[] list) {
        for (String i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }

    public void printMyList(Double[] list) {
        for (Double i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }

}
