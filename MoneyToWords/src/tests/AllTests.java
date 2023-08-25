package tests;

import service.Methods;
import service.MethodsImpl;

import java.util.Objects;


public class AllTests {
    public static void main(String[] args) {
        int moneyValue = 123;
        Methods methodsForTest = new MethodsImpl();

        moneyInArrayTest(moneyValue, methodsForTest);
        troubleValuesTest(methodsForTest);

    }

    static void moneyInArrayTest(int moneyValue, Methods methodsForTest) {
        String scenario = "moneyInArrayTest";
        int[] testArray = methodsForTest.moneyInArray(moneyValue);

        int valueFromArray = 0;
        //int addingValue = 0;
        for (int i = 0; i < 10; i++) {
            valueFromArray += testArray[i] * (int) Math.pow(10, i);
        }
        if (valueFromArray == moneyValue) System.out.println(scenario + ": passed");
        else System.err.println(": wrong translation into array");
    }

    static void troubleValuesTest(Methods methodsForTest) {
        String scenario = "troubleValuesTest";
        int passCounter = 0;
        int value;


        value = 0;
        if (Objects.equals(methodsForTest.moneyInWords(value), "ноль рублей")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 10000000;
        if (Objects.equals(methodsForTest.moneyInWords(value), "введите число до 999_999")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 1;
        if (Objects.equals(methodsForTest.moneyInWords(value), "один рубль")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 12;
        if (Objects.equals(methodsForTest.moneyInWords(value), "двенадцать рублей")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 303000;
        if (Objects.equals(methodsForTest.moneyInWords(value), "триста три тысячи  рублей")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 56982;
        if (Objects.equals(methodsForTest.moneyInWords(value), "пятьдесят шесть тысяч девятьсот восемьдесят два рубля"))
            passCounter++;
        else System.err.println("value " + value + " didnt pass");

        value = 70007;
        if (Objects.equals(methodsForTest.moneyInWords(value), "семьдесят  тысяч семь рублей")) passCounter++;
        else System.err.println("value " + value + " didnt pass");

        if (passCounter == 7) System.out.println(scenario + ": passed");
    }
}







