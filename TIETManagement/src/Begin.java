import java.awt.*;
import javax.swing.*;
//import university.management.system.Login;

public class Begin extends JFrame implements Runnable {
    Thread t;

    Begin() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("TUimages/Campus View of Thapar Institute of Engineering and Technology Patiala_Campus-View.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        this.add(image);
        this.t = new Thread(this);
        this.t.start();
        this.setVisible(true);
        int x = 1;
        int i = 2;
        while(i<=600) {
            this.setLocation(600 - (i + x) / 2, 350 - i / 2);
            this.setSize(i + 3 * x, i + x / 2);
            try {
                Thread.sleep(10);
            }
            catch (Exception exception) {
                
            }
            i += 4;
            ++x;
        }
    }

    public void run() {
        try {
            Thread.sleep(6000);
            this.setVisible(false);
            new Login();
        }
        catch (Exception exception) {
        }
    }

    public static void main(String[] args) {
        new Begin();
    }
}

