package com.emerson;

public class WithoutGenericMethod {

    //An overloaded method that accepts only integer list types
    public void printMyList(Integer[] list) {
        for (Integer i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }


    //An overloaded method that accepts only character list types
    public void printMyList(Character[] list) {
        for (Character i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }


    //An overloaded method that accepts only string list types
    public void printMyList(String[] list) {
        for (String i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }


    //An overloaded method that accepts only double list types
    public void printMyList(Double[] list) {
        for (Double i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }

}
