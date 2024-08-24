import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class readfile {
    public static void main(String args[]) {
        try {
            Scanner ob = new Scanner("E:\\music m");
            while (ob.hasNext()) {
                System.out.println(ob.next());
            }
            ob.close();
        }

        catch (Exception e) {
            System.out.println("wok"); }

    }
}


