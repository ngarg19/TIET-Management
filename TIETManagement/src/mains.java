import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   // import java.util.*;
   // import java.io.*;

public class mains extends JFrame implements ActionListener{
    mains(){
        setSize(1600, 900);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("TUimages/main-qimg-abe0a47212e3cb4c2260209ecbaf48f7-c.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();


        //New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLACK);
        mb.add(newInformation);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.black);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);

        //Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);

        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);

        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        //Update Info
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        //Fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

        //Utility Tools
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        JMenuItem word = new JMenuItem("MS Word");
        word.setBackground(Color.WHITE);
        word.addActionListener(this);
        utility.add(word);
        

        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);


        setJMenuBar(mb);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if (msg.equals("Exit")) {
            setVisible(false);
        }else if (msg.equals("Calculator")) {
            try {
                ProcessBuilder pb = new ProcessBuilder("Calc.exe");
                pb.start();
            }
            catch (Exception exception) {}
        } else if (msg.equals("Notepad")) {
            try{
                ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "myfile.txt");
                pb.start();
            }catch(Exception exception){}
        }else if (msg.equals("MS Word")) {
            try {
                // ProcessBuilder pb = new ProcessBuilder("Word 2013.lnk");
                // p
            }
            catch (Exception exception) {}
        }else if (msg.equals("New Faculty Information")) {
           new addteacher();
        } else if (msg.equals("New Student Information")) {
           new addstudent();
        } else if (msg.equals("View Faculty Details")) {
           new teacherDetails();
        } else if (msg.equals("View Student Details")) {
            new studentDetails();
        } else if (msg.equals("Faculty Leave")) {
           new teacherLeave();
        } else if (msg.equals("Student Leave")) {
           new studentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new teacherLeaveDetail();
        } else if (msg.equals("Student Leave Details")) {
            new studentLeaveDetail();
        } else if (msg.equals("Update Faculty Details")) {
           new updateTeacher();
        } else if (msg.equals("Update Student Details")) {
           new updateStudent();
        } else if (msg.equals("Enter Marks")) {
           new inputMarks();
        } else if (msg.equals("Examination Results")) {
            new ExamDetails();
        } else if (msg.equals("Fee Structure")) {
           new feeStruc();
        } else if (msg.equals("About")) {
           // new About();
        } else if (msg.equals("Student Fee Form")) {
            //new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new mains();
    }
}
