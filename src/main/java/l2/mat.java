package l2;

import java.util.Scanner;

public class mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter error margin ");
        String st = sc.nextLine();
        st=st.toLowerCase();
        if(st.contains("prick")==true ){
            System.out.println("yes ");
        } else{
            System.out.println("no ");
        }
    }
}

