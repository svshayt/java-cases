package com.svshayt.java_core.class_string_builder;

import java.util.Random;

public class StringBuilderPractice {

    public static Random rand = new Random(10);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        StringBuilderPractice stringBuilderPractice = new StringBuilderPractice();
        System.out.println(stringBuilderPractice);
        //[13, 80, 93, 90, 46, 56, 97, 88, 81, 14, 23, 99, 91, 8, 95, 80, 86, 53, 73, 38, 93, 9, 95, 8, 35]
    }
}
