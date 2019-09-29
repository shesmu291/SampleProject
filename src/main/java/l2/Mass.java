package l2;

import java.util.Scanner;

public class Mass {
    public static int sredArr(int[] arr){
        int count=0;
        int summ=0;
        for(int i=0; i < arr.length; i++){
            count++;
            summ=summ+arr[i];
        }
        return summ/count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas=new int[n];


    }
}
