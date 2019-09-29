package l2;

import java.util.Scanner;

public class Mass {
    public static int sredArr(int[] arr){
        int count=0;
        int summ=0;
        if(arr.length == 0){
            return 0;
        }
        for(int i=0; i < arr.length; i++){
            count++;
            summ = summ + arr[i];
        }
        return Math.abs(summ/count);
    }

}
