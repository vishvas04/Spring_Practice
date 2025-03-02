package org.example;

class Dev{
//    private int age;
    private Computer comp;
    public void build(){
        System.out.println("Building with 0 bugs");
        comp.compile();
    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
    public Computer getComp(){
        return comp;
//        comp.compile();
    }
    public void setComp(Computer comp){
        this.comp=comp;
    }
}
