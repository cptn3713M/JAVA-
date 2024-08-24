import java.util.Scanner;
import java.io.FileWriter;
 public class iuwritefile {
    public static void main(String args[]){
        try {
            FileWriter w=new FileWriter("filehandling.java:13");
            Scanner s=new Scanner(System.in);
            w.write("filehandling.java:13");
            w.close();
            System.out.println("ok");


        }
        catch (Exception e){
            System.out.println("not ok");
        }
    }
}
