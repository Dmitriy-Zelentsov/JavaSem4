import java.util.ArrayDeque;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная 
// была первой в списке, а первая — последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class Ex3 {
    public static void main(String[] args) {
        ArrayDeque <String> stack = new ArrayDeque<>();
        while(true) {
            String str = scannerText();
            if(str.equals("quit")){
                break;
            }

            else if(str.equals("print")){
                Object [] strings = stack.toArray();
                for (int i = strings.length-1; i >= 0  ; i--){
                    System.out.print(strings[i]);
                }
            }

            else if (str.equals("revert")){
                System.out.println(stack.removeLast());
            }
            else{
                stack.add(str);
            }
            System.out.println(stack);
        }
    }

    public static String scannerText() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сироку в формате text~num: ");
        String text = in.nextLine();
        return text;
    }
}
