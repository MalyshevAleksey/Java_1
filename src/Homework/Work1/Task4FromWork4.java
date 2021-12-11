package Homework.Work1;
import static Homework.Work1.Task1FromWork4.sysInStrTypeArrayChar;
public class Task4FromWork4 {
    public static void main(String args[]) {
        char [] charArray = Task1FromWork4.sysInStrTypeArrayChar("Введите строчку: ");
        int summNumbers = summNumbersInString(charArray);
        System.out.print(summNumbers);
    }
    public static int summNumbersInString(char [] charArray) {
        String string;
        int summ = 0;
        for(char ch: charArray) {
            string = String.valueOf(ch);
            if (string.matches("[0-9]")) {
                summ+=ch - '0';
            }
        }
        return summ;
    }
}
