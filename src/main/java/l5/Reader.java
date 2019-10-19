package l5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("src\\main\\resurs\\res")) {
          BufferedReader bufferedReader = new BufferedReader(reader);
            Scanner sc = new Scanner(reader);
            int count=0;
            int summ=0;
            while (sc.hasNext()){
                int a =sc.nextInt();
                count++;
                summ+=a;
            }
            System.out.println(summ/count);
        }catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }
}


