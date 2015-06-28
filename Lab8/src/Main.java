import java.util.*;

/**
 * Created by AnatoliyKapustin on 13.06.2015.
 */
public class Main {
    public ArrayList<Integer> delMaxMinScore(ArrayList<Integer> sc){
//         Collections.sort(sc);
        sc.remove(Collections.min(sc));
        sc.remove(Collections.max(sc));
        return sc;
    }
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>(8);
        Integer sum = 0;
        Double avg = 0.0;
        Random r = new Random();

        for(int i = 0; i < 8; i++)
        {
            scores.add(r.nextInt(5) + 5);
        }

        ListIterator li = scores.listIterator();

        while(li.hasNext())
        {
            Object element = li.next();
            System.out.print(element + " ");
        }
        System.out.println("\n");

        scores.remove(Collections.min(scores));
        scores.remove(Collections.max(scores));

        ListIterator li2 = scores.listIterator();

        while(li2.hasNext())
        {
            Object element = li2.next();
            System.out.print(element + " ");
        }
        System.out.println("\n");

        for(ListIterator li1 = scores.listIterator(); li1.hasNext();) {
            sum += (Integer)li1.next();
        }

        avg = (double)sum/ scores.size();

        System.out.println(avg);

    }
}
