package l3;

import java.util.Scanner;

public class Human  {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hi, my name is "+ name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
