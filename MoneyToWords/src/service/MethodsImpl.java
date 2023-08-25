package service;

public class MethodsImpl implements Methods {
    public int[] moneyInArray(int moneyValue){ //перевод числа в массив
        int[] moneyArr = new int [10];
        int i = 0;

        while((moneyValue > 0) && (i < 10)){
            moneyArr[i] = moneyValue%10;
            moneyValue /= 10;
            i++;
        }
        return moneyArr;
    }
    public String moneyInWords(int moneyValue){ //функция вызывает алгоритм перевода и пишет окончания разрядов
        int[] units = new int[10];
        Methods methods = new MethodsImpl();
        int[] moneyValueArr = methods.moneyInArray(moneyValue);
        StringBuilder sb = new StringBuilder();

        if(moneyValue/1000 != 0){
            //передача разрядов и вызов основного алгоритма перевода для разрядов тысяч
            int[] thousands = new int[10];
            thousands[0] = moneyValueArr[3];
            thousands[1] = moneyValueArr[4];
            thousands[2] = moneyValueArr[5];
            checkPart(thousands,2, sb);
            //вывод окончания разрядов тысяч
            if((thousands[0] == 1) && (thousands[1] != 1)) sb.append(" тысяча ");
            else if ((thousands[0] >= 2) && (thousands[0] <= 4) && (thousands[1] != 1)) sb.append(" тысячи ");
            else if((thousands[0] >= 5) || (thousands[0] == 0) || thousands[1] == 1) sb.append(" тысяч ");

        }
        //передача разрядов и вызов основной функции перевода для первых трех разрядов
        units[0] = moneyValueArr[0];
        units[1] = moneyValueArr[1];
        units[2] = moneyValueArr[2];
        checkPart(units,1, sb);
        //вывод окончания для первых трех разрядов
        if((units[0] == 1) && (units[1] != 1)) sb.append(" рубль ");
        else if ((units[0] >= 2) && (units[0] <= 4) && (units[1] != 1)) sb.append(" рубля ");
        else if((units[0] >= 5) || (units[0] == 0) || units[1] == 1) sb.append(" рублей ");

        return sb.toString();
    }


    public String checkPart(int[] part, int numOfPart, StringBuilder sb){ //основной алгоритм перевода
        UniqueNumbers number = new UniqueNumbers();
        //вывод сотен в формате 'одна сотня'
        /*if(part[2] >= 5){
            System.out.print(number.numbersArray[part[2]].russian + " сотен ");
        }
        else if(part[2] == 1){
            System.out.print(" одна сотня ");
        }
        else if(part[2] == 2){
            System.out.print(" две сотни ");
        }
        else if((part[2] == 3) || (part[2] == 4)){
            System.out.print(number.numbersArray[part[2]].russian + " сотни ");
        }*/
        //вывод сотен в формате 'сто'
        if(part[2] != 0)
            sb.append(number.numbersArray[part[2] * 100].russian).append(" ");

        //вывод десятков и единиц в случаях 'одиннадцать', 'двенадцать' и тд
        if(part[1] == 1){
            sb.append(number.numbersArray[(part[1]*10 + part[0])].russian);
        }
        else if((part[1] > 1) || (part[1] == 0)){
            if(part[1]*10 != 0)  //вывод десятков '20', '30' и тд
                sb.append(number.numbersArray[part[1] * 10].russian).append(" ");
            if(part[0] != 0){
                if(numOfPart == 1)    //единицы для мужского рода разрядов, например 'рубль' или 'триллион'
                    sb.append(number.numbersArray[part[0]].russian);
                else if (numOfPart == 2) { //единцы для женского рода разрдов, например 'тысяча'
                    if(part[0] == 1) sb.append("одна");
                    if (part[0] == 2) sb.append("две");
                    if(part[0] >= 3)  sb.append(number.numbersArray[part[0]].russian);
                }
            }
        }
        return sb.toString();
    }



}
