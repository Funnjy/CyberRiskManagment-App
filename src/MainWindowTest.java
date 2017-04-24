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

                Toolkit verktøykasse = Toolkit.getDefaultToolkit();
                Dimension skjermdimensjon = verktøykasse.getScreenSize();
                int bredde = skjermdimensjon.width;
                int høyde = skjermdimensjon.height;

                mainW.setSize(bredde/4, høyde/4);
                mainW.setVisible(true);
                mainW.setResizable(false);
                mainW.setLocationRelativeTo(null);
            }
        });
    }
}
