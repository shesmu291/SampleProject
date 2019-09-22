package l1;

import java.util.Scanner;


public class Degree2 {
    public static boolean isPowerOfTwo(int nu) {
        while (nu != 1 && nu % 2 == 0) {
            nu = nu / 2;
        }
        if (nu == 1) {
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the number\n");
        int nu = sc.nextInt();
        System.out.println(isPowerOfTwo(nu));
    }




}
