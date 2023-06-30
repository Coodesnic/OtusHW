import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DevByZero zeroOrOne = new DevByZero();// имеет значение 0 или 1

        //zeroOrOne.throwException(); //просто вывод stack trace
        //zeroOrOne.retrowException(); //rethrow (заворачиваем?) в RuntimeException
        zeroOrOne.solveException(); //обработка исключения в catch и вывод измененного значения
        readFirstLineFromFile("C:\\otus\\OtusHW\\Exceptions\\src\\file.txt");
    }

    static String readFirstLineFromFile(String path) {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
        catch (Exception e){
            e.printStackTrace();
            return ":(";
        }

    }

}