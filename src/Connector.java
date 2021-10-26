import javax.swing.*;
import java.sql.*;

public class Connector {
        public static final String URL = "jdbc:mysql://localhost:3306/prueba";
        public static final String USER = "root";
        public static final String CLAVE = "root";
        String data =null;

        public Connection getConexion(){
            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
                Statement s = con.createStatement();
                ResultSet result = s.executeQuery("Show tables");
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
                while(result.next()){
                    System.out.println(result.getString(0));
                }
                return con;
            }catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
                return con;
            }
            //con.close();
        }

    public String PruebaMySQL()
    {
        String data =null;
        // Se mete todo en un try por los posibles errores de MySQL
        try
        {
            // Se registra el Driver de MySQL

            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            Connection conexion = DriverManager.getConnection (
                    "jdbc:mysql://localhost/prueba","root", "root");

            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            ResultSet rs = s.executeQuery ("describe prueba");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                data = rs.getString(1) + rs.getString(2)+rs.getString(3);
            }
            return data;
            // Se cierra la conexión con la base de datos.
            //conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return data;
        }
    }
}
