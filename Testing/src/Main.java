

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;
        int questionsCount = 3; //количество вопросов
        int answersCount = 3; //количсевто ответов для одного вопроса

        //Массив вопросов (вместо null надо написать определение массива)
        String[] questions = {"Для чего используются интерфейсы?", "Есть ли множественное наследование в java?",
                "Java использует интерпретацию или компиляцию?"};

        //Массив вариантов ответов
        String[][] answerOptions = {{"для реализации методов", "для объявления сигнатур методов и констант", "для красоты"},
                {"да", "нет", "а какой был вопрос?"},
                {"интерпретацию", "компиляцию", "и то, и то"}};

        // Массив правильных ответов
        String[] correctAnswers = {"2", "2", "3"};

        Scanner sc = new Scanner(System.in);
        //Цикл по вопросам
        for (int i = 0; i < questionsCount; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answersCount; j++) {
                System.out.println((j + 1) + ")" + answerOptions[i][j]);
            }
            System.out.println("Ваш ответ: ");
            //Считываем с консоли ответ пользователя, выводим результат, считаем счетчики
            String answer = sc.nextLine();
            if (answer.equals(correctAnswers[i])) {
                correctCount++;
                System.out.println("верно");
            } else {
                wrongCount++;
                System.out.println("неверно");
            }
        }

        //выводим результаты
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
