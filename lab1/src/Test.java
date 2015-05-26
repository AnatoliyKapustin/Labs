/**
 * Created by AnatoliyKapustin on 16.05.2015.
 */
public class Test {
    public static void main(String[] args) {
        short w = 0b0101110101101111;;
        int[] s = new int[4];
        System.out.println(Integer.toString(w>>12,2));
        System.out.println(Integer.toString((w<<20)>>>28,2));
        System.out.println(Integer.toString((w<<24)>>>28,2));
        System.out.println(Integer.toString((w<<28)>>>28,2));
    }
}
