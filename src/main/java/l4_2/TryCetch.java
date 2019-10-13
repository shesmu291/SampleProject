package l4_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCetch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        try {
            int a=s.nextInt();
            int b=s.nextInt();
            System.out.println(a / b);
        }catch (InputMismatchException e){
         //   System.out.println("не правильные значения");
            System.out.println(e.getMessage());
        }catch (Exception e){
            //System.out.println("неа 0 не делят");
            System.out.println(e.getMessage());
        }

    }
}
// trow выбросить из кода
