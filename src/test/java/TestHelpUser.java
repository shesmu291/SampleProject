import com.github.javafaker.Faker;
import l2.Mass;
import l4_2.CRUD.FileHelper;
import l4_2.CRUD.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHelpUser {
//    @Test
//    public void testWrite() {
//        Map<String, User> map = new HashMap<>();
//        map.put("ADMIN", new User("admin","adminPas","AAbb"));
//        FileHelper.saveToFile("src/main/resurs/test", map);
//    }
//    @Test
//    public void testWriteNew() {
//        Map<String, User> map = new HashMap<>();
//        map.put("ADMIN2", new User("more","piva","delfin"));
//        FileHelper.saveToFile("src/main/resurs/test", map);
//    }
//    @Test
//    public void testRead() {
//        Map<String, User> map = FileHelper.readFromFile("src/main/resurs/test");
//        int result = map.size() ;
//        assertEquals(1, result);
//    }
    @Test
    public void testWriteFaker() {
        Map<String, User> map = new HashMap<>();
        Faker faker = new Faker();
        for(int i=0; i<100000; i++){
            map.put(faker.name().lastName(), new User (faker.name().lastName().replaceAll("\t"," "), faker.cat().name().replaceAll("\t "," "),faker.cat().name().replaceAll("\t"," ")));

        }
        FileHelper.saveToFile("src\\main\\java\\l4_2\\CRUD\\users", map);
    }

}
