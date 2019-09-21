package l1;

import java.util.Scanner;

public class Boy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what coin did you pick ");
        int money = sc.nextInt();
        int count = 0;
        int max=0;
        while(money!=0){
            if(money==1 || money==2 || money==5 || money== 10){
                if( money>max) max=money;
                count+=money;
                System.out.println("what coin did you pick ");
                money = sc.nextInt();
            }
            else  System.out.println("drivel");
            money = sc.nextInt();


        }
        System.out.println("today you gathered "+count+"  the largest coin "+max);


    }

}
