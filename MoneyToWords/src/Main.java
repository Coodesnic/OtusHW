

import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int moneyValue = 0;
        Scanner sc = new Scanner(System.in);
        moneyValue = sc.nextInt();
        Methods methods = new MethodsImpl();

        if ((moneyValue >= 1) && (moneyValue <= 999_999))
            System.out.print(methods.moneyInWords(moneyValue));
        else if (moneyValue == 0) System.out.print("ноль рублей");
        else System.out.print("введите число до 999_999");

    }


}