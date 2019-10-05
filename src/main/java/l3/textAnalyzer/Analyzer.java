package l3.textAnalyzer;

public class Analyzer {
    public static void Bol(String text){


    }
    public static void main(String[] args){

        /*LengthAnalyzer lengthAnalyzer = new LengthAnalyzer(300);
        //SpamAnalyzer spamAnalyzer = new s
        SwerAnalyzer swerAnalyzer = new SwerAnalyzer();
        String text = "Fuck you";*/
        Analyse[] analyses= new Analyse[2];
        analyses[0] = new LengthAnalyzer(200);
        //analyses[1]=Spam
        analyses[1]=new SwerAnalyzer();
        String text="I fuck you";
        for(int i=0; i<analyses.length; i++){
            System.out.println(analyses[i].analyse(text));
        }
    }
}
