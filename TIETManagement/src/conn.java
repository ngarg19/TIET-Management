import java.sql.*;
public class conn {

    Connection c;
    Statement s;

    conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/TIETdb","root","mysql@0519");
            s = c.createStatement();
        
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
