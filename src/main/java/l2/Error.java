package l2;


import java.util.Scanner;


public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter error margin ");
        float E = sc.nextFloat();
        System.out.println("enter rod length ");// e=0.03 L=3 l=3.01
        float L = sc.nextFloat();
        System.out.println("enter your measurements ");
        float le = sc.nextFloat();
        while(le!=0) {
            if(L-le<=E && le-L<=E) {
                System.out.println("yes");
            } else {
                System.out.println("no ");
            }
            le = sc.nextFloat();
        }


    }
}

