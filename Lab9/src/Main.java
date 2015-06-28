import java.io.*;
import  java.lang.*;
import java.util.*;

/**
 * Created by AnatoliyKapustin on 23.06.2015.
 */
class StringLengthListSort implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();

    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Data.txt");
        File outFile = new File("D:\\Out.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
        DataOutputStream out = new DataOutputStream(new FileOutputStream(outFile));
        String line = "";
        ArrayList<String> li = new ArrayList<String>();
        StringLengthListSort ss = new StringLengthListSort();

        if (!outFile.exists()) {
            outFile.createNewFile();
        }

        while ((line = br.readLine()) != null) {
            li.add(line);
        }
        br.close();

        Collections.sort(li, ss);

        System.out.println(li);

        for(String s: li)
            out.writeUTF(s + "\n");

        out.close();
    }

}

