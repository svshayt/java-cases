package com.svshayt.java_core.class_string_builder;

import java.util.Random;

public class StringBuilderPractice {

    public static Random rand = new Random();

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
        // [64, 25, 88, 55, 28, 52, 3, 2, 47, 27, 96, 48, 48, 87, 17, 69, 70, 3, 21, 32, 89, 73, 61, 79, 63]
    }
}
