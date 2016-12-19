/**
 * Created by dilan on 15/12/16.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxFinder {

    public static void main(String[] args)
    {
       int lineNumber=0;
        try {
        BufferedReader in = new BufferedReader(new FileReader("src/main/hits.txt"));
            Long max = 0l;
            String line=null;
           while((line= in.readLine())!=null) {
               lineNumber++;
                String[] split =  line.split("\t");
                String myNumber = split[0].substring(1,split[0].length());
               if(myNumber!=null && !myNumber.equals("")) {
                   try {
                       Long QID = Long.valueOf(myNumber);
                       if (QID > max)
                           max = QID;
                   }catch (Exception e){

                   }
               }
           }
            System.out.println("Maximum QID was : Q"+max);
       }
       catch(IOException e){
            e.printStackTrace();
       }
    }
}
