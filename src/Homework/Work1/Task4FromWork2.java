package Homework.Work1;
import static Homework.Work1.Task3FromWork2.isMax;
import static Homework.Work1.Task3FromWork2.isMin;
public class Task4FromWork2 {
    public static void main(String[] args) {
        Task1FromWork2 applicationTask1 = new Task1FromWork2();
        Task4FromWork2 applicationTask4 = new Task4FromWork2();
        int length = 5;
        int rndRangeMin = -50;
        int rndRangeMax = 50;
        int[] array = applicationTask1.createAndFillArrayByRnd(length, rndRangeMin, rndRangeMax);
        applicationTask1.printIntArray(array);
        System.out.print("\n"+"\n");
        applicationTask4.swapMinAndMax(array);
        applicationTask1.printIntArray(array);
    }
    public void swapMinAndMax(int [] array) {
        int min = Task3FromWork2.isMin(array);
        int max = Task3FromWork2.isMax(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                array[i] += max;
            }
            if (array[i] == max) {
                array[i] = min;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min+max) {
                array[i] -= min;
            }
        }
    }
}
