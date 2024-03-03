package Connect;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class koneksi {
    static Connection Connect;
    public static Connection getConnection(){
        try{
            Connect = DriverManager.getConnection("jdbc:mysql://localhost/koneksi","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi database GAGAL");
        }
        return Connect; 
    }

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
