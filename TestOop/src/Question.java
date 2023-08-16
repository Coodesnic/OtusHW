
public class Question {
   private int questionNum;
   Answer[] answers = new Answer[4];
   private String textOfQuestion;


    public Question(){
        this.questionNum = 0;
        this.textOfQuestion = "";
    }
    public Question(int questionNum, String textOfQuestion){
        this.questionNum = questionNum;
        this.textOfQuestion = textOfQuestion;
    }

    public int getQuestionNum (int questionNum){
        return questionNum;
    }
    void setQuestionNum(int questionNum){
        this.questionNum = questionNum;
    }

    public String getTextOfQuestion(){
        return textOfQuestion;
    }
    void setTextOfQuestion (String textOfQuestion){
        this.textOfQuestion = textOfQuestion;
    }
}
