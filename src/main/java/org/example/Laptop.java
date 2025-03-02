package org.example;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop is built");
    }
    public void compile(){
        System.out.println("Compiling code in Laptop");
    }
}
