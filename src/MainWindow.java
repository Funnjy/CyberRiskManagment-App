import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anton on 24.04.2017.
 */
public class MainWindow extends JFrame implements ActionListener{

    //Labels
    private JLabel lable;

    //Input Fields
    private JTextField inAsset, inAssetExp;

    //Output Areas
    private JTextArea outputarea;

    //Buttons
    private JButton save;

    //Main Window constructor
    public MainWindow(){

        super("Cyber-Risk Management");

        //Lables
        lable = new JLabel("Asset register");

        //Input Fields size definition
        inAsset = new JTextField(10);
        inAssetExp = new JTextField(20);

        //Output Areas size definition
        outputarea = new JTextArea(10,30);
        outputarea.setEditable(true);
        JScrollPane scrolloutput = new JScrollPane(outputarea);

        //Buttons
        save = new JButton("Save Asset");
        save.addActionListener(this);

        //Containers
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(lable);
        c.add(inAsset);
        c.add(inAssetExp);
        c.add(scrolloutput);
        c.add(save);

    }

    public void actionPerformed(ActionEvent e){

    }
}
