
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //объявление массивов вопросов и ответов, добавление вспомогательных переменных
        Question[] questions = new Question[4];
       // Answer[][] answers= new Answer[4][4];
        int correctCount = 0, wrongCount = 0;


        //заполнение
        questions[1] = new Question(1, "есть ли множественное наследование в java?");
        questions[1].answers[1] = new Answer(1,"есть", false);
        questions[1].answers[2] = new Answer(2,"нет", true);
        questions[1].answers[3] = new Answer(3,"науке неизвестно", false);

        questions[2] = new Question(2 ,"для чего используются интерфейсы?");
        questions[2].answers[1] = new Answer(1,"для реализации методов", false);
        questions[2].answers[2] = new Answer(2,"для объявления сигнатур методов и констант", true);
        questions[2].answers[3] = new Answer(3,"для красоты", false);

        questions[3] = new Question(3,"java использует интерпретацию или компиляцию?");
        questions[3].answers[1] = new Answer(1,"интерппретацию", false);
        questions[3].answers[2] = new Answer(2,"компиляцию", false);
        questions[3].answers[3] = new Answer(3,"и то, и то", true);

        Scanner sc = new Scanner(System.in);


        for(int i = 1; i < questions.length; i++) {  //вывод вопросов и ответов
            System.out.println(questions[i].getTextOfQuestion());
            for(int j = 1;j< questions[i].answers.length;j++) {
                System.out.println(j + ")" + questions[i].answers[j].getAnswerText());
            }

            System.out.println("Ваш ответ: ");
            //Считываем с консоли ответ пользователя, выводим результат, считаем счетчики
            String studentAnswerStr = sc.nextLine();
            int studentAnswerInt = Integer.parseInt(studentAnswerStr);

            if(questions[i].answers[studentAnswerInt].isCorrectOrWrong()){
                correctCount++;
                System.out.println("верно");
            }
            else{
                wrongCount++;
                System.out.println("неверно");
            }
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);

    }

}




