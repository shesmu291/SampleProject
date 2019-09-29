package l2;

import java.util.Scanner;

public class mat {
    public static void Mat(String st) {
        st=st.toLowerCase();
        //if(st.contains("cat")){
            st.replace("cat","***");
            st.replace("dog","***");
            st.replace("qwerty","***");

        //    System.out.println("yes ");
        //} else{
        //    System.out.println("no ");
        }

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

