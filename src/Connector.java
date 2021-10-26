import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
        public static final String URL = "jdbc:mysql://localhost:3306/prueba";
        public static final String USER = "root";
        public static final String CLAVE = "root";

        public Connection getConexion(){
            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            return con;
        }
}
