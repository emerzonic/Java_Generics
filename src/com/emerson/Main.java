package com.emerson;

public class Main {

    public static void main(String[] args) {
        //Different data lists to be passed to methods
        Integer[] myIntegers = {1,2,3,4,5};
        Character[] myCharacters = {'a','b','c','d','e'};
        String[] myStrings = {"cat", "dog", "fox", "goat", "elephant"};
        Double[] myDoubles = {0.0, 1.0, 2.25, 3.876, 765.34};


        //Create a new object from the class using overloaded method
        WithoutGenericsMethod withoutGenerics = new WithoutGenericsMethod();

        //Pass each data list to the printMyList overloaded methods
        withoutGenerics.printMyList(myIntegers); //output: 1 2 3 4 5
        withoutGenerics.printMyList(myCharacters); //output: a b c d e
        withoutGenerics.printMyList(myStrings); //output: cat dog fox goat elephant
        withoutGenerics.printMyList(myDoubles); //output: 0.0 1.0 2.25 3.876 765.34

        //Create a new object from the class using generic method
        WithGenericsMethod withGenerics = new WithGenericsMethod();

        //Pass each data list to the single printMyList generic method
        withGenerics.printMyList(myIntegers); //output: 1 2 3 4 5
        withGenerics.printMyList(myCharacters); //output: a b c d e
        withGenerics.printMyList(myStrings); //output: cat dog fox goat elephant
        withGenerics.printMyList(myDoubles); //output: 0.0 1.0 2.25 3.876 765.34

    }

}



