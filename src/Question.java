
public class Question {
    int questionNum;
    String textOfQuestion;
    Answer[] questionAnswers;
    public Question(){
        this.questionNum = 0;
        this.textOfQuestion = "";
    }
    public Question(int questionNum, String textOfQuestion){
        this.questionNum = questionNum;
        this.textOfQuestion = textOfQuestion;
    }


}
