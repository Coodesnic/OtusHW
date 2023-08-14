
public class Question {
   private int questionNum;
   private String textOfQuestion;
    //Answer[] questionAnswers;

    public Question(){
        this.questionNum = 0;
        this.textOfQuestion = "";
    }
    public Question(int questionNum, String textOfQuestion){
        this.questionNum = questionNum;
        this.textOfQuestion = textOfQuestion;
    }

    int getQuestionNum (int questionNum){
        return questionNum;
    }
    void setQuestionNum(int questionNum){
        this.questionNum = questionNum;
    }

    String getTextOfQuestion(){
        return textOfQuestion;
    }
    void setTextOfQuestion (String textOfQuestion){
        this.textOfQuestion = textOfQuestion;
    }
}
