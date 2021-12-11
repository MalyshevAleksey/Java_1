package Homework.Work1;
import static Homework.Work1.Task1FromWork4.sysInStrTypeArrayChar;
public class Task2FromWork4 {
    public static void main(String args[]) {
        char [] charArray = Task1FromWork4.sysInStrTypeArrayChar("Введите строчку: ");
        onlyUpperLetter(charArray);
    }
    public static void onlyUpperLetter(char [] charArray) {
        String onlyUpper = "";
        for(char letter:charArray){
            if(Character.isUpperCase(letter)) {
                onlyUpper += letter;
            }
        }
        System.out.print(onlyUpper);
    }
}
