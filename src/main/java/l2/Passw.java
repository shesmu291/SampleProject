package l2;

import java.util.Scanner;

public class Passw {
    public static boolean singu(String log, String pas) {
        if(pas.contains("pupil") && log.contains("pupil")){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter login ");
        String log = sc.nextLine();
        System.out.println("enter password ");
        String pas = sc.nextLine();
        if (singu(log, pas)) {
            System.out.println("yes");
        } else{
            System.out.println("no");
        }

    }
}
