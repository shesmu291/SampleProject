package l4;

public class Kenguru {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int a=1;
        for(int i=0; i<10000; i++){
            if(x1==x2){
                return "YeS";
            }
            x1=x1+v1;
            x2=x2+v2;
        }
        return "NO";


    }
}
