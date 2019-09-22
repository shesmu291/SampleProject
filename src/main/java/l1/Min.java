package l1;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 <= n2 && n1 <= n3){
            System.out.println("min = " + n1);
        } else {
            if (n2 <= n1 && n2 <= n3){
                System.out.println("min = " + n2);
            } else {
                System.out.println("min = " + n3);
            }
        }
    }
}
