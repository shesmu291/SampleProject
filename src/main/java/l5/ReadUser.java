package l5;


import l4_2.CRUD.User;
import l4_2.CRUD.UserService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadUser {
    public static void main(String[] args) {
        UserService userSer = new UserService();
        try(FileReader reader = new FileReader("src\\main\\resurs\\users")) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            ArrayList<String> list = new ArrayList<>();
            while (sc.hasNextLine()){
                String log =sc.next();
                String pas =sc.next();
                String full =sc.next();
                User user = new User(log, pas, full);

            }
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
