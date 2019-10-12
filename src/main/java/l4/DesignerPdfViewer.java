package l4;

import java.util.List;

public class DesignerPdfViewer {
    static int designerPdfViewer(int[] h, String word) {
        String[] alf = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int max=0;
        for(int i=0; i<h.length; i++){
            if(word.contains(alf[i]) && h[i]>max){
                max=h[i];
            }
        }
        return (word.length()*max);

    }
}
