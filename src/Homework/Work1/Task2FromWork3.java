package Homework.Work1;
import Homework.Work1.Task1FromWork2;
import static Homework.Work1.Task1FromWork1.sysInInt;
import static Homework.Work1.Task1FromWork2.createArray;
import static Homework.Work1.Task1FromWork3.*;
public class Task2FromWork3 {
    public static void main(String[] args) {
        Task1FromWork2 application = new Task1FromWork2();
        int length = sysInInt("Введите количество строк и столбцов (одно число): ");
        int rndRangeMin = 0, rndRangeMax = 99;
        int[][] array = Task1FromWork3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        Task1FromWork3.printTwoDimensionalArray(array);
        sumElementsColumns(array, true);
    }
    public static int [] sumElementsColumns(int [][] array, boolean flag) {
        int summ = 0;
        int[] result = createArray(array.length);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                summ += array[j][i];
            }
            result[i] = summ;
            summ = 0;
        }
        if (flag) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Сумма элементов %d-ого столбца: %d\n", i+1, result[i]);
            }
        }
        return result;
    }
}
