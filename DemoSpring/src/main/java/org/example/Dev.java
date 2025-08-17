package org.example;

public class Dev {

    private Computer comp;
  //  private int age;

    public Dev(){
        System.out.println("Dev constructor");
    }

//    public Dev(int age){
//        this.age = age;
//        System.out.println("dev constructor but not the default one");
//    }

//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//        System.out.println(" Dev is the new one :)");
//    }

//    public void setAge(int age){
//        this.age=age;
//    }
//
//    public int getAge(){
//        return age;
//    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Computer getComp(){
        return comp;
    }

    public void build(){
        System.out.println("working on awesome project");
        comp.Compile();
    }
}
