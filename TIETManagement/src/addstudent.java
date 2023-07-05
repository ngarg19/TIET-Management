import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


public class addstudent extends JFrame implements ActionListener{
    JTextField aname, afname, affname, aaddress, aphone, aemail, ax, axii, aadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox<String> cbcourse, cbbranch;
    JButton submit, cancel;
    

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000) + 1000);

    addstudent(){

        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null);

        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", 1, 30));
        add(heading);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", 1, 20));
        add(lblname);

        aname = new JTextField();
        aname.setBounds(200, 150, 150, 30);
        add(aname);

        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", 1, 20));
        add(lblfname);

        afname = new JTextField();
        afname.setBounds(600, 150, 150, 30);
        add(afname);

        JLabel lblrollno = new JLabel("Roll Number");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", 1, 20));
        add(lblrollno);

        labelrollno = new JLabel("10190" + first4);
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("serif", 1, 20));
        add(labelrollno);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", 1, 20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add((Component)this.dcdob);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", 1, 20));
        add(lbladdress);

        aaddress = new JTextField();
        aaddress.setBounds(200, 250, 150, 30);
        add(aaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(50, 300, 200, 30);
        lblphone.setFont(new Font("serif", 1, 20));
        add(lblphone);

        aphone = new JTextField();
        aphone.setBounds(200, 300, 150, 30);
        add(aphone);
        

        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(400, 250, 200, 30);
        lblemail.setFont(new Font("serif", 1, 20));
        add(lblemail);

        aemail = new JTextField();
        aemail.setBounds(600, 250, 150, 30);
        add(aemail);

        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", 1, 20));
        add(lblx);

        ax = new JTextField();
        ax.setBounds(600, 300, 150, 30);
        add(ax);

        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(400, 350, 200, 30);
        lblxii.setFont(new Font("serif", 1, 20));
        add(lblxii);
        

        axii = new JTextField();
        axii.setBounds(600, 350, 150, 30);
        add(axii);

        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(50, 350, 200, 30);
        lblaadhar.setFont(new Font("serif", 1, 20));
        add(lblaadhar);

        aadhar = new JTextField();
        aadhar.setBounds(200, 350, 150, 30);
        add(aadhar);

        JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", 1, 20));
        add(lblcourse);

        String courses[] = {"B.Tech", "BE","BE-MBA"};
        cbcourse = new JComboBox<String>(courses);
        cbcourse.setBounds(200, 400, 150, 30);
        add(cbcourse);

        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", 1, 20));
        add(lblbranch);

        String[] branch = new String[]{"Computer Science", "Electronics", "Mechanical", "Civil", "Chemical","Electrical","Mechatronics","Electronics & Communication","Electronics & Computer"};
        cbbranch = new JComboBox<String>(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 150, 50);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", 1, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 150, 50);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", 1, 15));
        add(cancel);

        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = aname.getText();
            String fname = afname.getText();
            String rollno = labelrollno.getText();
            String dob = ((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address = aaddress.getText();
            String phone = aphone.getText();
            String email = aemail.getText();
            String x = ax.getText();
            String xii = axii.getText();
            String Aadhar = aadhar.getText();
            String course = (String)cbcourse.getSelectedItem();
            String branch = (String)cbbranch.getSelectedItem();
            try {
                String query = "insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+phone+"', '"+address+"', '"+dob+"', '"+email+"', '"+x+"', '"+xii+"', '"+Aadhar+"', '"+course+"', '"+branch+"')";
                conn con = new conn();
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addstudent();
    }
}
