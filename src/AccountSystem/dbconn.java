package AccountSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconn {
  public static Connection con;
  public static Statement stm;
  public static void connect() throws ClassNotFoundException, SQLException{
      Class.forName("com.mysql.jdbc.Driver");
      
            con=DriverManager.getConnection("jdbc:mysql://localhost/billing","root","");
            
        stm=con.createStatement();
      
  }
  
  public static void discoonect() throws SQLException{
      con.close();
  }
}
