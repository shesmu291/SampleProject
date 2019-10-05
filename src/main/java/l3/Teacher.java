package l3;

import java.util.Scanner;

public class Teacher extends Human implements Polite {

    private String subject;

    public Teacher(String name, int age, String subject) {
            super(name, age);
            this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void sayHello(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello, my name is "+ name);
    }
    public void teach(Student stud)
    {
        stud.sayHello();
    }

    public void goodBye() {
        System.out.println("Goodbye");
    }
}



