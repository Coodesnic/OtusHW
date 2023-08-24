
public class Question {
   private int questionNum;
   Answer[] answers = {new Answer(),new Answer(),new Answer()};
   private String textOfQuestion;


    public Question(){
        this.questionNum = 0;
        this.textOfQuestion = "";
    }
    public Question(int questionNum, String textOfQuestion, Answer[] answers){
        this.questionNum = questionNum;
        this.textOfQuestion = textOfQuestion;
        this.answers = answers;
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
    void setQuestion (String textOfQuestion){
        this.textOfQuestion = textOfQuestion;
    }
}
