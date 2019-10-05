package l3.textAnalyzer;

public class LengthAnalyzer implements Analyse {
    private int maxLength;

    public LengthAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean analyse(String text) {
        if (text.length() > maxLength){
            return false;
        }
       return true;
    }
}
