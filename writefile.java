import java.io.FileWriter;
public class writefile {
    public static void main(String args[]){
        try {
            FileWriter ob=new FileWriter("filehandling.java:13");
            ob.write("filehandling.java:13");
            ob.close();
            System.out.println("done");
        }
        catch (Exception e)
        {
            System.out.println("ok");
        }
    }
}
