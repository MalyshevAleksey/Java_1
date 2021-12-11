package Homework.Work1;
import static Homework.Work1.Task1FromWork1.sysInInt;
import static Homework.Work1.Task1FromWork2.createArray;
import static Homework.Work1.Task1FromWork3.createAndFillTDA;
import static Homework.Work1.Task1FromWork3.printTwoDimensionalArray;
public class Task4FromWork3 {
    public static void main(String[] args) {
        int rndRangeMin = 0, rndRangeMax = 99;
        int length = sysInInt("Введите к-во столбцов и строк (одно число): ");
        int[][] array = Task1FromWork3.createAndFillTDA(length, rndRangeMin, rndRangeMax);
        Task1FromWork3.printTwoDimensionalArray(array);
        System.out.println("Массив после сортировки: ");
        Task1FromWork3.printTwoDimensionalArray(sortedArray(array));
    }
    public static int [][] sortedArray(int [][] array) {
        int [] sortArray = createArray(array.length * array.length);
        int k = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sortArray[k] = array[i][j];
                k++;
            }
        }
        for (int i = 0; i < sortArray.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < sortArray.length; j++)
            {
                if (sortArray[j] < sortArray[min])
                {
                    min = j;
                }
            }
            int dummy = sortArray[i];
            sortArray[i] = sortArray[min];
            sortArray[min] = dummy;
        }
        k = 0;
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sortArray[k];
                k++;
            }
        }
        return array;
    }
}
