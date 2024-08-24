import javax.swing.*;
import java.awt.*;
public class firstswing {
    public static void main(String arg[])
    {
        JFrame jf=new JFrame("PVPSIT");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
        Container c=jf.getContentPane();
        c.setBackground(Color.orange);
    }

}
