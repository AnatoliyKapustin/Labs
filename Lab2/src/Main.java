import java.util.*;
import java.io.*;
/**
 * Created by AnatoliyKapustin on 19.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        int a, count;
        int max = 0;
        //Задание 1
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count elements of mas: ");
        a = in.nextInt();
        int mas[] = new int[a];
        for(int i = 0; i < a; i++) {
            System.out.print("Enter mas element[" + i + "]: ");
            mas[i] = in.nextInt();
        }
        count = 0;
        for(int j = 0; j < a; j++)
            if(mas[j] == 0)
                count++;
        if(count == 0)
            System.out.println("NO zeroes");
        else
        System.out.println("Count zeroes are: " + count);

        //Задание 2
        max = mas[1];
        for(int i = 0; i < a; i++)
            if(mas[i] > max)
                max = mas[i];
        System.out.println("Max element is: " + max);

        //Задание 3

        //Задание 4
        System.out.println("**************");
        short w = 0b0101110101101111;;
        int[] s = new int[4];
        System.out.println(w>>12);
        /*for(int i = 0; i < 4; i++)
            s[i] = (byte)w>>>2;
        for(int i = 0; i < 4; i++)
        System.out.println(s[i]); */
        System.out.println("**************");
        //Задание 5
        final Random random = new Random();
        int mas1[][] = new int[8][5];
        System.out.println("Random array");
        for(int k = 0; k < 8; k++){
            System.out.print("\n");
            for (int m = 0; m < 5; m++) {
                mas1[k][m] = random.nextInt(89) + 10;
                System.out.print(mas1[k][m] + " ");
            }
        }

    }
}
