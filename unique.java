import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by dilan on 18/12/16.
 */
public class unique {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new FileReader("src/main/hits.txt"));
        Set<Integer> uniqueword = new HashSet<Integer>();
        String line = reader.readLine();
        while (line != null) {

            // System.out.print("processing line:" +line);
            if (!line.trim().equals("")) {
                String[] word = line.split("\t");

                try {

                    int i = Integer.parseInt(word[0].substring(1, word[0].length()));
                    uniqueword.add(i);
                    System.out.println("int i = " + i);
                }

                catch (NumberFormatException nfe) {
                    System.out.println("NumberFormatException: " + nfe.getMessage());
                }

            }
            line = reader.readLine();

        }

        System.out.print("unique words:" + uniqueword.size());

        }

    }
