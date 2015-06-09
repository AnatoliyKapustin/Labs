import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by AnatoliyKapustin on 09.06.2015.
 */
//    class node<T> {
//        public T value;
//        public node<T> link;
//        public node(T value, node<T> link) {
//            this.value = value;
//            this.link = link;
//        }
//    }
public class stack<T> {
    ArrayList<T> al = new ArrayList<T>();

    public void pop() {
        for(ListIterator li = al.listIterator(al.size()); li.hasPrevious();){
            System.out.print(li.previous() + " ");
        }
    }
    public void push(T value) {
        al.add(value);
    }
}