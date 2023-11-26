
package interfaces;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Kaveesha Pathirana
 */
public class DbConnector {
    static Connection con =null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwayreservationsystem", "root", "");
             
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
