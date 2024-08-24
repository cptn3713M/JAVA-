//public class first {
import java.applet.Applet;
import java.awt.Graphics;

public class first extends Applet{
    String xyz="";
    public void init(){
        xyz="hello sir";
    }
    public void start(){
        xyz=xyz+"wlcm";
    }

    public void paint(Graphics g){
        g.drawString(xyz,150,150);
    }

}
//}
