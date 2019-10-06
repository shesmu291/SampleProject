package l3_2;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample {
    public static void main(String[] args) {

        /*map.put("Tolya", 5);
        map.put("Alex", 10);
        map.put("Alex", 18);
 Integer a =map.get("Alex");*/

        Faker faker= new Faker(new Locale("ru"));
        Map<String, Integer> map = new HashMap<>();
        Random rnd=new Random();
        for(int i=0;i<10;i++){
            map.put(faker.name().firstName(),rnd.nextInt(50));
        }
        for (Map.Entry<String, Integer> pair:map.entrySet()) {
            String key=pair.getKey();
            Integer value=pair.getValue();
            System.out.println(key+" : "+value);
        }
    }
}
