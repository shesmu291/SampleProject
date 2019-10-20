package l5;


import l4_2.CRUD.User;
import l4_2.CRUD.UserService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadUser {
    public static void main(String[] args) {
        UserService userSer = new UserService();
//        try(FileReader reader = new FileReader("src\\main\\resurs\\users")) {
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            Scanner sc = new Scanner(reader);
//            ArrayList<String> list = new ArrayList<>();
//            while (sc.hasNextLine()){
//                String log =sc.next();
//                String pas =sc.next();
//                String full =sc.next();
//                User user = new User(log, pas, full);
//
//            }
//            List<User> allUsers = userSer.getAllusers();
//            for (User x : allUsers) {
//                System.out.println(x.getLogin()+"  "+x.getPassword()+"  "+x.getFullName());
//            }
//            for(int i=0; i<list.size(); i++){
//                System.out.println(list.get(i));
//            }
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(FileWriter writer = new FileWriter("src/main/resurs/test")) {
            BufferedWriter bufferedReader = new BufferedWriter(writer);
            ArrayList<String> list = new ArrayList<>();
//            int test=0;
            long[] test = new long[90];
            test[0]=0;
            test[1]=1;
            writer.write(1);
            for(int i=2; i<test.length-2; i++){
                test[i]=test[i-1]+test[i-2];
                writer.write(String.valueOf(test[i])+" ");//записывает посимвольно
            }

            writer.append("\n");
            writer.append("E");

            writer.flush();

            List<User> allUsers = userSer.getAllusers();
            for (User x : allUsers) {
                System.out.println(x.getLogin()+"  "+x.getPassword()+"  "+x.getFullName());
            }
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
