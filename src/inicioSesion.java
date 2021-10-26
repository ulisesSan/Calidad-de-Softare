import com.sun.jdi.connect.spi.Connection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

public class inicioSesion extends JFrame{
    private JPanel inicioSesion;
    private JTextField textField1;
    private JTextField textField2;
    private JButton aceptBtn;
    private JButton cancelBtn;

    public inicioSesion(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(inicioSesion);
        this.pack();
        aceptBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Connector con = new Connector();
                Connection conectar = (Connection) con.getConexion();
                String res = con.toString();
                System.out.println(res);
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new inicioSesion("Inicio Secion");
        frame.setVisible(true);
    }

}
