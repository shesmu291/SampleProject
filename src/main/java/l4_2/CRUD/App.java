package l4_2.CRUD;

import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    UserService userSer = new UserService();

    int comand=0;
    while(){
        System.out.println("Авторизируйтесь");
        String login = sc.nextLine();
        String pass = sc.nextLine();

        if(userSer.auth(login, pass)){
            System.out.println("1)Добавить" +
                    "2) Удалить" +
                    "3) Редактировать" +
                    "4) Просмотреть всех ");
            comand=sc.nextInt();
            switch (comand){
                case(1):
                    String log = sc.nextLine();
                    String pas = sc.nextLine();
                    String full = sc.nextLine();
                    User user = new User(log,pas,full);
                    if(userSer.addUser(user)){
                        System.out.println("ok");
                    }else{
                        System.out.println("такой логин есть");
                    }
                    break;
                case(2):
                     log = sc.nextLine();
                    userSer.deleteByLogin(log);
                    break;
                case(3):
                    String log = sc.nextLine();
                    String pas = sc.nextLine();
                    String full = sc.nextLine();
                    User user = new User(log,pas,full);
                    userSer.editUser()


            }

    }
}
