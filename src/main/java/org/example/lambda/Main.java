package org.example.lambda;

public class Main {
    public static void main(String[] args) {
        lambda.SayHello sayHello = () -> System.out.println("Say hello is execute");
        sayHello.sayHello();
        AddSum addSum = (a, b) -> a+b;
        System.out.println(addSum.addTwoNums(2,4));
    }
}
