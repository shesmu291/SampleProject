package l3;

public class Scen {
    public static main(String[]) {
        Student stud = new Student("ALex", 15, 10);
        Teacher teac = new Teacher("Tomarka", 51, "mat");
        teac.teach(stud);

        Polite[] people = new Polite[5];
        //Human[] people=new Human[5];
        // people[0]= new Human("ZAh",10);
        people[0] = new Student("ZAh", 10, 6);
        people[1] = new Student("sar", 12, 8);
        people[2] = stud;
        people[3] = teac;
        people[4] = new Teacher("RiR", 45, "him");

        for (int i = 0; i < people.length; i++) {
            //people[i].sayHello();
            people[i].goodBye();
        }
        makeSaySomething(teac);
    }
    public static void makeSaySomething(Polite polite) {
        polite.goodBye();
    }

}
