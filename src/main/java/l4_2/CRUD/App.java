package l4_2.CRUD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userSer = new UserService();

        int comand = -1;
        String log;
        String pas;
        String full;
        boolean in=false;
        System.out.println("Авторизируйтесь");
        while(in==false) {
            System.out.println("Логин: ");
            log = sc.nextLine();
            System.out.println("Пaроль:");
            pas = sc.nextLine();
            if (userSer.auth(log, pas)) {
                in = true;
            } else {
                System.out.println("неверный логин или пароль");
            }
        }
            while (comand != 0) {
                System.out.println("1)Добавить \n" +
                            "2) Удалить \n" +
                            "3) Редактировать \n" +
                            "4) Просмотреть всех \n" +
                        "для выхода из системы введите 0 \n");
                    comand = sc.nextInt();

                    switch (comand) {
                        case 1:
                            System.out.println("Логин:");
                            log = sc.next();
                            System.out.println("Пaроль:");
                            pas = sc.next();
                            System.out.println("Полное имя: ");
                            full = sc.next();
                            User user = new User(log, pas, full);
                            if (userSer.addUser(user)) {
                                System.out.println("ok");
                            } else {
                                System.out.println("такой логин есть");
                            }
                            break;
                        case 2:
                            System.out.println("Логин: ");
                            log = sc.next();
                            if (userSer.deleteByLogin(log)) {
                                System.out.println("ok");
                            } else {
                                System.out.println("такого пользователя не существует");
                            }
                            break;
                        case 3:
                            System.out.println("Логин: ");
                            log = sc.next();
                            System.out.println("Новый пaроль:");
                            pas = sc.next();
                            System.out.println("Новoe имя: ");
                            full = sc.next();
                            User users = new User(log, pas, full);
                            if (userSer.editUser(users)) {
                                System.out.println("ok");
                            } else {
                                System.out.println("такого пользователя не существует");
                            }
                            break;
                        case 4:
                            List<User> allUsers = userSer.getAllusers();
                            for (User x : allUsers) {
                                System.out.println(x.getLogin()+"  "+x.getPassword()+"  "+x.getFullName());
                            }
                            break;

                    }


            }

//        try(FileReader reader = new FileReader("src\\main\\resurs\\res")) {
////            BufferedReader bufferedReader = new BufferedReader(reader);
//            Scanner scc = new Scanner(reader);
//            int o = 0;
//            while (0 != -1) {
//
//                o = reader.read();
//            }
//        }catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
    }



}











