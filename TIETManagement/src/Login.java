import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, cancel;
    JTextField tusername, tpassword;
    Login(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(40, 40, 80, 20);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150, 40, 120, 20);
        add(tusername);


        JLabel password = new JLabel("Password");
        password.setBounds(40, 100, 80, 20);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150, 100, 120, 20);
        add(tpassword);

        login = new JButton("Login");
        login.setBounds(40, 150, 120, 40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180, 150, 120, 40);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("TUimages/Screenshot (4).png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(320, 40, 250, 200);
        add(image);

        setSize(600, 400);
        setLocation(500, 250);
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String username = tusername.getText();
            String password = tpassword.getText();

            String query = "select * from login where username = '"+ username+"'and password ='"+password+"'";

            try{
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);

                if(rs.next()){
                    setVisible(false);
                    new mains();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }
                c.s.close();

            }catch(Exception exception){
                exception.printStackTrace();
            }

        }else if(e.getSource() == cancel){
            setVisible(false);
        }
        
    }
    public static void main(String[] args) {
        new Login();
    }
    
}
