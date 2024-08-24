import java.util.Formatter;
public class writtingfile {
    public static void main(){
        try {
            Formatter f=new Formatter("E:\\video m\\songs");
            f.format("%s %s","shlani","hd");
            f.close();
        }
        catch (Exception e){
            System.out.println("error");}
    }
 }
