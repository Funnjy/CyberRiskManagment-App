import javax.swing.*;
import java.awt.*;

/**
 * Created by Anton on 24.04.2017.
 */
public class MainWindowTest {
    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainW = new MainWindow();
                mainW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainW.setSize(400, 300);
                mainW.setVisible(true);
            }
        });
    }
}
