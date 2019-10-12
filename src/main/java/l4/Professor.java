package l4;

import java.util.*;

public class Professor {
    static String angryProfessor(int k, int[] a) {
        int summ=0;
        for(int i=0; i<a.length; i++){
            if(a[i]<=0){
                summ++;
            }
        }
        if(summ>=k){
            return "YES";
        }else{
            return "NO";
        }

    }

}
