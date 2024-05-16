package com.comarch.szkolenia.optional;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> stringBox = find(4);
        if(stringBox.isPresent() && stringBox.get().equals("Test")) {
            System.out.println("Udalo sie !!");
        } else {
            System.out.println("Nie znaleziono !!");
        }
    }

    public static Optional<String> find(int x) {
        if(x == 5) {
            return Optional.of("Test");
        } else {
            return Optional.empty();
        }
    }
}
