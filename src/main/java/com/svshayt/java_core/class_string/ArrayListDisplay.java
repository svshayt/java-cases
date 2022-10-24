package com.svshayt.java_core.class_string;

import com.svshayt.models.coffee.Coffee;
import com.svshayt.models.coffee.CoffeeGenerator;

import java.util.ArrayList;

public class ArrayListDisplay {

    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<>();
        for (Coffee c : new CoffeeGenerator(10))
            coffees.add(c);
        System.out.println(coffees);
    }
    // [Latte 0, Americano 1, Latte 2, Americano 3, Latte 4,
    // Latte 5, Cappuccino 6, Cappuccino 7, Latte 8, Cappuccino 9]
}