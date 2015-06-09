import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by AnatoliyKapustin on 06.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push("asd");
        s.push(22);
        s.pop();
        System.out.println("\n");

        ArrayList<Integer> al = new ArrayList<Integer>(20);
        Random r = new Random();
        for(int i = 0; i < 4; i++)
        {
            al.add(r.nextInt(5) + 5);
        }

        ListIterator it = al.listIterator();

        while(it.hasNext())
        {
            Object element = it.next();
            System.out.print(element + " ");
        }
        System.out.println("\n");

        for(ListIterator li = al.listIterator(); li.hasNext();) {
            li.next();
            if (li.hasNext()) {
                Integer element = (Integer) li.next();
                li.remove();
                if (al.size() >= 1) {
                    Integer element2 = (Integer) li.previous();
                    element += element2;
                    li.set(element);
                    //System.out.println(element);
                }
            }
        }
        ListIterator it1 = al.listIterator();

        while(it1.hasNext())
        {
            Object element = it1.next();
            System.out.print(element + " ");
        }
    }


}

