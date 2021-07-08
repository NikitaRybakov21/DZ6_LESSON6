package com.github;

public class Main {
    public static void main(String[] args) {

        Animals[] ani = {new Cat("Кот Вася", "cat"),
                         new Dog("Собака ДОГ", "dog")
        };

        for (int i = 0; i < ani.length; i++) {
            for(int j = 5; j < 700; j = j + 20) {
                ani[i].run(j);
                ani[i].swim(j);
            }
        }
    }
}
