package com.hillel.StringLesson;

import java.util.Locale;

public class StringExample extends Object{
    public static void main(String[] args) {
        String st = "hello";
        System.out.println(st.concat(" ").concat("java"));

        String st1 = String.valueOf(4);

        String join = String.join(" ", "I", "Love", "Java");
        System.out.println(join);

        System.out.println(join.charAt(1));

        String[] s = join.split("v");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println(join.lastIndexOf("v", 10));
        System.out.println(join.substring(3));
        System.out.println(join.toUpperCase(Locale.ROOT));
        System.out.println(join.toLowerCase(Locale.ROOT));
        byte[] bytes = join.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

    }
}
