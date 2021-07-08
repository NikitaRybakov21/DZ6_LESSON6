package com.github;

public class Dog extends Animals{

    public Dog(String name, String type) {
        super(name,type);
    }

    @Override
    public void run(int n){
        if(n<=485) System.out.println(this.name+" бежит "+n+" метров");
        else System.out.println(this.name+" устал");
    }

    @Override
    public void swim(int n){
        if(n<=25) System.out.println(this.name+" плывёт "+n+" метров");
        else System.out.println(this.name+" утонул");
    }
}
