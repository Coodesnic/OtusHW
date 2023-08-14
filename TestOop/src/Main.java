
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //объявление массивов вопросов и ответов, добавление вспомогательных переменных
        Question[] questions = new Question[4];
        Answer[][] answers= new Answer[4][4];
        int correctCount = 0, wrongCount = 0;


        //заполнение
        questions[1] = new Question(1, "есть ли множественное наследование в java?");
        answers[1][1] = new Answer(1,"есть", false);
        answers[1][2] = new Answer(2,"нет", true);
        answers[1][3] = new Answer(3,"науке неизвестно", false);

        questions[2] = new Question(2 ,"для чего используются интерфейсы?");
        answers[2][1] = new Answer(1,"для реализации методов", false);
        answers[2][2] = new Answer(2,"для объявления сигнатур методов и констант", true);
        answers[2][3] = new Answer(3,"для красоты", false);

        questions[3] = new Question(3,"java использует интерпретацию или компиляцию?");
        answers[3][1] = new Answer(1,"интерппретацию", false);
        answers[3][2] = new Answer(2,"компиляцию", false);
        answers[3][3] = new Answer(3,"и то, и то", true);

        Scanner sc = new Scanner(System.in);


        for(int i = 1; i < questions.length; i++) {  //вывод вопросов и ответов
            System.out.println(questions[i].getTextOfQuestion());
            for(int j = 1;j< answers[i].length;j++) {
                System.out.println(j + ")" + answers[i][j].getAnswerText());
            }

            System.out.println("Ваш ответ: ");
            //Считываем с консоли ответ пользователя, выводим результат, считаем счетчики
            String studentAnswerStr = sc.nextLine();
            int studentAnswerInt = Integer.parseInt(studentAnswerStr);

            if(answers[i][studentAnswerInt].isCorrectOrWrong()){
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




