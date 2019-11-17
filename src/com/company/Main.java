package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomCollection<String> customCollection = new MyArray<>();
        customCollection.add("one");
        customCollection.add("two");
        customCollection.add("three");
        customCollection.add("four");
        customCollection.add("five");
        customCollection.add("six");

        System.out.println(customCollection.get(1));
        System.out.println(customCollection.size());
        customCollection.delete(1);
        System.out.println(customCollection.get(1));
    }
}
