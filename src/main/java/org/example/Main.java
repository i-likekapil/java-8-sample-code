package org.example;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Function<Integer,Integer> f = i -> i*i;
        IntFunction<Integer> ff = i->i*i;
        System.out.println(f.apply(2)); // low perf
        System.out.println(ff.apply(2)); // high perf
    }
}