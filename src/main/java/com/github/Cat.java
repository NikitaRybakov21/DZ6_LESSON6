package com.github;

public class Cat extends Animals{

    public Cat(String name, String type) {
        super(name,type);
    }

    @Override
    public void run(int n){
        if(n<=200) System.out.println(this.name+" бежит "+n+" метров");
        else System.out.println(this.name+" устал");
    }

    @Override
    public void swim(int n){
        System.out.println(this.name+" не умеет плавать");
    }
}
