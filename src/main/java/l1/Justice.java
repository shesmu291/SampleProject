package l1;

import java.util.Scanner;

public class Justice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how much money do you have");
        int money = sc.nextInt();
        System.out.println("how much is corn");
        int price= sc.nextInt();
        System.out.println("how much corn is needed");
        int count = sc.nextInt();
        if ((count*price)<money) System.out.println("Bon Appetit! surrender "+(money-count*price));
        else System.out.println("you do not have enough money");

    }
}
