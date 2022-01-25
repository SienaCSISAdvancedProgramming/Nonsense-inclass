import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * In-class Example to refresh a little Java knowledge and to use
 * input and output redirection.
 * 
 * @author Jim Teresco, completed by 
 * @version Spring 2022
 */
public class Nonsense
{

    public static void main(String args[]) {
     
        int n = Integer.parseInt(args[0]);
        ArrayList<String> words = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            words.add(s.next());
        }
        s.close();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            System.out.print(words.get(r.nextInt(words.size())));
        }
        System.out.println();
    }
}
