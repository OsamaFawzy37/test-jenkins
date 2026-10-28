package com.example;

/** Small application used to prove the pipeline runs end to end. */
public final class App {

    private App() {
    }

    public static int add(int left, int right) {
        return left + right;
    }

    public static String greeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name.trim() + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting(args.length > 0 ? args[0] : ""));
    }
}
