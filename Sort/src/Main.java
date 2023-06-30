
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10000];
        int k = 1;
        int j = array.length;
        LinkedList<Integer> linkedlist = new LinkedList<>();

        for (int i = 0; i < array.length; i++)    //заполнение массива случайными числами
            array[i] = ((int)(Math.random() * 50));

        for(int i = 0;i < array.length;i++){   //передача тех же значений в linked list
            linkedlist.add(array[i]);
        }

        long time = System.currentTimeMillis();
        //Knuth bubble sort
        while (k > 0) { //продолжаем пока последним поставленным на место число не станет под номером '0'
            k = 0;
            //цикл идет не до конца массива, а до индекса последнего поставленного на место числа
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    k = i;   //сохраняем в переменную k, чтобы вынести значение за цикл for
                }
            }
            j = k;
        }
        long bubbleTime = System.currentTimeMillis() - time;

       //вывод отсортированного массива
       for(int i = 0;i < array.length;i++){
           System.out.println(array[i]);
       }


        time = System.currentTimeMillis();
        Collections.sort(linkedlist);
        long collectionsSortTime = System.currentTimeMillis() - time;

        System.out.println("time spent for collections.sort  " + (collectionsSortTime));

        System.out.println("time spent for bubbleSort  " + (bubbleTime));

    }
}