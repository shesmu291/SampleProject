package l4;

public class Rotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        for(int i=0; i<k; i++){
            int buf=a[0];
            a[0]=a[a.length-1];
             for(int j=1; j<a.length-1; j++){
                 a[a.length-1]=a[a.length-j-1];// 123  .12
             }
             a[i]=buf;
        }
        int[] ot = new int[queries.length];
        for(int i=0;i<ot.length;i++){
            ot[i]=a[i];
        }
        return ot;

    }

}
