package com.hillel.strings;

import java.util.Objects;

public class StringExample {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Murcik");
        System.out.println(cat.hashCode());
        cat.setName("Barsik");
        System.out.println(cat.hashCode());
    }

    static class Cat {
        String Name;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }
    }
}
