package l4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int a1=0;
        int b1=0;

        for(int i=0; i<3; i++){
            if(a.get(i)>b.get(i)){
                a1++;
            }else{
                if(a.get(i)<b.get(i)){
                    b1++;
                }else{
                    continue;
                }
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(a1);
        list.add(b1);
        return list;

    }
}
