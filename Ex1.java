import java.util.ArrayList;
import java.util.LinkedList;
public class Ex1{
    public static void main(String[] args) {

        int repeatCount = 1_000_000;

        long begin = System.nanoTime ();  // текущее время в наносекундах   0.000 000 001 с

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < repeatCount; i++)
            arrayList.add (i);

        long mid = System.nanoTime ();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < repeatCount; i++)
            linkedList.add (i);

        long end = System.nanoTime ();

        System.out.printf("%f %f", (mid - begin) / 1e+9, (end - mid) / 1e+9);
    }
}

    }
}