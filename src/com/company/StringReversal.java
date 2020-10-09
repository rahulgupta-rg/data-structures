package com.company;

public class StringReversal {

    void reverse(String string) {

        if( string.isEmpty()) {
            return;
        }

        reverse(string.substring(0, string.length()-1));
        System.out.println(string.charAt(string.length()-1));

    }

    public static void main(String[] args) {
        new StringReversal().reverse("Rahul");
    }
}
