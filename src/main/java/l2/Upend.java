package l2;

import java.util.Scanner;

public class Upend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String st = sc.nextLine();
        String st2 = "";
        for (int j = st.length()-1 ; j>=0; j--) {
            st2 = st2 + st.charAt(j);
        }
        System.out.println(st2);

    }
}
