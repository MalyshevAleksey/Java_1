package Homework.Work1;
import java.util.Scanner;
import static Homework.Work1.Task6FromWork4.wordWithMaxCountUniqSymbols;
public class Task7FromWork4 {
    public static void main(String[] args) {
        String str = sysInStrTypeString("Введите слова через пробел: ");
        System.out.println(Task6FromWork4.wordWithMaxCountUniqSymbols(str.trim().split("\\s+")));
    }
    public static String sysInStrTypeString(String outScreen) {
        System.out.print(outScreen);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}
