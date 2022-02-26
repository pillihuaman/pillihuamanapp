package pillihuaman.com.Adapters;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class OracleAdapter {

	
    public  static Connection getConnection ()
    {
        Connection con= null;
         try
         {
         
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gamachicas","123456");
         }
         catch(ClassNotFoundException | SQLException ex)
         {
               ex.getMessage();
         
         }
        
    return  con;
    }
}
