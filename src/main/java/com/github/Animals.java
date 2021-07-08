package com.github;

public class Animals {
    protected String name;
    protected String type;

    public Animals(String name,String type){
        this.name = name;
        this.type = type;
    }

    public void run(int n){
        System.out.println(this.name+" бежит "+n+" метров");
    }

    public void swim(int n){
        System.out.println(this.name+" плывёт "+n+" метров");
    }
}
