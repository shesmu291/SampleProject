package l2;

import java.util.Scanner;

public class polind {
    public static boolean pol(String st) {
            String st2 = "";
            st=st.toLowerCase();
            for (int j = st.length()-1 ; j>=0; j--) {
                st2 = st2 + st.charAt(j);
            }
            for(int i=0; i<st.length(); i++){
                if(st.charAt(i)!=st2.charAt(i)){
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String st = sc.nextLine();
        if(pol(st)) {
            System.out.println("yes ");
        } else{
            System.out.println("no");
        }

    }
}
