package l2;

import java.util.Scanner;

public class How {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String st = sc.nextLine();
        int count=0;
        for(int i=0; i<st.length(); i++) {
            if (st.charAt(i)=='!') {
                count=count+1;
            }
        }
        System.out.println(count);


    }

}
