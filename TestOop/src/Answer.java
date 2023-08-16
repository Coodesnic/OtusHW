public class Answer {
   private int answerNum;
   private String answerText;
   private boolean correctOrWrong;
    public Answer(){
      this.answerNum = 0;
      this.answerText = "";
      this.correctOrWrong = false;
    }
    public Answer(int answerNum, String answerText,boolean correctOrWrong){
        this.answerNum = answerNum;
        this.answerText = answerText;
        this.correctOrWrong = correctOrWrong;
    }

   public int getAnswerNum(){return answerNum;}
   public String getAnswerText(){return answerText;}
    boolean isCorrectOrWrong(){return correctOrWrong;}

}
