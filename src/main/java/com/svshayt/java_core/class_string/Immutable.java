package com.svshayt.java_core.class_string;

import static com.svshayt.utils.Print.print;

public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String t = "test";
        print(t); // test
        String tt = upcase(t);
        print(tt); // TEST
        print(t); // test
    }
}
