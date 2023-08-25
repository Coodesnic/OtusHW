package service;

import service.Number;

public class UniqueNumbers {
   public Number[] numbersArray = new Number[901];

    public UniqueNumbers(){
        numbersArray[1] = new Number(1, "один");
        numbersArray[2] = new Number(2, "два");
        numbersArray[3] = new Number(3, "три");
        numbersArray[4] = new Number(4, "четыре");
        numbersArray[5] = new Number(5, "пять");
        numbersArray[6] = new Number(6, "шесть");
        numbersArray[7] = new Number(7, "семь");
        numbersArray[8] = new Number(8, "восемь");
        numbersArray[9] = new Number(9, "девять");
        numbersArray[10] = new Number(10, "десять");
        numbersArray[11] = new Number(11, "одиннадцать");
        numbersArray[12] = new Number(12, "двенадцать");
        numbersArray[13] = new Number(13, "тринадцать");
        numbersArray[14] = new Number(14, "четырнадцать");
        numbersArray[15] = new Number(15, "пятнадцать");
        numbersArray[16] = new Number(16, "шестнадцать");
        numbersArray[17] = new Number(17, "семнадцать");
        numbersArray[18] = new Number(18, "восемнадцать");
        numbersArray[19] = new Number(18, "девятнадцать");
        numbersArray[20] = new Number(20, "двадцать");
        numbersArray[30] = new Number(30, "тридцать");
        numbersArray[40] = new Number(40, "сорок");
        numbersArray[50] = new Number(50, "пятьдесят");
        numbersArray[60] = new Number(60, "шестьдесят");
        numbersArray[70] = new Number(70, "семьдесят");
        numbersArray[80] = new Number(80, "восемьдесят");
        numbersArray[90] = new Number(90, "девяносто");
        numbersArray[100] = new Number(100, "сто");
        numbersArray[200] = new Number(100, "двести");
        numbersArray[300] = new Number(100, "триста");
        numbersArray[400] = new Number(100, "четыреста");
        numbersArray[500] = new Number(100, "пятьсот");
        numbersArray[600] = new Number(100, "шестьсот");
        numbersArray[700] = new Number(100, "семьсот");
        numbersArray[800] = new Number(100, "восемьсот");
        numbersArray[900] = new Number(100, "девятьсот");

    }
}
