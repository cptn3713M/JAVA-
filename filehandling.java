
import java.io.File;
public class filehandling
{//file creating wala h ye program
    public static void main(String args[])
    {
        try
        {
            File f = new File("test.txt");
            if (f.createNewFile()) {
                System.out.println(f.getName() + "exists");
            } else {
                System.out.println("nothing");
            }
        }
        catch (Exception e)
        {
            System.out.println("no error");
        }
    }
}
