package l4_2.CRUD;
import java.io.*;
import java.util.*;

public class FileHelper {

        public static Map<String,User> readFromFile(String path){
            Map<String, User> map = new HashMap<>();
            try(FileReader reader = new FileReader(path)) {
                Scanner sc = new Scanner(reader);
               // sc.useDelimiter(" ");// пробел между данными
                while (sc.hasNext()){
                    String log =sc.next();
                    String pas =sc.next();
                    String full =sc.next();
                    User user = new User(log, pas, full);
                    map.put(log, user);

                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
            return map;
        }
        public static void saveToFile(String path, Map<String,User> users){

            try(FileWriter writer = new FileWriter(path,false ) ) { //true что бы дполлнял, false что бы перезаписывалось
                BufferedWriter bufferedReader = new BufferedWriter(writer);
                for (Map.Entry<String,User> pair: users.entrySet()) {
                    User userToWrite = pair.getValue();
                    writer.write(userToWrite.getLogin()+"\t"+userToWrite.getPassword()+"\t"+userToWrite.getFullName()+"\n");

                }
                writer.flush();
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

}

