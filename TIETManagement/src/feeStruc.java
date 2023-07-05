import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class feeStruc extends JFrame{
    feeStruc(){
        //setSize();
        setLocation(EXIT_ON_CLOSE, ABORT);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new feeStruc();
    }
}
