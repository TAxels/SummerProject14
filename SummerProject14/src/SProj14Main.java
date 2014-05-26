import java.awt.*;
import javax.swing.*;


public class SProj14Main {

    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SummerProject14Window frame = new SummerProject14Window();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
