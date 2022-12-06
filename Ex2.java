import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида 
// text~num
// 2.Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// 3.Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

public class Ex2 {
    public static void main(String[] args) {
      LinkedList <String> linkedList = new LinkedList<>();
      for (int i = 0; i < 5; i++) {
        String str = scannerText();
        String [] res = str.split("~");
        if(res[0].equals("print")){
            String removed = linkedList.remove(Integer.parseInt(res[1]));
            System.out.println(removed);
        }
        else{
            linkedList.add(Integer.parseInt(res[1]),res[0]);
            System.out.println(linkedList);
        }
      }
    }
    public static String scannerText(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сироку в формате text~num: ");
        String text = in.nextLine();
        return text;
    }
}
