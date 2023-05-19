public class Answer {
    int answerNum;
    String answerText;
    boolean correctOrWrong;
    public Answer(){
      this.answerNum = 0;
      this.answerText = "айм файн";
      this.correctOrWrong = false;
    }
    public Answer(int answerNum, String answerText,boolean correctOrWrong){
        this.answerNum = answerNum;
        this.answerText = answerText;
        this.correctOrWrong = correctOrWrong;
    }

}
