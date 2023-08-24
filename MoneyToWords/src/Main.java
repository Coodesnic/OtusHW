public class Main {
    public static void main(String[] args) {

        int moneyValue = 30111;
        int[] moneyArr = moneyInArr(moneyValue);
        moneyInWords(moneyArr);

    }
    public static void moneyInWords(int[] moneyValueArr){ //функция вызывает алгоритм перевода и пишет окончания разрядов
        int[] part1 = new int[10];

       if(moneyValueArr.length > 3){
           //передача разрядов и вызов основного алгоритма перевода для разрядов тысяч
           int[] part2 = new int[10];
           part2[0] = moneyValueArr[3];
           part2[1] = moneyValueArr[4];
           part2[2] = moneyValueArr[5];
           checkPart(part2,2);
           //вывод окончания разрядов тысяч
           if((part2[0] == 1) && (part2[1] != 1)) System.out.print(" тысяча ");
           else if ((part2[0] >= 2) && (part2[0] <= 4) && (part2[1] != 1)) System.out.print(" тысячи ");
           else if((part2[0] >= 5) || (part2[0] == 0) || part2[1] == 1) System.out.print(" тысяч ");

       }
       //передача разрядов и вызов основной функции перевода
        part1[0] = moneyValueArr[0];
        part1[1] = moneyValueArr[1];
        part1[2] = moneyValueArr[2];
        checkPart(part1,1);
       //вывод окончания для первых трех разрядов
        if((part1[0] == 1) && (part1[1] != 1)) System.out.print(" рубль");
        else if ((part1[0] >= 2) && (part1[0] <= 4) && (part1[1] != 1)) System.out.print(" рубля");
        else if((part1[0] >= 5) || (part1[0] == 0) || part1[1] == 1) System.out.print(" рублей");
   }

   public static int[] moneyInArr(int moneyValue){ //перевод числа в массив
        int[] moneyArr = new int [10];
        int i = 0;
        while((moneyValue > 0) && (i < 10)){
            moneyArr[i] = moneyValue%10;
            moneyValue /= 10;
            i++;
        }
        return moneyArr;
   }
   public static void checkPart(int[] part, int numOfPart){ //основной алгоритм перевода
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
           System.out.print(number.numbersArray[part[2]*100].russian + " ");

       //вывод десятков и единиц в случаях 'одиннадцать', 'двенадцать' и тд
       if(part[1] == 1){
           System.out.print(number.numbersArray[(part[1]*10 + part[0])].russian);
       }
       else if((part[1] > 1) || (part[1] == 0)){
           if(part[1]*10 != 0)  //вывод десятков '20', '30' и тд
               System.out.print(number.numbersArray[part[1]*10].russian + " ");
           if(part[0] != 0){
               if(numOfPart == 1)    //единицы для мужского рода разрядов, например 'рубль' или 'триллион'
                   System.out.print(number.numbersArray[part[0]].russian);
               else if (numOfPart == 2) { //единцы для женского рода разрдов, например 'тысяча'
                   if(part[0] == 1) System.out.print("одна");
                   if (part[0] == 2) System.out.print("две");
                   if(part[0] >= 3)  System.out.print(number.numbersArray[part[0]].russian);
               }
           }
       }

   }


}