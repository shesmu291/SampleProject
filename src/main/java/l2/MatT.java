package l2;


public class MatT {
    public static String Mat(String st, String word) {
        st = st.toLowerCase();
        if(word.length()==0){
            return st;

        }
        if (st.contains(word)) {
            return st.replaceAll(word, "***");
        }

        return st;
    }


}