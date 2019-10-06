package l3_2;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {
    public static void main(String[] args) {
        Faker faker = new Faker();
        boolean a=false;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(faker.beer().style());

        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int i=0; i<list.size();i++){
            for(int j=0; j<list.size()+1;j++){
                if(list.get(i)==list.get(j)){
                    a=true;
                }
            }
        }

        if(a==true){
            System.out.println("повторение есть");
        }else{
            System.out.println("повторение нет");
        }


        Set<String>strings=new HashSet<>(list);
        for (String x : strings) {
            System.out.println(x);

        }
    }

}
