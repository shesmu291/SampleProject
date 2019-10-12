package l4;

public class ArraySum {
    static int simpleArraySum(int[] ar) {
        int summ=0;
        for(int i=0;i<ar.length;i++){
            summ=summ+ar[i];
        }
        return summ;

    }
}
